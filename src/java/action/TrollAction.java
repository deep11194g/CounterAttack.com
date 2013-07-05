package action;

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
        
        int rand=(int)(Math.random()*6);
        
        request.setAttribute("no", rand);
        
        if(role.equalsIgnoreCase("admin"))
            return mapping.findForward("trollsAdmin");
        else
            return mapping.findForward("trollsUser");
        
        
    }
}
