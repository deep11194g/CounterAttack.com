package action;

import bean.UploadTrollsBean;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

public class UploadTrollsAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        UploadTrollsBean utb = (UploadTrollsBean) form;

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        try {
            FormFile file = utb.getUpTrolls();
            String filen = (file.getFileName()).substring(0, (file.getFileName()).length() - 4) + "@";

            PreparedStatement psShift = con.prepareStatement("update trolls set ID=? where ID=?");
            PreparedStatement ps = con.prepareStatement("select ID from trolls");
            ResultSet r = ps.executeQuery();

            while (r.next()) {
                int id = r.getInt(1);
                psShift.setInt(2, id);
                psShift.setInt(1, ++id);
                psShift.executeUpdate();
            }

            //GregorianCalendar future=new GregorianCalendar(2094, 0, 11);
            GregorianCalendar g = new GregorianCalendar();

            String filename = "" + g.getTimeInMillis();
            String path = getServlet().getServletContext().getRealPath("/") + "trolls";
            File uploadfolder = new File(path);
            if (!uploadfolder.exists()) {
                uploadfolder.mkdir();
            }
            FileOutputStream fos = new FileOutputStream(path + "/" + filename + ".jpg");
            fos.write(file.getFileData());
            fos.close();

            PreparedStatement psup = con.prepareStatement("insert into trolls values(?,?)");
            psup.setInt(1, 1);
            psup.setString(2, filename);

            int a = psup.executeUpdate();
            if (a == 1) {
                request.setAttribute("upload_msg", "Troll Pic Uploaded.");
            } else {
                request.setAttribute("upload_msg", "Error while uploading.");
            }
            return mapping.findForward("back2trollsUpload");
        } catch (SQLException e) {
            request.setAttribute("upload_msg", "Article already uploaded.");
            return mapping.findForward("back2trollsUpload");
        } catch (StringIndexOutOfBoundsException e) {
            request.setAttribute("upload_msg", "No File Selected");
            return mapping.findForward("back2trollsUpload");
        }
        
    }
}
