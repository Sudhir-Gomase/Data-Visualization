package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"> </script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://use.fontawesome.com/991034f73a.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .navbar { background-color: #484848; }\n");
      out.write("            .navbar .navbar-nav .nav-link { color: #fff; }\n");
      out.write("            .navbar .navbar-nav .nav-link:hover { color: #fbc531; }\n");
      out.write("            .navbar .navbar-nav .active > .nav-link { color: #fbc531; }\n");
      out.write("\n");
      out.write("            footer a.text-light:hover { color: #fed136!important; text-decoration: none; }\n");
      out.write("            footer .cizgi { border-right: 1px solid #535e67; }\n");
      out.write("            @media (max-width: 998px) { footer .cizgi { border-right: none; } }\n");
      out.write("                    </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\" bg-secondary p-4 mt-5 mb-0 pb-5 fw-bolder\" style=\"\">\n");
      out.write("\t\t\t<div class=\"h-100 fw-bold\">\n");
      out.write("\t\t\t\t<div class=\"row h-100\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-12 col-lg-4 col-xl-4 cizgi \">\n");
      out.write("\t\t\t\t\t\t<div class=\"card bg-secondary border-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body text-light text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"card-title text-white fw-bolder display-4\" style=\"font-size:30px\">Dashboard Portal</h5>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"d-inline lead\">Visit On<br>\n");
      out.write("                                                            <a href=\"https://sudhir-gomase.github.io/Portfolio/\" class=\"text-light d-block lead\"><i class=\"fa fa-link\" aria-hidden=\"true\" style=\"color: yellow\"></i> Sudhir Gomase</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 cizgi\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card bg-secondary border-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"card-title text-white display-4 fw-bolder\" style=\"font-size:30px\">Contact with </h5>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-light d-block lead\" style=\"margin-left: -20px\" href=\"#\"><i class=\"fa fa-phone mr-2 \"style=\"color: magenta\"></i>+91 8108320614</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-light d-block lead\" href=\"#\"><i class=\"fa fa-envelope mr-2\" style=\"color: cornsilk\"></i>Sudhirgomase2109@gmail.com</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card bg-secondary border-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"card-title text-white display-4 fw-bolder \" style=\"font-size:30px\">Follow On</h5>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                                        <a class=\"text-light\" href=\"https://www.facebook.com/sudhir.gomase.7/\"><i class=\"m-1 fa fa-facebook-square fa-fw fa-2x\" style=\"color: cornflowerblue\"></i></a>\n");
      out.write("                                                                        <a class=\"text-light\" href=\"https://twitter.com/i/flow/login\"><i class=\"fa fa-twitter fa-2x\" style=\"color: deepskyblue\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                                                        <a class=\"text-light\" href=\"https://github.com/Sudhir-Gomase\"><i class=\"m-1  fa fa-github fa-2x\" aria-hidden=\"true\" style=\"color: greenyellow\"></i></a>\n");
      out.write("                                                                     <a class=\"text-light\" href=\"https://www.linkedin.com/in/sudhir-gomase-95210b201/?originalSubdomain=in\"> <i class=\"m-1  fa fa-linkedin fa-2x \"style=\"color: dodgerblue\" aria-hidden=\"true\"></i></a>\n");
      out.write("                                                                    <a class=\"text-light\" href=\"https://www.youtube.com/channel/UCX5nnGOqKI7FEK8UNBUdSdA\"> <i class=\"m-1  fa fa-youtube-play fa-2x\" aria-hidden=\"true\" style=\"color: pink\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
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
