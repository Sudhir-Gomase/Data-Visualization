
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

public class resetpass extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        {
            String pass1 = request.getParameter("pass1");
            String pass2 = request.getParameter("pass2");
            String email = request.getParameter("email");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "hero");

                String sql = "select email from studentinfo where email= ? ";
                PreparedStatement prepStmt = con.prepareStatement(sql);
                prepStmt.setString(1, email);
                ResultSet rs = prepStmt.executeQuery();

                if (rs.next()) {
                    if (pass1.equals(pass2)) {
                        PreparedStatement st = (PreparedStatement) con.prepareStatement("update studentinfo set pass1=?  where email=? ");
                        st.setString(2, email);
                        st.setString(1, pass1);
                        st.setString(3, pass2);
                        int row = st.executeUpdate();
                        if (row == 1) {

                            RequestDispatcher rd = request.getRequestDispatcher("/login.html");
                            rd.forward(request, response);

                        } else {
                            out.println("no row updated");

                        }
                    } else {

                        RequestDispatcher rd = request.getRequestDispatcher("/ResetPass.jsp");
                        rd.forward(request, response);
                    }
                } else {

                    RequestDispatcher rd = request.getRequestDispatcher("/ResetPass.jsp");
                    rd.forward(request, response);
                }
            } catch (SQLException ex) {
                Logger.getLogger(resetpass.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(resetpass.class.getName()).log(Level.SEVERE, null, ex);
            }
            {
                request.setAttribute("errorMessage", "Email-id is Invalid");
                RequestDispatcher rd = request.getRequestDispatcher("/resetpassword.jsp");
                rd.forward(request, response);
            }

        }
    }
}
