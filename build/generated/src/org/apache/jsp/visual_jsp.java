package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.tools.DocumentationTool.Location;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public final class visual_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("        <title>Visual Page</title>\n");
      out.write("        ");

            Map<String, String> result = new HashMap<>();

        
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("            AOS.init();\n");
      out.write("        </script>\n");
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
      out.write("                    <a class=\"navbar-brand text-white\" style=\"color: coral\"><i class=\"fa fa-graduation-cap fa-lg \" style=\"color: darkorange\"></i> Dashboard Portal</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#nvbCollapse\" aria-controls=\"nvbCollapse\">\n");
      out.write("\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"nvbCollapse\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item pl-1 active \">\n");
      out.write("                                            <a class=\"nav-link\" href=\"home.jsp\"><i class=\"fa fa-home fa-fw mr-1\"></i>Home</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item  pl-1\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"visual.jsp\"><i class=\"fa fa-th-list fa-fw mr-1\"></i>Visualization</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item pl-1\">\n");
      out.write("                                            <a class=\"nav-link \" style=\"color: aqua\" href=\"https://drive.google.com/file/d/1gc959v0lKz976fKp3QnYDAoF9fAKuKty/view?usp=sharing\"><i class=\"fa fa-info-circle fa-fw mr-1\"></i>About Us</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("                                        <li class=\"nav-item pl-1\">\n");
      out.write("                                            <a class=\"nav-link \" style=\"color: #ccc\" href=\"login.html\"><i class=\"fa fa-sign-out\" aria-hidden=\"true\"></i> Log Out</a>\n");
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
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br>\n");
      out.write("            <div class=\"form-group\" >\n");
      out.write("                <form  action=\"\" >    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div  data-aos=\"fade-down\">\n");
      out.write("                            <h1 class=\"text-center  text-info\" style=\"font-family: fantasy;font-size: 55px;\">Data visualization</h1>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        ");
                            int total = 0, pgno = 0, pageNo = 0, pass, fail;
                            int start = 0, recordcount = 20;
                            try {
                                pgno = request.getParameter("pgno") == null ? 0 : Integer.parseInt(request.getParameter("pgno"));
                                pageNo = pgno;
                                start = pgno * recordcount;
                                Connection con;
                                PreparedStatement pst;
                                ResultSet rs;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");
                                PreparedStatement stmt2 = con.prepareStatement("SELECT SUM((( English + Maths + Chemistry + Physics + Biology + History + Geography)/7 <= 3.5)) AS fail,SUM((( English + Maths + Chemistry + Physics + Biology + History + Geography)/7 > 3.5)) as pass, Location FROM studentinfo group by Location;");
                                ResultSet rsp1 = stmt2.executeQuery();

                                while (rsp1.next()) {
                                    Gson gsonObj = new Gson();
                                    Map<Object, Object> map = null;
                                    List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();

                                    map = new HashMap<Object, Object>();
                                    map.put("label", "pass");
                                    map.put("y", rsp1.getInt(2));
                                    list.add(map);
                                    map = new HashMap<Object, Object>();
                                    map.put("label", "fail");
                                    map.put("y", rsp1.getInt(1));
                                    list.add(map);

                                    String dataPoints = gsonObj.toJson(list);
                                    result.put(rsp1.getString(3), dataPoints);

                                    pass = rsp1.getInt(1);
                                }
                                Gson gson = new Gson(); 
                                String json = gson.toJson(result);
                                out.println("<input type='hidden' id='userId' name='userId' value='" + json + "'/>");

                                pst = con.prepareStatement("select distinct Location from studentinfo");
                                rs = pst.executeQuery();

                                if (rs.next()) {

                                    out.println("<div data-aos='flip-up'>");

                                    out.println("<center>");
                                    out.println("<h4>Select Location</h4>");
                                    out.println("<select class='form-select w-25 text-center' name='combo'   id='data'   >");
                                    out.println("<option>Select Location</option>");
                                    do {
                                        String Location = rs.getString("Location");
                                        out.println("<option class='h6 m-1 border' value='" + Location + "'>" + Location + "</option>");
                                    } while (rs.next());
                                    out.println("</select>");
                                    rs.close();

                                    out.println("<td colspan=2 align=center><button type='submit'  class='btn btn-outline-secondary m-2' onclick='return myFunction()'  value=Retrieve>Get Data</button></td></tr>");
                                } else {
                                    out.println("<tr>");
                                    out.println("<td colspan=2 align=right>");
                                    out.println("Sorry table is Empty");
                                    out.println("</td></center></div>");
                                }

                                out.println("</form>");

                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div></form>\n");
      out.write("\n");
      out.write("            </div>      \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            myFunction = function (e) {\n");
      out.write("                var city = document.getElementById(\"data\").value;\n");
      out.write("                var hiddata = document.getElementById(\"userId\").value;\n");
      out.write("             \n");
      out.write("              \n");
      out.write("                var locationData = JSON.parse(hiddata);\n");
      out.write("               CanvasJS.addColorSet(\"Shades\",\n");
      out.write("                [//colorSet Array\n");
      out.write("\n");
      out.write("                \"#3CB371\", \n");
      out.write("                \"#c0504e\"\n");
      out.write("                ]);\n");
      out.write("                 CanvasJS.addColorSet(\"stackshades\",\n");
      out.write("                [//colorSet Array\n");
      out.write("\n");
      out.write("                \"#3CB371\", \n");
      out.write("                \"#c0504e\"\n");
      out.write("                ]);\n");
      out.write("                var chart = new CanvasJS.Chart(\"chartContainer\", {\n");
      out.write("                     colorSet:  \"Shades\",\n");
      out.write("                    animationEnabled: true,\n");
      out.write("                    theme: \"light1\",\n");
      out.write("                    title: {\n");
      out.write("                        text: \"Student Record in Donutchart\"\n");
      out.write("                    },\n");
      out.write("                    subtitles: [{\n");
      out.write("                            text: \"Students\"\n");
      out.write("                        }],\n");
      out.write("                    data: [{\n");
      out.write("                            type: \"doughnut\",\n");
      out.write("                            yValueFormatString: \"#,##0\",\n");
      out.write("                            indexLabel: \"{label}: {y} students\",\n");
      out.write("                            toolTipContent: \"{y} Students\",\n");
      out.write("                            dataPoints: JSON.parse(locationData[city])\n");
      out.write("                        }]\n");
      out.write("                });\n");
      out.write("                chart.render();\n");
      out.write("                 var bar = new CanvasJS.Chart(\"barContainer\", {\n");
      out.write("                       colorSet:  \"stackshades\",\n");
      out.write("                    animationEnabled: true,\n");
      out.write("                    theme: \"light1\",\n");
      out.write("                    title: {\n");
      out.write("                        text: \"Student Record in Stack Barchart \"\n");
      out.write("                    },\n");
      out.write("                    subtitles: [{\n");
      out.write("                            text: \"Students\"\n");
      out.write("                        }],\n");
      out.write("                    data: [{\n");
      out.write("                            type: \"stackedColumn\",\n");
      out.write("                            yValueFormatString: \"#,##0\",\n");
      out.write("                            indexLabel: \"{label}: {y} students\",\n");
      out.write("                            toolTipContent: \"{y} Students\",\n");
      out.write("                            dataPoints: JSON.parse(locationData[city])\n");
      out.write("                        }]\n");
      out.write("                });\n");
      out.write("                bar.render();\n");
      out.write("                e = e || window.event;\n");
      out.write("                e.preventDefault();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div id=\"chartContainer\" class=\"col-md-6\" style=\"height: 380px; width: 100%;\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div id=\"barContainer\" class=\"col-md-6\" style=\"height: 380px; width: 100%;\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <script src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"></script>\n");
      out.write("        ");
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
      out.write(".navbar .navbar-nav .nav-link { color: #fff; }\n");
      out.write(".navbar .navbar-nav .nav-link:hover { color: #fbc531; }\n");
      out.write(".navbar .navbar-nav .active > .nav-link { color: #fbc531; }\n");
      out.write("\n");
      out.write("footer a.text-light:hover { color: #fed136!important; text-decoration: none; }\n");
      out.write("footer .cizgi { border-right: 1px solid #535e67; }\n");
      out.write("@media (max-width: 998px) { footer .cizgi { border-right: none; } }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <footer class=\"\">\n");
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
