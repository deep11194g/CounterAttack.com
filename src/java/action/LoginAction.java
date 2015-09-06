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
      
    public static String stringToHexString(String s) {
        try {
            byte[] b = s.getBytes("UTF-16");
            String result = "";
            for (int i = 0; i < b.length; i++) {
                result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
            }
            return result;
        } catch (Exception e) {
            return "";
        }
    }
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginBean lb = (LoginBean) form;
        String name = lb.getName();
        String pass = lb.getPassword();

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        PreparedStatement ps = con.prepareStatement("select role from login where name=? and password=?");
        ps.setString(1, name);
        ps.setString(2, stringToHexString(pass));
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            HttpSession hs = request.getSession(true);
            hs.setAttribute("name", name);
            hs.setAttribute("role", rs.getString(1));
            if(rs.getString(1).equalsIgnoreCase("admin"))
                return mapping.findForward("admin");
            else
                return mapping.findForward("user");

        } else {
            request.setAttribute("login_msg", "Invalid username or password");
            return mapping.getInputForward();
        }

    }
}
