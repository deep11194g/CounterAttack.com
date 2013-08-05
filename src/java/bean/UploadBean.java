
package bean;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;


public class UploadBean extends org.apache.struts.action.ActionForm {
    
    private FormFile upArticle;

    public FormFile getUpArticle() {
        return upArticle;
    }

    public void setUpArticle(FormFile upArticle) {
        this.upArticle = upArticle;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUpArticle() == null) {
            errors.add("upArticle", new ActionMessage("error.file.required"));
        }
        
        return errors;
    }
       
}
