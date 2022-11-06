import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class login extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
     
        String pass1 = request.getParameter("pass1");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("select * from userinfo where email=?");
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();
            boolean gh=rs.next();
           
              out.println("<html><head><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\"></head><script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n" +
"<body class='pt-1 pb-0'><script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n ");
            if (gh) {

                if (pass1.equals(rs.getString("pass2"))) {
                    HttpSession session=request.getSession();  
                    session.setAttribute("email",email); 
                    response.sendRedirect(request.getContextPath() + "/home.jsp");
                            
                } else {
                    out.println("<center><h3 class=' text-danger fw-bold'  >Error: <b> Email-Id/Password Invalid! Try Again!</b></h3></center>");
                    RequestDispatcher rd = request.getRequestDispatcher("login.html");
                    rd.include(request, response);

                }
            } else {
                out.println("<center><h3 class=' text-danger fw-bold' >Error: <b> Email-Id Dose'nt Exist! Register Yourself</b></h3></center>");
                RequestDispatcher rd = request.getRequestDispatcher("login.html");
                rd.include(request, response);

    }

   out.println("</body></html>");

}       catch (ClassNotFoundException ex) {
    out.print(ex);
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
             out.print(ex);
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
