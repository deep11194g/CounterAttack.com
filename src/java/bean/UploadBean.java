
package bean;

import org.apache.struts.upload.FormFile;


public class UploadBean extends org.apache.struts.action.ActionForm {
    
    private FormFile upArticle;

    public FormFile getUpArticle() {
        return upArticle;
    }

    public void setUpArticle(FormFile upArticle) {
        this.upArticle = upArticle;
    }
       
}
