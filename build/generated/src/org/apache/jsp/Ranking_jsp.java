package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ranking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/common/headerfiles.jsp");
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/common/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Ranking | The ICFAI University Shillong</title>\r\n");
      out.write("        ");
      out.write("<link href=\"scripts/css/application.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script src=\"scripts/js/application.js\" type=\"text/javascript\" ></script> \n");
      out.write("<link href=\"scripts/css/lightbox.min.css\" type=\"text/css\" rel=\"stylesheet\" /> \n");
      out.write("<script src=\"scripts/js/lightbox-plus-jquery.min.js\" type=\"text/javascript\" ></script> ");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

    String username = (String)request.getSession().getAttribute("username");

      out.write("\n");
      out.write("<div id=\"headcontact\">\n");
      out.write("    <div id=\"left\">\n");
      out.write("        <img src=\"scripts/css/images/icfai.png\" style=\"width: 40%\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"right\">\n");
      out.write("        <a href=\"IBS.jsp\">IBS</a>&nbsp;|\n");
      out.write("        <a href=\"happenings.jsp\">Happenings</a>&nbsp;|\n");
      out.write("        <a href=\"Placements.jsp\">Placements</a>&nbsp;|\n");
      out.write("        <a href=\"contact.jsp\">Contact</a>&nbsp;&nbsp;\n");
      out.write("        <a href=\"https://www.facebook.com/thangflipmate/\"><img src=\"scripts/css/images/facebook.png\" align=\"center\" vspace=20></a>\n");
      out.write("        <a href=\"https://twitter.com/icfaiofficial\"><img src=\"scripts/css/images/twitter.png\" align=\"center\"></a>\n");
      out.write("        <a href=\"https://www.youtube.com/channel/UC5KoZDDGw1n7hwdNopNszOA\"><img src=\"scripts/css/images/youtube.png\" align=\"center\"></a>\n");
      out.write("        <a href=\"http://in.linkedin.com/in/icfaiofficial\"><img src=\"scripts/css/images/linkedin.png\" align=\"center\"></a>\n");
      out.write("        <a href=\"https://plus.google.com/114231297122642777392\"><img src=\"scripts/css/images/google_plus.png\" align=\"center\"></a>&nbsp;&nbsp;\n");
      out.write("        <span>\n");
      out.write("            <a href=\"Ranking.jsp\">Rankings</a>&nbsp;|\n");
      out.write("            <a href=\"Awards.jsp\">Awards</a>\n");
      out.write("        </span>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"menus\">\n");
      out.write("    <span><a href=\"index.jsp\">Home</a></span>&nbsp;|\n");
      out.write("    <span><a href=\"igroup.jsp\">ICFAI Group</a></span>&nbsp;|\n");
      out.write("    <span><a href=\"aboutus.jsp\">About us</a></span>&nbsp;|\n");
      out.write("    <span><a href=\"contactus.jsp\">Contact us</a></span>&nbsp;|\n");
      out.write("    <span><a href=\"faculty.jsp\">Faculty</a></span>&nbsp;|\n");
      out.write("    <span><a href=\"gallery.jsp\">Gallery</a></span>&nbsp;|\n");
      out.write("    ");

        if(username!=null)
        {   
    
      out.write("  \n");
      out.write("    <span style=\"text-align:right;\"><a href=\"changepass.jsp\">Change Password</a>&nbsp;|\n");
      out.write("    <a href=\"logout.jsp\">Logout</a></span>\n");
      out.write("    ");

        }else {   
    
      out.write("    \n");
      out.write("    <span><a href=\"login.jsp\">Login</a></span>\n");
      out.write("    ");

        } 
    
      out.write("     \n");
      out.write("</div>\n");
      out.write("<span style=\"float:right\">    \n");

    if(username!=null){
        out.print("Logged in User : "+username);
    }

      out.write("\n");
      out.write("</span>    ");
      out.write("\r\n");
      out.write("        <div id=\"bodycontent\" style=\"padding-left:40px;min-height:960px; padding-right:40px;\">\r\n");
      out.write("            <h1 style=\"text-align:center; color:blue;\">ICFAI RANKINGS</h1>\r\n");
      out.write("            <div id=\"aboutleft\" style=\"padding:20px;padding-top:0px; min-height:800px;width:33%;\">\r\n");
      out.write("                <h2><span style=\"color:red\">Rankings</h2>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li>The University was awarded \"University of the Year for Excellence &nbsp;in &nbsp;Values-based &nbsp;Education\" at &nbsp;Jharkhand Education Summit held in Ranchi on March 15, 2015 </li>\r\n");
      out.write("                    <br><img src=\"scripts/css/images/rank.jpg\" width=\"95%\" style=\"border:1px solid #4C4F4D; border-radius:4px;\">\r\n");
      out.write("                    <br><br><li>Prof. ORS Rao, Vice Chancellor was invited to be on the jury for National Case Study Competition, organized by National HRD Network, Ranchi on June 21, 2014 </li>\r\n");
      out.write("                    <br><li>Prof ORS Rao, VC was invited by Institution of Engineers to present a paper on \"World Class Engineering Education \" at the Annual event in Hyderabad on Dec 22, 2014 </li>\r\n");
      out.write("                    <br><li>Prof ORS Rao, VC &nbsp;was&nbsp; invited by Association of Indian Universities to speak on \"Quality of &nbsp;Higher &nbsp;Education in India\" at the East Zone VC's conference in Hazaribagh on Dec 5, 2014.</li>\r\n");
      out.write("                    <br><li>Mr. Akinchan Sinha, Ph.D Scholar of 2014 batch received the second best paper award for the paper he presented &nbsp;at the conference at Siva Sivani Institute of Management, Hyderabad on Feb 12, 2015. </li>\r\n");
      out.write("                    <br><li>The University was honoured by Rama Krishna Mission Ashrama, Ranchi on 21st Nov 2013 for its efforts in inculcating \"Values\" among its students.</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("           <div id=\"aboutright\" style=\"padding:20px; min-height:780px;width:57%;\">\r\n");
      out.write("               <img src=\"scripts/css/images/rank1.jpg\" width=\"100%\" height=\"380px\" style=\"border:1px solid #4C4F4D; border-radius:0px;\">\r\n");
      out.write("               <br><br>\r\n");
      out.write("               <span style=\"color:blue; font-size:200%;\">The ICFAI University, Meghalaya</span><br><br>\r\n");
      out.write("               <div style=\"background-color:#FF3983;color:white; text-align:center;padding:20px;font-size:17px;\"><b>Awarded as  Best University in meghalaya in CCLA - Education Leadership Awards 2017</b></div>\r\n");
      out.write("           </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("<div id=\"contact1\">\n");
      out.write("    <b><font size=\"6\">Contact Us</font></b>\n");
      out.write("</div>\n");
      out.write("<div id=\"contact2\">\n");
      out.write("    <div id=\"b1\">\n");
      out.write("            <img src=\"scripts/css/images/phone.png\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"b2\">\n");
      out.write("            <img src=\"scripts/css/images/location.png\">\n");
      out.write("    </div>\n");
      out.write("    <div id=\"b3\">\n");
      out.write("            <img src=\"scripts/css/images/mail.png\">\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"contact3\">\n");
      out.write("    <div id=\"c1\">\n");
      out.write("            <b><font size=\"4\">Toll-free Number<br>\n");
      out.write("            03651 - 224683 / 84</b>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"c2\">\n");
      out.write("             <b>Our Location<br>\n");
      out.write("                    Shillong Campus<br>\n");
      out.write("                    Phawa Ville, Dhanketi, Shillong 793001, East<br> \n");
      out.write("                    Khasi Hills, Meghalaya.</b> \n");
      out.write("    </div>\n");
      out.write("    <div id=\"c3\">\n");
      out.write("            <b>Email<br>\n");
      out.write("            admissions@iumeghalaya.edu.in</b>\n");
      out.write("            </font>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"footercontent\">\n");
      out.write("    <div id=\"f1\">\n");
      out.write("        <span><img src=\"scripts/css/images/icfai.png\" height=\"50\"></span><br><br>\n");
      out.write("        Copyright © 2018\n");
      out.write("    </div>\n");
      out.write("    <div id=\"f2\">\n");
      out.write("        <font size=\"6\">Quick Links</font><br><br>\n");
      out.write("        <span><a href=\"index.jsp\">Home</a></span>&nbsp;|\n");
      out.write("        <span><a href=\"igroup.jsp\">ICFAI Group</a></spanan>&nbsp;|\n");
      out.write("        <span><a href=\"aboutus.jsp\">About us</a></span>&nbsp;|\n");
      out.write("        <span><a href=\"contactus.jsp\">Contact us</a></span>&nbsp;|\n");
      out.write("        <span><a href=\"faculty.jsp\">Faculty</a></span>&nbsp;\n");
      out.write("    </div>\n");
      out.write("    <div id=\"f3\">\n");
      out.write("        <a href=\"https://www.facebook.com/thangflipmate/\"><img src=\"scripts/css/images/facebook.png\" align=\"center\" vspace=20 height=\"25%\"></a>\n");
      out.write("        <a href=\"https://twitter.com/icfaiofficial\"><img src=\"scripts/css/images/twitter.png\" align=\"center\" height=\"25%\"></a>\n");
      out.write("        <a href=\"https://www.youtube.com/channel/UC5KoZDDGw1n7hwdNopNszOA\"><img src=\"scripts/css/images/youtube.png\" align=\"center\" height=\"25%\"></a>\n");
      out.write("        <a href=\"http://in.linkedin.com/in/icfaiofficial\"><img src=\"scripts/css/images/linkedin.png\" align=\"center\" height=\"25%\"></a>\n");
      out.write("        <a href=\"https://plus.google.com/114231297122642777392\"><img src=\"scripts/css/images/google_plus.png\" align=\"center\" height=\"25%\"></a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"lastdiv\">\n");
      out.write("    Design and developed by <a href=\"designers&developers.jsp\">BCA Students (Batch : 2016-19)</a> of ICFAI university.\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
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
