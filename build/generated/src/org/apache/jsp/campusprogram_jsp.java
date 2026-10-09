package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modles.MPCourseSubjects;
import modles.MSubjects;
import modles.MCourses;
import java.util.List;
import daos.DaoInitialization;

public final class campusprogram_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Campus Programs</title>\r\n");
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
      out.write("        <div id=\"bodycontent\" style=\"padding-left:60px;min-height:1160px; padding-right:80px;\">\r\n");
      out.write("            <h1 style=\"text-align:center;\"><span  style=\"color:blue;\">CAMPUS PROGRAMS</span></h1>\r\n");
      out.write("            <div id=\"abouticfai\" style=\"color:black;\">\r\n");
      out.write("                <div id=\"events\" style=\"padding:10px;\"><img src=\"scripts/css/images/event2.jpg\"  style=\"border:1px solid #4C4F4D; width:100%; height:380px; border-radius:15px 50px;\"></div>\r\n");
      out.write("                <div style=\"padding:16px; padding-left:22px;\">\r\n");
      out.write("                      ");

                        DaoInitialization ci = new DaoInitialization();
                        String listCoursesS1="",listCoursesS2="",a="",b="";
                        List<MCourses> listCourses = ci.listCourses();
                        for(MCourses M:listCourses){
                            a="<span  style='color:red;'>UG PROGRAMS</span><br>";
                            b="<span  style='color:red;'>PG PROGRAMS</span><br>";
                            if(M.getCoursename().startsWith("B"))
                            {
                                if(M.getCoursename().equals("BCA")){
                                    listCoursesS1+="<ul><li><a href='bcainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.Com")){
                                    listCoursesS1+="<ul><li><a href='bcominfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("BBA")){
                                    listCoursesS1+="<ul><li><a href='bbainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(Economics)")){
                                    listCoursesS1+="<ul><li><a href='baeconomicsinfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(Education)")){
                                    listCoursesS1+="<ul><li><a href='baeducation.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(English)")){
                                    listCoursesS1+="<ul><li><a href='baenglish.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(Pol.Sc.)")){
                                    listCoursesS1+="<ul><li><a href='bapolsc.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("BTTM")){
                                    listCoursesS1+="<ul><li><a href='bttminfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else{
                                    listCoursesS1+="<ul><li><a href='info.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }
                            }else if(M.getCoursename().startsWith("M") || M.getCoursename().startsWith("I"))
                            {
                                if(M.getCoursename().equals("MBA")){
                                    listCoursesS2+="<ul><li><a href='mbainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("MTTM")){
                                    listCoursesS2+="<ul><li><a href='mttminfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("M.Com")){
                                    listCoursesS2+="<ul><li><a href='mcominfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("IMCA")){
                                    listCoursesS2+="<ul><li><a href='imcainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("MCA")){
                                    listCoursesS2+="<ul><li><a href='mcainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else{
                                    listCoursesS2+="<ul><li><a href='info.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }
                            }
                        }
                    
      out.write("\r\n");
      out.write("                    ");
      out.print(a);
      out.write("\r\n");
      out.write("                    ");
      out.print(listCoursesS1);
      out.write("\r\n");
      out.write("                    ");
      out.print(b);
      out.write("\r\n");
      out.write("                    ");
      out.print(listCoursesS2);
      out.write("\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
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
