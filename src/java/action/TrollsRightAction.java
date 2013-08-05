package action;

import java.io.File;
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

public class TrollsRightAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {


        HttpSession hs = request.getSession(false);
        String role = (String) hs.getAttribute("role");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");

        PreparedStatement ps = con.prepareStatement("select count(*) from trolls");
        ResultSet rs = ps.executeQuery();
        rs.next();
        int max = rs.getInt(1);

        int presentID = Integer.parseInt(request.getParameter("ID"));
        if (presentID != max) {
            presentID++;
        } else {
            presentID = 1;
        }

        PreparedStatement p = con.prepareStatement("select time from trolls where ID=?");
        p.setInt(1, presentID);
        ResultSet r = p.executeQuery();
        
        r.next();
        File f = new File(getServlet().getServletContext().getRealPath("/") + "trolls" + "/" + r.getString(1) + ".jpg");

        request.setAttribute("path", f.getAbsolutePath());
        request.setAttribute("ID", presentID);

        if (role.equalsIgnoreCase("admin")) {
            return mapping.findForward("trollsAdmin");
        } else {
            return mapping.findForward("trollsUser");
        }
    }
}
