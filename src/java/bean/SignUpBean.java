package bean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class SignUpBean extends org.apache.struts.action.ActionForm {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String string) {
        name = string;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}