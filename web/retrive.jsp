
<%-- 
    Document   : customerDetails.jsp
    Created on : Nov 21, 2018, 7:08:07 PM
    Author     : hp
--%>

<%@page import="java.sql.*"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="icon" href="images/icons/favicon.png"/>
        <title>BlueStar</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<link href="css/responsive.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
        <link href="fonts/antonio-exotic/stylesheet.css" rel="stylesheet">
       
    </head>
    <body>
        <div id="page">
            <!---header top---->
            <div class="top-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-6">
                            
                        </div>
                        <div class="col-md-6">
                            <div class="social-grid">
                                <ul class="list-unstyled text-right">
                                    <li><a><i class="fa fa-facebook"></i></a></li>
                                    <li><a><i class="fa fa-twitter"></i></a></li>
                                    <li><a><i class="fa fa-linkedin"></i></a></li>
                                    <li><a><i class="fa fa-instagram"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--header--->
            <header class="header-container">
                <div class="container">
                    <div class="top-row">
                        <div class="row">
                            <div class="col-md-2 col-sm-6 col-xs-6">
                                <div id="logo">
                            
                                    <a href="home.html"><span> Blue</span>Star</a>
                                </div> 
                                <div class="col-sm-6 visible-sm">
                                    <form action="logout.jsp" method="post" class="form-group">
                                    <button type="logout" class="btn btn-primary" name="resest">Sign-Up</button>
                                    </form>
                                   </div>
                            </div>
                            <div class="col-sm-6 visible-sm">
                                <div class="text-right"><button type="button" class="book-now-btn">Notifications</button></div>
                            </div>
                            <div class="col-md-8 col-sm-12 col-xs-12 remove-padd">
                                <nav class="navbar navbar-default">
                                    <div class="navbar-header page-scroll">
                                        <button data-target=".navbar-ex1-collapse" data-toggle="collapse" class="navbar-toggle" type="button">
                                            <span class="sr-only">Toggle navigation</span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                            <span class="icon-bar"></span>
                                        </button>

                                    </div>
                                    <div class="collapse navigation navbar-collapse navbar-ex1-collapse remove-space">
                                        <ul class="list-unstyled nav1 cl-effect-10">
                                            <li><a  data-hover="Home" href="index.html"><span>Home</span></a></li>
                                            <li><a  data-hover="AdminPage" href="AdminPage.jsp"><span>Admin Page</span></a></li>
                                            <li><a data-hover="RoomBookingRetrive"class="active"><span>Room Retrieve</span></a></li>
                                            <li><a data-hover="W-H-Retrive"  href="HallRetrive.jsp"><span>Wedding Hall</span></a></li>
                                            <li><a data-hover="BarRetrive"  href="BarRetrive.jsp"><span>Bar Retrieve</span></a></li>
                                            
                                        </ul>

                                    </div>
                                </nav>
                            </div>
                            <div class="col-md-2  col-sm-4 col-xs-12 hidden-sm">
                                <form action="logout.jsp" method="post" class="form-group">
                                    <button type="logout" class="btn btn-primary" name="resest">Sign-Up</button>
                                    </form>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
 
            <div class="clearfix"></div>
            
     <div class="container">
         <div class="table-responsive">
          <div class="row">
    <div class="col-md-12">
   <table class="table">
    <thead class="thead-dark">
      <tr>
     <th><b>RMbookingID</b></th>
    <th><b>Name</b></th>
    <th><b>Email</b></th>
    <th><b>Phone</b></th>
    <th><b>Street</b></th>
    <th><b>Number</b></th>
    <th><b>City</b></th>
    <th><b>PostCode</b></th>
    <th><b>Country</b></th>
    <th><b>Arrive</b></th>
    <th><b>Depart</b></th>
    <th><b>People</b></th>
    <th><b>Room</b></th>
    <th><b>Bed</b></th>
    <th><b>Comments</b></th>
    <th><b>file</b></th>
    <th><b>Booking Status</b></th>
   <th><b>Status</b></th>
      </tr>
    </thead>        
             <%  
             try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                String sql ="SELECT * FROM roombookingnew WHERE Status ='New'";
                Statement stmt=con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
%>
<tbody>
<tr>

        <td><%out.print(rs.getInt(1));%></td>
        <td><%out.print(rs.getString(2));%></td>
        <td><%out.print(rs.getString(3));%></td>
        <td><%out.print(rs.getString(4));%></td>
        <td><%out.print(rs.getString(5));%></td>
        <td><%out.print(rs.getString(6));%></td>
        <td><%out.print(rs.getString(7));%></td>
        <td><%out.print(rs.getString(8));%></td>
        <td><%out.print(rs.getString(9));%></td>
        <td><%out.print(rs.getString(10));%></td>
        <td><%out.print(rs.getString(11));%></td>
        <td><%out.print(rs.getString(12));%></td>
        <td><%out.print(rs.getString(13));%></td>
        <td><%out.print(rs.getString(14));%></td>
        <td><%out.print(rs.getString(15));%></td>
        <td><%out.print(rs.getString(16));%></td>
        <td><%out.print(rs.getString(18));%></td>
        <td><a href='approve.jsp?id=<%out.print(rs.getInt(1));%>' class='btn btn-success'>Approve</a></td>

</tr>
</tbody>
<% 
}
              
             
            }catch(Exception e){
               out.println("Error:"+e.getMessage());
            }
            
            %>
            </table>
            </div>
            </div>
            </div>
    </body>
</html>
