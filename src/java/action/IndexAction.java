package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class IndexAction extends org.apache.struts.action.Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        HttpSession hs = request.getSession(false);
        String name= (String)request.getAttribute("name");

        if (name != null) {
            String role = (String) hs.getAttribute("role");
            if (role.equalsIgnoreCase("admin")) 
                return mapping.findForward("homeAdmin"); 
            else 
                return mapping.findForward("homeUser");
            
        } else {
            return mapping.findForward("landing2index");
        }
    }
}
