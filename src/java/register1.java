import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register1 extends HttpServlet {

  
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
         PrintWriter out = res.getWriter();

        // build HTML code
        try {
             res.setContentType("text/html;charset=UTF-8");
              
                String fname = req.getParameter("fname");
                
                String lname = req.getParameter("lname");
                String email = req.getParameter("email");
                String phoneno = req.getParameter("phoneno");
                String pass1 = req.getParameter("pass1");
                String pass2 = req.getParameter("pass2");
                 String gender = req.getParameter("gender");
                 
                   
             //jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull [root on Default schema]
            Class.forName("com.mysql.jdbc.Driver");
             
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");
            PreparedStatement stmt = con.prepareStatement("insert into userinfo values(?,?,?,?,?,?,?)");
            stmt.setString(1, fname);
            stmt.setString(2, lname);
            stmt.setString(3, email);
            stmt.setString(4, phoneno);
            stmt.setString(5, pass1);
            stmt.setString(6, pass2);
             stmt.setString(7, gender);
            
            
            stmt.executeUpdate();
            out.print("<center><h3>You've Successfully Registerd</h3><center>");
             req.getRequestDispatcher("login.html").include(req, res);
             
            

        

        } catch (ClassNotFoundException ex) {
              out.print(ex);
            Logger.getLogger(register1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
               out.print(ex);
            Logger.getLogger(register1.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }
}
