package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"> </script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://use.fontawesome.com/991034f73a.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            .navbar { background-color: #484848; }\n");
      out.write(".navbar .navbar-nav .nav-link { color: #fff; }\n");
      out.write(".navbar .navbar-nav .nav-link:hover { color: #fbc531; }\n");
      out.write(".navbar .navbar-nav .active > .nav-link { color: #fbc531; }\n");
      out.write("\n");
      out.write("footer a.text-light:hover { color: #fed136!important; text-decoration: none; }\n");
      out.write("footer .cizgi { border-right: 1px solid #535e67; }\n");
      out.write("@media (max-width: 998px) { footer .cizgi { border-right: none; } }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("          <header>\n");
      out.write("\t<!--- Navbar --->\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg\">\n");
      out.write("\t\t<div class=\"container h5\">\n");
      out.write("                    <a class=\"navbar-brand text-white\" style=\"color: coral\"><i class=\"fa fa-graduation-cap fa-lg \"></i> Dashboard Portal</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#nvbCollapse\" aria-controls=\"nvbCollapse\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"nvbCollapse\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item pl-1 active \">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"><i class=\"fa fa-home fa-fw mr-1\"></i>Home</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item  pl-1\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"><i class=\"fa fa-th-list fa-fw mr-1\"></i>Visualization</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item pl-1\">\n");
      out.write("\t\t\t\t\t\t<a class=\"nav-link\" href=\"#\"><i class=\"fa fa-info-circle fa-fw mr-1\"></i>About Us</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!--# Navbar #-->\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("<!--- Footer --->\n");
      out.write("\t\n");
      out.write("\t<!--# Footer #-->\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<footer>\n");
      out.write("\t\t<div class=\"jumbotron jumbotron-fluid bg-secondary p-4 mt-5 mb-0\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-12 col-lg-4 col-xl-4 cizgi\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card bg-secondary border-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body text-light text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"card-title text-white display-4\" style=\"font-size:30px\">Dashboard Portal</h5>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"d-inline lead\">Tüm Hakları Saklıdır © 2018<br>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"text-light d-block lead\">Blog</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4 cizgi\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card bg-secondary border-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<h5 class=\"card-title text-white display-4\" style=\"font-size:30px\">İletişim</h5>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-light d-block lead\" style=\"margin-left: -20px\" href=\"#\"><i class=\"fa fa-phone mr-2\"></i>+90 (000) 000 0 000</a>\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-light d-block lead\" href=\"#\"><i class=\"fa fa-envelope mr-2\"></i>admin@localhost.com</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-sm-12 col-md-6 col-lg-4 col-xl-4\">\n");
      out.write("\t\t\t\t\t\t<div class=\"card bg-secondary border-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body text-center\">\n");
      out.write("\t\t\t\t\t\t\t<h5 class=\"card-title text-white display-4\" style=\"font-size:30px\">Sosyal Medya</h5>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"text-light\" href=\"#\"><i class=\"fa fa-facebook-square fa-fw fa-2x\"></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>-->");
      out.write("\n");
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

                            int total=0,pgno=0,pageNo=0;
                             int start = 0,recordcount=20;
                            try {
                                pgno=request.getParameter("pgno")==null?0:Integer.parseInt(request.getParameter("pgno"));
                                pageNo=pgno;
                                start=pgno*recordcount;
                                Connection con;
                                PreparedStatement pst;
                                ResultSet rs;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");

                                pst = con.prepareStatement("select distinct Location from studentinfo");
                                rs = pst.executeQuery();

                                if (rs.next()) {
                                    out.println("<tr>");
                                    out.println("<td>Choose last Name</td>");
                                    out.println("<td>");
                                    out.println("<select name='combo'  >");
                                    out.println("<option >Select Location</option>");
                                    do {
                                        String Location = rs.getString("Location");
                                        out.println("<option value='" + Location + "'>" + Location + "</option>");
                                    } while (rs.next());
                                    out.println("</select>");
                                    rs.close();
                                    out.println("</td></tr>");
                                    out.println("</tr><td colspan=2 align=center><input type=submit  value=Retrieve></td></tr>");
                                } else {
                                    out.println("<tr>");
                                    out.println("<td colspan=2 align=right>");
                                    out.println("Sorry table is Empty");
                                    out.println("</td>");
                                }

                                out.println("</form>");
                                PreparedStatement stmt = con.prepareStatement("select * from studentinfo limit ?,?");
                                stmt.setInt(1, start);
                                stmt.setInt(2, recordcount);
                                ResultSet rsp = stmt.executeQuery();

                                out.print("<html><body><center class='pt-3'><table border='1' class='  table table-striped' ><tr class='border border-dark-5'><td>Student ID</td><td>First Name	</td><td>Last Name</td><td>Location</td><td>English</td><td>Maths</td><td>Chemistry</td><td>Physics</td><td>Biology</td><td>History</td><td>Geography</td></tr>");
                                while (rsp.next()) {

                                    out.println("<tr class'border border-dark-5'=><td>" + rsp.getString(1) + "</td><td>" + rsp.getString(2) + "</td><td>" + rsp.getString(3) + "</td><td>" + rsp.getString(4) + "</td><td>" + rsp.getString(5) + "</td><td>" + rsp.getString(6) + "</td><td>" + rsp.getString(7) + "</td><td>" + rsp.getString(8) + "</td><td>" + rsp.getString(9) + "</td><td>" + rsp.getString(10) + "</td><td>" + rsp.getString(11) + "</td></tr>");

                                }
                                 PreparedStatement stmt2 = con.prepareStatement("select count(*) from studentinfo");
                                   ResultSet rsp1 = stmt2.executeQuery();
                                   
                                   if(rsp1.next())
                                   {
                                       total=rsp1.getInt(1);
                                   }
                                  
                                    
                                   
//                                      out.println("</table> <center></html></body>");
                                      
                            } catch (Exception e) {
                                e.printStackTrace(); // Or System.out.println(e);
                            }


                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <table>\n");
      out.write("                            <tr><th colspan=\"10\" >\n");
      out.write("                                   ");
  for (int i=0;i<=total/recordcount;i++){
      out.write("\n");
      out.write("<!--                                   <a  href=\"home.jsp?pgno=");
      out.print(i);
      out.write("\" class=\"btn btn-info m-1 ");
      out.print(pgno==i?"active":"");
      out.write(" \">Page");
      out.print(i+1);
      out.write("</a>-->\n");
      out.write("                                   ");
}
      out.write("\n");
      out.write("                                </th>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                                <center>\n");
      out.write("                                <span ><a href=\"home.jsp?pgno=");
      out.print(pageNo-1);
      out.write("\" class=\"btn btn-warning  ");
      out.print((start==0)?"disabled":"");
      out.write("\">Previous</a></span>\n");
      out.write("                                <span><a href=\"home.jsp?pgno=");
      out.print(pageNo+1);
      out.write("\" class=\"btn btn-warning ");
      out.print((start+recordcount>total)?"disabled":"");
      out.write("\">Next</a></span>\n");
      out.write("                   </center></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>                    \n");
      out.write("\n");
      out.write("            </div>      \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
