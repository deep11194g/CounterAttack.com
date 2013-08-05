package action;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class TrollAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        HttpSession hs=request.getSession(false);
        String role=(String) hs.getAttribute("role");
        
        
        String name="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        PreparedStatement ps=con.prepareStatement("select time from trolls where ID=1");
        ResultSet rs=ps.executeQuery();
        if(rs.next())
            name= rs.getString(1);
        
        File f = new File(getServlet().getServletContext().getRealPath("/") + "trolls"+"/"+name+".jpg");
        
        request.setAttribute("path", f.getAbsolutePath());
        request.setAttribute("ID", "1");
        
        if(role.equalsIgnoreCase("admin"))
            return mapping.findForward("trollsAdmin");
        else
            return mapping.findForward("trollsUser");
        
        
    }
}
