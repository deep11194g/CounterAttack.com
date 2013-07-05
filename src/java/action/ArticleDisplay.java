package action;

import java.io.File;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ArticleDisplay extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String artName = request.getParameter("artName");
        String name = request.getParameter("name");

        HttpSession hs = request.getSession(false);
        String role = (String) hs.getAttribute("role");

        String path = getServlet().getServletContext().getRealPath("/") + "upload/" + artName + ".txt";
        File f = new File(path);
        FileInputStream fis = new FileInputStream(f);

        int a;
        String article = "";
        while ((a = fis.read()) != -1) {
            article += (char) a; 
        }

        request.setAttribute("article", article);
        request.setAttribute("desc", article.substring(0, 34));
        request.setAttribute("name", name);
        if (role.equalsIgnoreCase("admin")) {
            return mapping.findForward("articleDisplayAdmin");
        } else {
            return mapping.findForward("articleDisplayUser");
        }
    }
}
