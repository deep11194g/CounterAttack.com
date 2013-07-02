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

    private static final String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        UploadBean ub = (UploadBean) form;

        HttpSession hs = request.getSession(false);
        String name = (String) hs.getAttribute("name");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");

        PreparedStatement p = con.prepareStatement("select from role from login where name=?");
        p.setString(1, name);
        ResultSet rs = p.executeQuery();

        FormFile file = ub.getUpArticle();
        String filename = file.getFileName();
        String path = getServlet().getServletContext().getRealPath("/") + "upload";
        File uploadfolder = new File(path);
        if (!uploadfolder.exists()) {
            uploadfolder.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(path + "/" + filename);
        fos.write(file.getFileData());
        fos.close();

        PreparedStatement ps = con.prepareStatement("insert into uploadArticle values(?,?,?)");

        ps.setString(1, filename);
        ps.setString(2, name);

        if (rs.getString(1).equalsIgnoreCase("guest")) {
            ps.setString(3, "no");
        } else {
            ps.setString(3, "yes");
        }

        int a = ps.executeUpdate();
        if (a == 1) {
            if (rs.getString(1).equalsIgnoreCase("guest")) 
            request.setAttribute("upload_msg", "Article Uploaded.");
        } else
            request.setAttribute("upload_msg", "Error while uploading.");
                
            return mapping.findForward("back2upload");
        
    }
}
