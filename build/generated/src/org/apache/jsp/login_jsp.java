package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modles.MPCourseSubjects;
import modles.MSubjects;
import java.util.List;
import modles.MCourses;
import daos.DaoInitialization;
import controllers.ControllerInitialization;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/common/headerfiles.jsp");
    _jspx_dependants.add("/common/header.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
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
      out.write("        <div id=\"bodycontent\" style=\"min-height: 600px;\">\n");
      out.write("            <div id=\"middle\" style=\"width:100%;min-height: 600px;border:0px;\">\n");
      out.write("                <table style=\"width: 60%;margin :0 auto; \">\n");
      out.write("                    <tr>\n");
      out.write("                        <td valign=\"top\">\n");
      out.write("                            <form id=\"loginForm\" name=\"loginForm\" method=\"POST\" action=\"ControllerLogin\">\n");
      out.write("                                <br><br><br>\n");
      out.write("                                <table id=\"courseC\" class=\"initC\">\n");
      out.write("                                    <thead> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th colspan=\"2\" style=\"text-align: center;font-size: 20px;\">\n");
      out.write("                                                Login\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>User Id : </label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" id=\"userid\" class=\"inputtext\" name=\"userid\" maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Password : </label>\n");
      out.write("                                            </th>                                            \n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"password\" id=\"userpassword\" class=\"inputtext\" name=\"userpassword\" maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th  colspan=\"2\" style=\"text-align: center;font-size: 20px;\">                                 \n");
      out.write("                                                <button name=\"action\" >Login</button>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("                        </td>                                                                         \n");
      out.write("                    </tr>\n");
      out.write("                </table>   \n");
      out.write("\n");
      out.write("            </div>            \n");
      out.write("        </div>        \n");
      out.write("    </body>\n");
      out.write("    <script src=\"scripts/js/login.js\" type=\"text/javascript\" ></script> \n");
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
