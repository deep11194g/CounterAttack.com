package action;

import bean.UploadBean;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        
        HttpSession hs = request.getSession(false);
        String name = (String) hs.getAttribute("name");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        
        HttpSession hss = request.getSession(false);
        String role = (String) hss.getAttribute("role");
        
        FormFile file = ub.getUpArticle();
        String filename = (file.getFileName()).substring(0, 7) + "@" + role.charAt(0) + "";
        String path = getServlet().getServletContext().getRealPath("/") + "upload";
        File uploadfolder = new File(path);
        if (!uploadfolder.exists()) {
            uploadfolder.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(path + "/" + filename + ".txt");
        fos.write(file.getFileData());
        fos.close();
        
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
        
        if (role.equalsIgnoreCase("guest")) {
            request.setAttribute("approval_msg", "Article yet to be approved by moderater.");
            return mapping.findForward("back2user");
        } else {
            request.setAttribute("approval_msg", "Article Published.");
            return mapping.findForward("back2admin");
        }
        
        
    }
}
