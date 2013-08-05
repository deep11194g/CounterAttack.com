package action;

import bean.UploadBean;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

public class UploadAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UploadBean ub = (UploadBean) form;

        HttpSession hss = request.getSession(false);
        String role = (String) hss.getAttribute("role");
        String name = (String) hss.getAttribute("name");

        try {
            
            FormFile file = ub.getUpArticle();
            String filename = (file.getFileName()).substring(0, (file.getFileName()).length() - 4) + "@" + role;
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
            PreparedStatement ps = con.prepareStatement("insert into uploadArticle values(?,?,?)");
            ps.setString(1, filename);
            ps.setString(2, name);
            if (role.equalsIgnoreCase("guest")) {
                ps.setString(3, "no");
            } else {
                ps.setString(3, "yes");
            }
            int a = ps.executeUpdate();
            if (a == 1) {
                request.setAttribute("upload_msg", "Article Uploaded.");
            } else {
                request.setAttribute("upload_msg", "Error while uploading.");
            }

            String path = getServlet().getServletContext().getRealPath("/") + "articles";
            File uploadfolder = new File(path);
            if (!uploadfolder.exists()) {
                uploadfolder.mkdir();
            }
            FileOutputStream fos = new FileOutputStream(path + "/"+filename + ".txt");
            fos.write(file.getFileData());
            fos.close();
            
            if (role.equalsIgnoreCase("guest")) {
                request.setAttribute("approval_msg", "Article yet to be approved by moderater.");
                return mapping.findForward("back2user");
            } else {
                request.setAttribute("approval_msg", "Article Published.");
                return mapping.findForward("back2admin");
            }
        } catch (SQLException e) {
            request.setAttribute("approval_msg", "Article already uploaded.");
            if (role.equalsIgnoreCase("guest")) {
                return mapping.findForward("back2user");
            } else {
                return mapping.findForward("back2admin");
            }
        } catch (StringIndexOutOfBoundsException e) {
            request.setAttribute("approval_msg", "No File Selected");
            if (role.equalsIgnoreCase("guest")) {
                return mapping.findForward("back2user");
            } else {
                return mapping.findForward("back2admin");
            }
        } 
        

    }
}
