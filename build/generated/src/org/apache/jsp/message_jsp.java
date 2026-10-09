package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class message_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Message From Vice Chancellor</title>\n");
      out.write("        ");
      out.write("<link href=\"scripts/css/application.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script src=\"scripts/js/application.js\" type=\"text/javascript\" ></script> \n");
      out.write("<link href=\"scripts/css/lightbox.min.css\" type=\"text/css\" rel=\"stylesheet\" /> \n");
      out.write("<script src=\"scripts/js/lightbox-plus-jquery.min.js\" type=\"text/javascript\" ></script> ");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("\n");
      out.write("        <div id=\"bodycontent\" style=\"padding-left:60px;min-height:696px; padding-right:70px;\">\n");
      out.write("            <h1 style=\"text-align:center;\">MESSAGE FROM <span style=\"color:blue;\">VICE CHANCELLOR</span></h1>\n");
      out.write("            <div id=\"message\">\n");
      out.write("               <span style=\"color:blue;\"> Message from Dr. (Miss) Alicia Gatphoh</span>, Vice Chancellor, IU Meghalaya<br><br>\n");
      out.write("               <img src=\"scripts/css/images/vc.jpg\" style=\"border:1px solid gray;border-radius:10px;\"><br>\n");
      out.write("                Welcome to the ICFAI University, Meghalaya. This is in compliance with Section 44 of the Institute of Chartered Financial Analysts of India University Act 2005, (Meghalaya Act No. 12 of 2005). The Institute of &nbsp;Chartered Financial Analysts of &nbsp;India University, Meghalaya was established under the provisions of the Institute of Chartered Financial Analysts of India University Act, 2005 &nbsp;(Meghalaya Act No. 12 of 2005) &nbsp;vide Notification No. EDN. 261/2004/124 dated 22.02.2006 of &nbsp;the Government of &nbsp;Meghalaya. During this academic year, the University made unstinted efforts to provide the &nbsp;students with theoretical and practical learning skills to equip them with &nbsp;abilities to meet challenges of &nbsp;life. Keeping in mind the Vision and &nbsp;Mission of &nbsp;the University, the Staff, the Faculty and the Members of the various Statutory Boards played a cohesive role to maintain the steady growth in student strength and development of the University as a whole.<br><br>\n");
      out.write("                Considering the need to enhance knowledge, the University is proud to announce that two new Postgraduate programs - Master in Tourism Management and Master of Computer Applications have been launched in this academic year.<br><br>\n");
      out.write("                Strengthening its efforts on community services, the Government of Meghalaya had graciously permitted the University to open the unit of National Service Scheme, an act deeply appreciated by one and all. Completion of construction works at Tura campus saw the functioning of academic and administrative activities from the permanent campus. Efforts are underway to acquire land for Shillong Campus too.<br><br>\n");
      out.write("                The University expresses its gratitude to the Government of Meghalaya for its assistance and support towards the development of the University.<br><br>\n");
      out.write("               <span style=\"color:blue;\">Dr. (Miss) Alicia Gatphoh,</span><br>\n");
      out.write("               <span style=\"color:red;\">Vice-Chancellor </span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
