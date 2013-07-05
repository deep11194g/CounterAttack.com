
package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class PendingYesAction extends org.apache.struts.action.Action {


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String artName = request.getParameter("artName");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        
        PreparedStatement ps = con.prepareStatement("update uploadArticle set status=? where artName=?");
        ps.setString(1, "yes");
        ps.setString(2, artName);
        int a = ps.executeUpdate();
        
        if (a == 1) 
            request.setAttribute("msg", artName + " has been aproved and published.");
        
        return mapping.findForward("back2pending");
    }
}
