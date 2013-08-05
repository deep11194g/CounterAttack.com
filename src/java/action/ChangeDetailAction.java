package action;

import bean.ChangeDetailBean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ChangeDetailAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ChangeDetailBean cb = (ChangeDetailBean) form;

        String pass = cb.getPassword();

        HttpSession hs = request.getSession(false);
        String name = (String) hs.getAttribute("name");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");

            PreparedStatement ps = con.prepareStatement("update login set password=? where name=?");
            ps.setString(1, pass);
            ps.setString(2, name);
            int a = ps.executeUpdate();
            if (a == 1) {
                request.setAttribute("change_msg", "Password Succesfully changed");
                return mapping.findForward("back2changeDetail");
            } else {
                request.setAttribute("change_msg", "Change not done.");
                return mapping.findForward("back2changeDetail");
            }

        } catch (Exception e) {
            request.setAttribute("change_msg", "Change not done.");
            return mapping.findForward("back2changeDetail");
        }
    }
}
