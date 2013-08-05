package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_javascript_formName_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_onsubmit_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_text_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_password_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_submit_value_style_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_javascript_formName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_onsubmit_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_text_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_password_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_submit_value_style_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_html.release();
    _jspx_tagPool_h_javascript_formName_nobody.release();
    _jspx_tagPool_h_form_onsubmit_action.release();
    _jspx_tagPool_h_text_style_property_nobody.release();
    _jspx_tagPool_h_password_style_property_nobody.release();
    _jspx_tagPool_h_submit_value_style_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_h_html_0(_jspx_page_context))
        return;
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_h_html_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:html
    org.apache.struts.taglib.html.HtmlTag _jspx_th_h_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_h_html.get(org.apache.struts.taglib.html.HtmlTag.class);
    _jspx_th_h_html_0.setPageContext(_jspx_page_context);
    _jspx_th_h_html_0.setParent(null);
    int _jspx_eval_h_html_0 = _jspx_th_h_html_0.doStartTag();
    if (_jspx_eval_h_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("    <head>\n");
        out.write("        <title>Index</title>\n");
        out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\"/>\n");
        out.write("        <style>\n");
        out.write("            #signin{position:absolute;right:20px;width:600px;height:300px;text-align:right;}\n");
        out.write("            #newusr{position:relative;top:400px;margin-left:auto;margin-right:auto;width:1200px;height:80px;}\n");
        out.write("\n");
        out.write("        </style>\n");
        out.write("    </head>\n");
        out.write("\n");
        out.write("    <body>\n");
        out.write("        <div>\n");
        out.write("            <a href=\"landing.jsp\"><img src=\"images/logo.png\" style=\"float:left;\"></a>\n");
        out.write("            <hr style=\"clear:left\">\n");
        out.write("        </div>\n");
        out.write("               \n");
        out.write("        <div id=\"signin\">\n");
        out.write("            <img src=\"images/login.png\">\n");
        out.write("            ");
        if (_jspx_meth_h_javascript_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </div>\n");
        out.write("            \n");
        out.write("        <div id=\"newusr\">\n");
        out.write("            <center><img src=\"images/sign_up.png\"></center>\n");
        out.write("            ");
        if (_jspx_meth_h_javascript_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_h_form_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </div>\n");
        out.write("     \n");
        out.write("    </body>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_h_html_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_html.reuse(_jspx_th_h_html_0);
      return true;
    }
    _jspx_tagPool_h_html.reuse(_jspx_th_h_html_0);
    return false;
  }

  private boolean _jspx_meth_h_javascript_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_h_javascript_0 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_h_javascript_formName_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_h_javascript_0.setPageContext(_jspx_page_context);
    _jspx_th_h_javascript_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_javascript_0.setFormName("LoginBean");
    int _jspx_eval_h_javascript_0 = _jspx_th_h_javascript_0.doStartTag();
    if (_jspx_th_h_javascript_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_0);
      return true;
    }
    _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_0);
    return false;
  }

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_form_0.setAction("signin.do");
    _jspx_th_h_form_0.setOnsubmit("return validateLoginBean(this)");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <p><img src=\"images/login_username.png\">");
        if (_jspx_meth_h_text_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("                <p><img src=\"images/login_password.png\">");
        if (_jspx_meth_h_password_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("                ");
        if (_jspx_meth_h_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                <br><font color=\"red\" size=\"5\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.login_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </font>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_onsubmit_action.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_onsubmit_action.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_text_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_h_text_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_text_0.setPageContext(_jspx_page_context);
    _jspx_th_h_text_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_text_0.setProperty("name");
    _jspx_th_h_text_0.setStyle("font-size:20px;width:200px;height:50px;margin-left:10px;");
    int _jspx_eval_h_text_0 = _jspx_th_h_text_0.doStartTag();
    if (_jspx_th_h_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_text_style_property_nobody.reuse(_jspx_th_h_text_0);
      return true;
    }
    _jspx_tagPool_h_text_style_property_nobody.reuse(_jspx_th_h_text_0);
    return false;
  }

  private boolean _jspx_meth_h_password_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_h_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_h_password_style_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_h_password_0.setPageContext(_jspx_page_context);
    _jspx_th_h_password_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_password_0.setProperty("password");
    _jspx_th_h_password_0.setStyle("font-size:20px;width:200px;height:50px;margin-left:10px;");
    int _jspx_eval_h_password_0 = _jspx_th_h_password_0.doStartTag();
    if (_jspx_th_h_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_password_style_property_nobody.reuse(_jspx_th_h_password_0);
      return true;
    }
    _jspx_tagPool_h_password_style_property_nobody.reuse(_jspx_th_h_password_0);
    return false;
  }

  private boolean _jspx_meth_h_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_h_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_h_submit_value_style_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_h_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_h_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_submit_0.setValue("Log In");
    _jspx_th_h_submit_0.setStyle("height:50px;width:80px;font-size:20px;");
    int _jspx_eval_h_submit_0 = _jspx_th_h_submit_0.doStartTag();
    if (_jspx_th_h_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_submit_value_style_nobody.reuse(_jspx_th_h_submit_0);
      return true;
    }
    _jspx_tagPool_h_submit_value_style_nobody.reuse(_jspx_th_h_submit_0);
    return false;
  }

  private boolean _jspx_meth_h_javascript_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:javascript
    org.apache.struts.taglib.html.JavascriptValidatorTag _jspx_th_h_javascript_1 = (org.apache.struts.taglib.html.JavascriptValidatorTag) _jspx_tagPool_h_javascript_formName_nobody.get(org.apache.struts.taglib.html.JavascriptValidatorTag.class);
    _jspx_th_h_javascript_1.setPageContext(_jspx_page_context);
    _jspx_th_h_javascript_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_javascript_1.setFormName("SignUpBean");
    int _jspx_eval_h_javascript_1 = _jspx_th_h_javascript_1.doStartTag();
    if (_jspx_th_h_javascript_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_1);
      return true;
    }
    _jspx_tagPool_h_javascript_formName_nobody.reuse(_jspx_th_h_javascript_1);
    return false;
  }

  private boolean _jspx_meth_h_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_onsubmit_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_1.setPageContext(_jspx_page_context);
    _jspx_th_h_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_form_1.setAction("signup.do");
    _jspx_th_h_form_1.setOnsubmit("return validateSignUpBean(this)");
    int _jspx_eval_h_form_1 = _jspx_th_h_form_1.doStartTag();
    if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <p><img src=\"images/username_signup.png\">");
        if (_jspx_meth_h_text_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <img src=\"images/password_signup.png\">");
        if (_jspx_meth_h_password_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_h_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <font color=\"red\" size=\"5\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.signup_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </font> </p>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_h_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_onsubmit_action.reuse(_jspx_th_h_form_1);
      return true;
    }
    _jspx_tagPool_h_form_onsubmit_action.reuse(_jspx_th_h_form_1);
    return false;
  }

  private boolean _jspx_meth_h_text_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:text
    org.apache.struts.taglib.html.TextTag _jspx_th_h_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_h_text_style_property_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_h_text_1.setPageContext(_jspx_page_context);
    _jspx_th_h_text_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_h_text_1.setProperty("name");
    _jspx_th_h_text_1.setStyle("font-size:20px;position:relative;top:-10px;width:200px;height:50px;margin-left:10px");
    int _jspx_eval_h_text_1 = _jspx_th_h_text_1.doStartTag();
    if (_jspx_th_h_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_text_style_property_nobody.reuse(_jspx_th_h_text_1);
      return true;
    }
    _jspx_tagPool_h_text_style_property_nobody.reuse(_jspx_th_h_text_1);
    return false;
  }

  private boolean _jspx_meth_h_password_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:password
    org.apache.struts.taglib.html.PasswordTag _jspx_th_h_password_1 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_h_password_style_property_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_h_password_1.setPageContext(_jspx_page_context);
    _jspx_th_h_password_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_h_password_1.setProperty("password");
    _jspx_th_h_password_1.setStyle("font-size:20px;position:relative;top:-10px;width:200px;height:50px;margin-left:10px");
    int _jspx_eval_h_password_1 = _jspx_th_h_password_1.doStartTag();
    if (_jspx_th_h_password_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_password_style_property_nobody.reuse(_jspx_th_h_password_1);
      return true;
    }
    _jspx_tagPool_h_password_style_property_nobody.reuse(_jspx_th_h_password_1);
    return false;
  }

  private boolean _jspx_meth_h_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_h_submit_1 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_h_submit_value_style_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_h_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_h_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_h_submit_1.setValue("Sign Up");
    _jspx_th_h_submit_1.setStyle("text-align:center;font-size:20px;position:relative;top:-10px;height:50px;width:90px;");
    int _jspx_eval_h_submit_1 = _jspx_th_h_submit_1.doStartTag();
    if (_jspx_th_h_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_submit_value_style_nobody.reuse(_jspx_th_h_submit_1);
      return true;
    }
    _jspx_tagPool_h_submit_value_style_nobody.reuse(_jspx_th_h_submit_1);
    return false;
  }
}
