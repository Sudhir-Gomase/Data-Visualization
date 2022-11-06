
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlett")
public class serveltt extends HttpServlet {

    int i;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
         int counter = 0;
        try {
           
            i++;
            PrintWriter out = res.getWriter();
            res.setContentType("text/html");
            String Location = req.getParameter("combo");
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");
            pst = con.prepareStatement("select StudentID,FirstName,LastName,Location,English,Maths,Chemistry,Physics,Biology,History,Geography from studentinfo where Location=?");
            pst.setString(1, Location);
            rs = pst.executeQuery();
            req.getRequestDispatcher("secondpage.jsp").include(req, res);

            out.println("<html><head>  <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n" +
"<link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\"></head><body> <script>\n" +
"                        AOS.init();\n" +
"                    </script>  <div data-aos=\"zoom-out\" class='container pt-1'> <table class='fw-bold  text-center table table-info table-striped'   >");
            out.println("<tr><td colspan=11 class='text-center' " );

            out.println("<center><h2>Data of " + Location + " Location  </h2></center>");
          
            out.println("<tr>");
            out.println("<th>Student ID</th>");
            out.println("<th>First Name</th>");
            out.println("<th>Last Name</th>");
            out.println("<th>Location</th>");
            out.println("<th>English</th>");
            out.println("<th>Maths</th>");
            out.println("<th>Chemistry</th>");
            out.println("<th>Physics</th>");
            out.println("<th>Biology</th>");
            out.println("<th>History</th>");
            out.println("<th>Geography</th>");
            out.println("</tr>");

            while (rs.next()) {
                counter++;
                out.println("<tr>");
                out.println("<td>" + rs.getString("StudentID") + "</td> ");
                out.println("<td>" + rs.getString("FirstName") + "</td> ");
                out.println("<td>" + rs.getString("LastName") + "</td> ");
                out.println("<td>" + rs.getString("Location") + "</td> ");
                out.println("<td>" + rs.getString("English") + "</td> ");
                out.println("<td>" + rs.getString("Maths") + "</td> ");
                out.println("<td>" + rs.getString("Chemistry") + "</td> ");
                out.println("<td>" + rs.getString("Physics") + "</td> ");
                out.println("<td>" + rs.getString("Biology") + "</td> ");
                out.println("<td>" + rs.getString("History") + "</td> ");
                out.println("<td>" + rs.getString("Geography") + "</td> ");

                out.println("</tr>");

            }
            out.println("</table><center><h3 class='text-center text-primary  w-75'>Total " + counter + " Students from "+ Location +"  Location</h3></center></div></body><html>");

        } catch (ClassNotFoundException ex) {

        } catch (Exception e) {
            throw new ServletException("error", e);
        }
    }

    public void destory() {
        i = 0;
    }

}
