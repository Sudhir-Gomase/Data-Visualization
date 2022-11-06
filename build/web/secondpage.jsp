<%-- 
    Document   : secondpage
    Created on : 4 Nov, 2022, 9:18:12 AM
    Author     : SUDHIR
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Data Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
           <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
    </head>
    <body>
              
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js" integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk" crossorigin="anonymous"></script>
             <script>
                        AOS.init();
                    </script>       
<%@include file="header.jsp" %>
        <div class="container">

          
            <div class="form-group">
                <form method="get" action="servlett">    
                    <div class="form-group">
                        <div  data-aos="fade-down">
                        <h2 class="text-center  pt-3  text-info" style="font-family: fantasy;font-size: 50px;">Location  -  Wise  Details</h2>
   
                        </div>
                      
                        <%
                            
                            try {
                                
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
                                            out.println("<td>");
                                        out.println("<select class='form-select w-25 text-center'name='combo' > ");
                                             out.println("<option >Select Location</option>");

                                            do {
                                                String Location = rs.getString("Location");
                                                out.println("<option value='" + Location + "'>" + Location + "</option>");
                                            } while (rs.next());
                                            out.println("</select>");
                                            rs.close();
                                            out.println("</td></tr>");
                                            out.println("<td colspan=2 align=center><button type='submit' class='btn btn-outline-secondary m-2'  value=Retrieve>Get Data</button></td></tr>");

                                                out.println("</tr><td colspan=2 align=center><a  href='home.jsp'  class='btn btn-info'>SelectAll</a></td></tr>");
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

                        %>
                        
                       
                    </div>



                </form>                    

            </div>      

        </div>
   
                        
</body>
</html>