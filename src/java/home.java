
import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class home extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        try {

            res.setContentType("text/html;charset=UTF-8");
            PrintWriter out = res.getWriter();

            //jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull [root on Default schema]
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");
            PreparedStatement stmt = con.prepareStatement("select * from studentinfo ");

            ResultSet rs = stmt.executeQuery();

            out.print("<html><head> <link href=\"https://unpkg.com/aos@2.3.1/dist/aos.css\" rel=\"stylesheet\">\n"
                    + "        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n"
                    + "  <script src=\"https://unpkg.com/aos@2.3.1/dist/aos.js\"></script>\n"
                    + "        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js\" integrity=\"sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3\" crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js\" integrity=\"sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk\" crossorigin=\"anonymous\"></script>\n"
                    + "        <script>\n"
                    + "  AOS.init();\n"
                    + "</script> </head> <body><center><table class='table table-primary table-striped' ><tr><td>Student ID</td><td>First Name</td><td>Last Name</td><td>Location</td><td>English</td><td>Maths</td><td>Chemistry</td><td>Physics</td><td>Biology</td><td>History</td><td>Geography</td></tr>");
            while (rs.next()) {

                out.println("<tr><td>" + rs.getString(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6) + "</td><td>" + rs.getString(7) + "</td><td>" + rs.getString(8) + "</td><td>" + rs.getString(9) + "</td><td>" + rs.getString(10) + "</td><td>" + rs.getString(11) + "</td></tr>");

            }

            out.println("</table>  <button>Show More </button> <center></html></body>");
            req.getRequestDispatcher("home.jsp").include(req, res);

        } catch (ClassNotFoundException ex) {
            System.out.print(ex);

        } catch (SQLException ex) {
            System.out.print(ex);
        }

    }
}
