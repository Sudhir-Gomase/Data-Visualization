package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class secondpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <h2>Find Last Name</h2>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <form method=\"get\" action=\"servlett\">    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <h3>Select the Last Name</h3>\n");
      out.write("                        ");

                            Connection con;
                            PreparedStatement pst;
                            ResultSet rs;

                            Class.forName("com.mysql.jdbc.Driver");
                            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");
                            try {
                                pst = con.prepareStatement("select distinct lname from mytable");
                                rs = pst.executeQuery();

                                if (rs.next()) {
                                    out.println("<tr>");
                                    out.println("<td>Choose last Name</td>");
                                    out.println("<td>");
                                    out.println("<select name='combo'>");
                                    do {
                                        String lastname = rs.getString("lname");
                                        out.println("<option value='" + lastname + "'>" + lastname + "</option>");
                                    } while (rs.next());
                                    out.println("</select>");
                                    rs.close();
                                    out.println("</td></tr>");
                                    out.println("</tr><td colspan=2 align=center><input type=submit  value=Retrieve></td></tr>");
                                     out.println("</tr><td colspan=2 align=center><input type=button value=Back onclick='history.back();'> </td></tr>");
                                } else {
                                    out.println("<tr>");
                                    out.println("<td colspan=2 align=right>");
                                    out.println("Sorry table is Empty");
                                    out.println("</td>");
                                }

                                out.println("</form>");
                            } catch (Exception e) {
                                e.printStackTrace(); // Or System.out.println(e);
                            }

                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>                    \n");
      out.write("\n");
      out.write("            </div>      \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
