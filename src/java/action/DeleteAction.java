package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class DeleteAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String name = request.getParameter("name");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        PreparedStatement ps = con.prepareStatement("delete from login where name=?");
        ps.setString(1, name);
        int a = ps.executeUpdate();
        if (a == 1) {
            request.setAttribute("del_msg", "Record of " + name + " has been deleted.");
            return mapping.findForward("back2seeUsers");
        } else {
            request.setAttribute("del_msg", "Error occured in deleteion.");
            return mapping.findForward("back2seeUsers");
        }
    }
}
