<%-- 
    Document   : visual
    Created on : 5 Nov, 2022, 4:16:46 PM
    Author     : SUDHIR
--%>


<%@page import="javax.tools.DocumentationTool.Location"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Visual Page</title>
        <%
            Map<String, String> result = new HashMap<>();

        %>

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
                <form  action="" >    
                    <div class="form-group">
                        <div  data-aos="fade-down">
                            <h1 class="text-center  text-info" style="font-family: fantasy;font-size: 55px;">Data visualization</h1>

                        </div>
                        <%                            int total = 0, pgno = 0, pageNo = 0, pass, fail;
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

                        %>



                    </div></form>

            </div>      

        </div>
        <script type="text/javascript">
            myFunction = function (e) {
                var city = document.getElementById("data").value;
                var hiddata = document.getElementById("userId").value;
             
              
                var locationData = JSON.parse(hiddata);
               CanvasJS.addColorSet("Shades",
                [//colorSet Array

                "#3CB371", 
                "#c0504e"
                ]);
                 CanvasJS.addColorSet("stackshades",
                [//colorSet Array

                "#3CB371", 
                "#c0504e"
                ]);
                var chart = new CanvasJS.Chart("chartContainer", {
                     colorSet:  "Shades",
                    animationEnabled: true,
                    theme: "light1",
                    title: {
                        text: "Student Record in Donutchart"
                    },
                    subtitles: [{
                            text: "Students"
                        }],
                    data: [{
                            type: "doughnut",
                            yValueFormatString: "#,##0",
                            indexLabel: "{label}: {y} students",
                            toolTipContent: "{y} Students",
                            dataPoints: JSON.parse(locationData[city])
                        }]
                });
                chart.render();
                 var bar = new CanvasJS.Chart("barContainer", {
                       colorSet:  "stackshades",
                    animationEnabled: true,
                    theme: "light1",
                    title: {
                        text: "Student Record in Stack Barchart "
                    },
                    subtitles: [{
                            text: "Students"
                        }],
                    data: [{
                            type: "stackedColumn",
                            yValueFormatString: "#,##0",
                            indexLabel: "{label}: {y} students",
                            toolTipContent: "{y} Students",
                            dataPoints: JSON.parse(locationData[city])
                        }]
                });
                bar.render();
                e = e || window.event;
                e.preventDefault();
            }
        </script>
        <div class="row">
            
            <div id="chartContainer" class="col-md-6" style="height: 380px; width: 100%;">
                
            </div>
            <div id="barContainer" class="col-md-6" style="height: 380px; width: 100%;">
                
            </div>
        </div>
        
        <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
   
            <%@include file="footer.jsp" %>
    </body>
</html>
