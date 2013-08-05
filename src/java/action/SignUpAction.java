package action;

import bean.SignUpBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class SignUpAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        SignUpBean sb = (SignUpBean) form;

        String name = sb.getName();
        String pass = sb.getPassword();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");

            PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            ps.setString(3, "guest");
            int a = ps.executeUpdate();
            if (a == 1) {
                request.setAttribute("signup_msg", "Succesfully registered");
                return mapping.getInputForward();
            } else {
                request.setAttribute("signup_msg", "Username already exists.");
                return mapping.getInputForward();
            }

        } catch (Exception e) {
            request.setAttribute("signup_msg", "Username already exists.");
            return mapping.getInputForward();
        }
    }
}
