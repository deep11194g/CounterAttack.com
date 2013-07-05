package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>CounterAttack</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <style>\n");
      out.write("            ul#nav {margin: 0 0 0 200px;}\n");
      out.write("            ul.drop a { display:block; color: #fff; font-family: Verdana; font-size: 14px; text-decoration: none;}\n");
      out.write("            ul.drop, ul.drop li, ul.drop ul { list-style: none; margin: 0; padding: 0; }\n");
      out.write("            ul.drop { position: relative; z-index: 597; float: left; }\n");
      out.write("            ul.drop li { float: left; line-height: 1.3em; vertical-align: middle; zoom: 1;}\n");
      out.write("            ul.drop li.hover, ul.drop li:hover { position: relative; z-index: 599; cursor: default; }\n");
      out.write("            ul.drop ul { visibility: hidden; position: absolute; top: 100%; right: 0; z-index: 598;}\n");
      out.write("            ul.drop ul li { float: none; }\n");
      out.write("            ul.drop ul ul { top: -2px; left: 100%; }\n");
      out.write("            ul.drop li:hover > ul { visibility: visible }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <a href=\"landing.jsp\"><img src=\"images/logo.png\" style=\"float:left;\"></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"float:right;height:30px\">\n");
      out.write("            <ul id=\"nav\" class=\"drop\">\n");
      out.write("                <li><a href=\"signin.do\"><img src=\"images/home_tab.png\" style=\"margin-right:5px;\"></a></li>\n");
      out.write("                <li><img src=\"images/options/admin_option_head.png\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"seeUsers.do\"><img src=\"images/options/see_details.png\" style=\"margin-top:-3px\"></a></li>\n");
      out.write("                        <li><a href=\"uploadAdmin.do\"><img src=\"images/options/u_upload_article.png\" style=\"margin-top:-3px\"></a></li>\n");
      out.write("                        <li><a href=\"logout.do\"><img src=\"images/options/logout.png\" style=\"margin-top:-3px\"></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
