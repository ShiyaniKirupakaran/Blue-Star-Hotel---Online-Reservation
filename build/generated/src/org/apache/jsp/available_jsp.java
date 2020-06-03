package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public final class available_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"icon\" href=\"images/icons/favicon.png\"/>\r\n");
      out.write("        <title>BlueStar</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"fonts/antonio-exotic/stylesheet.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         \r\n");
      out.write("        <div id=\"page\">\r\n");
      out.write("            <!---header top---->\r\n");
      out.write("            <div class=\"top-header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6\">\r\n");
      out.write("                            <div class=\"social-grid\">\r\n");
      out.write("                                <ul class=\"list-unstyled text-right\">\r\n");
      out.write("                                    <li><a><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                                    <li><a><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--header--->\r\n");
      out.write("            <header class=\"header-container\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"top-row\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-2 col-sm-6 col-xs-6\">\r\n");
      out.write("                                <div id=\"logo\">\r\n");
      out.write("                                    <!--<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"logo\"></a>-->\r\n");
      out.write("                                    <a href=\"home.html\"><span> Blue</span>Star</a>\r\n");
      out.write("                                </div>                       \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-sm-6 visible-sm\">\r\n");
      out.write("                                <div class=\"text-right\"><button type=\"button\" class=\"book-now-btn\">Book Now</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-8 col-sm-12 col-xs-12 remove-padd\">\r\n");
      out.write("                                <nav class=\"navbar navbar-default\">\r\n");
      out.write("                                    <div class=\"navbar-header page-scroll\">\r\n");
      out.write("                                        <button data-target=\".navbar-ex1-collapse\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\r\n");
      out.write("                                            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                                            <span class=\"icon-bar\"></span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"collapse navigation navbar-collapse navbar-ex1-collapse remove-space\">\r\n");
      out.write("                                        <ul class=\"list-unstyled nav1 cl-effect-10\">\r\n");
      out.write("                                            <li><a  data-hover=\"Home\" class=\"active\"><span>Home</span></a></li>\r\n");
      out.write("                                            <li><a data-hover=\"About\"  href=\"about.html\"><span>About</span></a></li>\r\n");
      out.write("                                            <li><a data-hover=\"Rooms\"  href=\"rooms.html\"><span>Rooms</span></a></li>\r\n");
      out.write("                                            <li><a data-hover=\"Gallery\"  href=\"gallery.html\"><span>Gallery</span></a></li>\r\n");
      out.write("                                            <li><a data-hover=\"Dinning\" href=\"dinning.html\"><span>Dinning</span></a></li>\r\n");
      out.write("                                            <li><a data-hover=\"News\" href=\"news.html\"><span>News</span></a></li>\r\n");
      out.write("                                            <li><a data-hover=\"Contact Us\" href=\"contact.html\"><span>contact Us</span></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </nav>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-2  col-sm-4 col-xs-12 hidden-sm\">\r\n");
      out.write("                                <div class=\"text-right\"><button type=\"button\" class=\"book-now-btn\">Book Now</button></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"message\">\r\n");
      out.write("       ");


       String frmdate = request.getParameter("fromdate");
    
      
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bluestar","root","");
                        Statement stmt = con.createStatement();
          
           String query3 = "SELECT * FROM roombookingnew WHERE Arrive = '"+frmdate+"' ";
           ResultSet rs = stmt.executeQuery(query3);
               if(rs.next()){
                String activate = rs.getString("BookingStatus");
                if(activate.equals("Booked")){
                 out.println("Already Booked");  
                }
              
             }else{
               
                out.println("Not Booked");
               }
                    } catch (Exception e) {
                        out.println(e.getMessage());
                    }
                
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   <form action=\"available.jsp\" method=\"post\">\r\n");
      out.write("       <div class=\"panel panel-default\" >\r\n");
      out.write("    \r\n");
      out.write("           \r\n");
      out.write("           <div  class=\"panel-body\" style=\"color:#800080;width:400px;height:500px;margin-left:400px;\">\r\n");
      out.write("               <center> <h3>Room Availability</h3></center>\r\n");
      out.write("       <label for=\"ex1\"> Date</label>\r\n");
      out.write("        <input type=\"date\" name=\"fromdate\" id=\"fromdate\"  class=\"form-control\">\r\n");
      out.write("           <span id=\"fDate\" class=\"text-danger font-weight-bold\"></span>\r\n");
      out.write("           <input type=\"submit\" class=\"btn btn-success\" value=\"Check Availability\" style=\"width:150px; margin-top:30px; margin-left: 100px;\">    </div>\r\n");
      out.write("       </div>\r\n");
      out.write("</form>\r\n");
      out.write("             <footer>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-6 col-xs-12 width-set-50\">\r\n");
      out.write("                            <div class=\"footer-details\">\r\n");
      out.write("                                <h4>Get in touch</h4>\r\n");
      out.write("                                <ul class=\"list-unstyled footer-contact-list\">\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <i class=\"fa fa-map-marker fa-lg\"></i>\r\n");
      out.write("                                        <p>2 SIR CHITTAMPLAMA GARDINER MAWATHA COLOMBO, SRI LANKA.</p>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <i class=\"fa fa-phone fa-lg\"></i>\r\n");
      out.write("                                        <p><a href=\"tel:+1-202-555-0100\"> +11- 456 6759</a></p>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <i class=\"fa fa-envelope-o fa-lg\"></i>\r\n");
      out.write("                                        <p><a href=\"mailto:demo@info.com\"> demo@info.com</a></p>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"footer-social-icon\">\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>                           \r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-google-plus\"></i></a>\r\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-youtube-play\"></i></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"input-group\" id=\"subscribe\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control subscribe-box\" value=\"\" name=\"subscribe\" placeholder=\"EMAIL ID\">\r\n");
      out.write("                                    <span class=\"input-group-btn\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn subscribe-button\"><i class=\"fa fa-paper-plane fa-lg\"></i></button>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-3 col-sm-6 col-xs-12 width-50 width-set-50\">\r\n");
      out.write("                            <div class=\"footer-details\">\r\n");
      out.write("                                <h4>explore</h4>\r\n");
      out.write("                                <ul class=\"list-unstyled footer-links\">\r\n");
      out.write("                                    <li><a href=\"index.html\">Rooms</a></li>\r\n");
      out.write("                                    <li class=\"active\"></li>\r\n");
      out.write("                                    <li><a href=\"gallery.html\">Gallery</a></li>\r\n");
      out.write("                                    <li><a href=\"#\">Dinning</a></li>\r\n");
      out.write("                                    <li> <a href=\"news.html\">News</a></li>\r\n");
      out.write("                                    <li> <a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-6 col-sm-12 col-xs-12\">\r\n");
      out.write("                            <div class=\"footer-details\">\r\n");
      out.write("                                <h4>Now On Instagram</h4>\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"instagram-images\">\r\n");
      out.write("                                        <div id=\"instafeed\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"copyright\">\r\n");
      out.write("                        &copy; 2017 All right reserved. Designed by <a href=\"http://www.themevault.net/\" target=\"_blank\">ThemeVault.</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("\r\n");
      out.write("            <!--back to top--->\r\n");
      out.write("            <a style=\"display: none;\" href=\"javascript:void(0);\" class=\"scrollTop back-to-top\" id=\"back-to-top\">\r\n");
      out.write("                <span><i aria-hidden=\"true\" class=\"fa fa-angle-up fa-lg\"></i></span>\r\n");
      out.write("                <span>Top</span>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
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
