<%-- 
    Document   : home
    Created on : 4 Nov, 2022, 8:47:46 AM
    Author     : SUDHIR
--%>


<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Home Page</title>
         <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
 
    </head>
    <body>
       
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
                    <script>
                        AOS.init();
                    </script>
        <%@include file="header.jsp" %>
        <div class="container">


           
            <br>
            <div class="form-group" >
                <form method="get" action="servlett">    
                    <div class="form-group">
                        <div  data-aos="fade-down">
                        <h1 class="text-center  text-info" style="font-family: fantasy;font-size: 50px;">S t u d e n t -  D e t a i l s</h1>
   
                        </div>
                        <%
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
                                    out.println("<div data-aos='flip-up'>");
                     
                                    out.println("<center>");
                                     out.println("<h4>Select Location</h4>");
                                    out.println("<select class='form-select w-25 text-center'name='combo' > ");
                                    out.println("<option>Select Location</option>");
                                    do {
                                        String Location = rs.getString("Location");
                                        out.println("<option class='h6 m-1 border' value='" + Location +"'>" + Location + "</option>");
                                    } while (rs.next());
                                    out.println("</select>");
                                    rs.close();
//                                   
                                    out.println("<td colspan=2 align=center><button type='submit' class='btn btn-outline-secondary m-2'  value=Retrieve>Get Data</button></td></tr>");
                                } else {
                                    out.println("<tr>");
                                    out.println("<td colspan=2 align=right>");
                                    out.println("Sorry table is Empty");
                                    out.println("</td></center></div>");
                                }

                                out.println("</form>");
                                PreparedStatement stmt = con.prepareStatement("select * from studentinfo limit ?,?");
                                stmt.setInt(1, start);
                                stmt.setInt(2, recordcount);
                                ResultSet rsp = stmt.executeQuery();

                                out.print("<html><body><div data-aos='zoom-in'><center class='pt-3'><table class='fw-bold text-center table table-success table-striped' ><tr class='border border-dark-5'><td>Student ID</td><td>First Name	</td><td>Last Name</td><td>Location</td><td>English</td><td>Maths</td><td>Chemistry</td><td>Physics</td><td>Biology</td><td>History</td><td>Geography</td></tr>");
                                while (rsp.next()) {

                                    out.println("<tr class'border border-dark-5'=><td>" + rsp.getString(1) + "</td><td>" + rsp.getString(2) + "</td><td>" + rsp.getString(3) + "</td><td>" + rsp.getString(4) + "</td><td>" + rsp.getString(5) + "</td><td>" + rsp.getString(6) + "</td><td>" + rsp.getString(7) + "</td><td>" + rsp.getString(8) + "</td><td>" + rsp.getString(9) + "</td><td>" + rsp.getString(10) + "</td><td>" + rsp.getString(11) + "</td></tr></center></div></body></html>");

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


                        %>
                        
                        <table>
                            <tr><th colspan="10" >
                                   <%  for (int i=0;i<=total/recordcount;i++){%><%}%>
                                </th>
                            </tr>
                        </table>
                                <center>
                                <span ><a href="home.jsp?pgno=<%=pageNo-1%>" class="btn btn-warning  <%=(start==0)?"disabled":""%>">Previous</a></span>
                                <span><a href="home.jsp?pgno=<%=pageNo+1%>" class="btn btn-warning <%=(start+recordcount>total)?"disabled":""%>">Next</a></span>
                                </center></div>

                </form>                    

            </div>      

        </div>
                        
               <%@include file="footer.jsp" %>                            
    </body>
      
</html> 