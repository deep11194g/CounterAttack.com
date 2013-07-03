package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ArticleListAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        HttpSession hs= request.getSession(false);
        String role=(String)hs.getAttribute("role");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloggers", "root", "password");
        PreparedStatement ps = con.prepareStatement("select * from uploadArticle where status=?");
        ps.setString(1, "yes");

        ResultSet rs = ps.executeQuery();
        Result r = ResultSupport.toResult(rs);
           
        request.setAttribute("result", r);
        if(role.equalsIgnoreCase("admin"))
            return mapping.findForward("articleListShowAdmin");
        else
            return mapping.findForward("articleListShowUser");
        
    }
}
