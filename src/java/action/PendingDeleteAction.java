package action;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class PendingDeleteAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String artName = request.getParameter("artName");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");

        PreparedStatement ps = con.prepareStatement("delete from uploadArticle where artName=?");
        ps.setString(1, artName);
        int a = ps.executeUpdate();

        File f = new File(getServlet().getServletContext().getRealPath("/") + "article" + artName + ".txt");
        boolean b=f.delete();
        f.deleteOnExit();

        if (a == 1 & b) {
            request.setAttribute("msg", artName + " is deleted.");
        }

        return mapping.findForward("back2pending");
    }
}
