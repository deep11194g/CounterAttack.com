package bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.upload.FormFile;

public class UploadTrollsBean extends org.apache.struts.action.ActionForm {

    private FormFile upTrolls;

    public FormFile getUpTrolls() {
        return upTrolls;
    }

    public void setUpTrolls(FormFile upTrolls) {
        this.upTrolls = upTrolls;
    }
    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUpTrolls() == null) {
            errors.add("upTrolls", new ActionMessage("error.file.required"));
        }
        
        return errors;
    }
}
