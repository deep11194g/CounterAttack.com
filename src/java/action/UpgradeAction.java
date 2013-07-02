package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class UpgradeAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String name = request.getParameter("name");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        PreparedStatement ps = con.prepareStatement("update login set role='admin' where name=?");
        ps.setString(1, name);
        int a = ps.executeUpdate();
        if (a == 1) {
            request.setAttribute("up_msg", "" + name + " has been upgraded to Admin.");
            return mapping.findForward("back2seeUsers");
        } else {
            request.setAttribute("up_msg", "Error occured.");
            return mapping.findForward("back2seeUsers");
        }
    }
}
