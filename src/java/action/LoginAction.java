package action;

import bean.LoginBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;
import javax.servlet.http.HttpSession;

public class LoginAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginBean lb = (LoginBean) form;
        String name = lb.getName();
        String pass = lb.getPassword();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        PreparedStatement ps = con.prepareStatement("select * from login where name=? and password=?");
        ps.setString(1, name);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            HttpSession hs = request.getSession(true);
            hs.setAttribute("name", name);
                return mapping.findForward("menu");

        } else {
            request.setAttribute("login_msg", "Invalid username or password");
            return mapping.getInputForward();
        }

    }
}
