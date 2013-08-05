package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manage_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/struts-html.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_method_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_file_style_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_submit_value_style_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_html = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_method_enctype_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_file_style_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_submit_value_style_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_html.release();
    _jspx_tagPool_h_form_method_enctype_action.release();
    _jspx_tagPool_h_file_style_property_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
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
        out.write("    <head>\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
        out.write("        <title>Upload</title>\n");
        out.write("    </head>\n");
        out.write("    <body>\n");
        out.write("        <center>\n");
        out.write("        ");
        if (_jspx_meth_h_form_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_html_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            <h1 style=\"text-align:center;color:black;text-decoration:underline;\">Approve Pending Articles?</h1>\n");
        out.write("            <div>\n");
        out.write("                <center>\n");
        out.write("                <ul style=\"position:relative;left:20px;line-height:150%;\">\n");
        out.write("                <table>\n");
        out.write("                    <tr>\n");
        out.write("                        <th>Article Name</th>\n");
        out.write("                        <th>User's Name</th>\n");
        out.write("                        <th>Options</th>\n");
        out.write("                    </tr>                    \n");
        out.write("                    \n");
        out.write("                    <tr>\n");
        out.write("                        <c:forEach var=\"data\" items=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.result.rows}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.artName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td> \n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td> \n");
        out.write("                            <td>\n");
        out.write("                                <a href=\"yesArt.do?name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.artName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">Yes</a>, \n");
        out.write("                                <a href=\"notnowArt.do?name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.artName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">Not Now</a>, \n");
        out.write("                                <a href=\"deleArt.do?name=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.artName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">Delete</a>.\n");
        out.write("                            </td>\n");
        out.write("                        </c:forEach>\n");
        out.write("                    </tr>\n");
        out.write("                </table>\n");
        out.write("                </center>\n");
        out.write("            </div>\n");
        out.write("            \n");
        out.write("    </body>\n");
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

  private boolean _jspx_meth_h_form_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_html_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_method_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_html_0);
    _jspx_th_h_form_0.setAction("upload.do");
    _jspx_th_h_form_0.setMethod("post");
    _jspx_th_h_form_0.setEnctype("multipart/form-data");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            Select: ");
        if (_jspx_meth_h_file_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <font color=\"red\" size=\"5\">(.txt only)<br><br>\n");
        out.write("            ");
        if (_jspx_meth_h_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            <br><font color=\"blue\" size=\"5\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.upload_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </font>\n");
        out.write("            <br><font color=\"red\" size=\"4\"> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.approval_msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" </font>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_method_enctype_action.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_method_enctype_action.reuse(_jspx_th_h_form_0);
    return false;
  }

  private boolean _jspx_meth_h_file_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:file
    org.apache.struts.taglib.html.FileTag _jspx_th_h_file_0 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_h_file_style_property_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_h_file_0.setPageContext(_jspx_page_context);
    _jspx_th_h_file_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_file_0.setProperty("upArticle");
    _jspx_th_h_file_0.setStyle("font-size:20px;width:300px;height:50px;");
    int _jspx_eval_h_file_0 = _jspx_th_h_file_0.doStartTag();
    if (_jspx_th_h_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_file_style_property_nobody.reuse(_jspx_th_h_file_0);
      return true;
    }
    _jspx_tagPool_h_file_style_property_nobody.reuse(_jspx_th_h_file_0);
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
    _jspx_th_h_submit_0.setValue("Submit article");
    _jspx_th_h_submit_0.setStyle("height:30px;width:130px;font-size:20px;");
    int _jspx_eval_h_submit_0 = _jspx_th_h_submit_0.doStartTag();
    if (_jspx_th_h_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_submit_value_style_nobody.reuse(_jspx_th_h_submit_0);
      return true;
    }
    _jspx_tagPool_h_submit_value_style_nobody.reuse(_jspx_th_h_submit_0);
    return false;
  }
}
