package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modles.TUserlogin;
import daos.DaoAdministration;
import modles.MPCourseSubjects;
import modles.MSubjects;
import java.util.List;
import modles.MCourses;
import daos.DaoInitialization;
import controllers.ControllerInitialization;

public final class manageuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/common/headerfiles.jsp");
    _jspx_dependants.add("/authenticate.jsp");
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/common/left.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Management</title>\n");
      out.write("        ");
      out.write("<link href=\"scripts/css/application.css\" type=\"text/css\" rel=\"stylesheet\" />\n");
      out.write("<script src=\"scripts/js/application.js\" type=\"text/javascript\" ></script> \n");
      out.write("<link href=\"scripts/css/lightbox.min.css\" type=\"text/css\" rel=\"stylesheet\" /> \n");
      out.write("<script src=\"scripts/js/lightbox-plus-jquery.min.js\" type=\"text/javascript\" ></script> ");
      out.write("\n");
      out.write("        ");

    String roleaut = (String)request.getSession().getAttribute("role");
    if(roleaut==null)
    {  
        response.sendRedirect("logout.jsp"); 
    }

      out.write("\n");
      out.write("        ");

            DaoAdministration da = new DaoAdministration();
            String listUserssS="";
            List<TUserlogin> listUserss = da.listUserss();
            int i=0;
            for(TUserlogin U:listUserss)
            {
                i++;
                String role1="-",gender="";
                if(U.getRoles().equals("T")){
                    role1="Teacher";
                }else if(U.getRoles().equals("L")){
                    role1="Librarian";
                }else if(U.getRoles().equals("S")){
                    role1="Staff";
                }
                
                if(U.getGender().equals("M")){
                    gender="Male";
                }else if(U.getGender().equals("F")){
                    gender="Female";
                }                
                String action="";
                if(U.getUserstatus().equals("Y")){
                    action+="<button name='action' id="+U.getUsercode()+" value='2' onclick='setUsercode(this.id)'>Disable User</button>";
                }
                if(U.getUserstatus().equals("N")){
                    action+="<button name='action' id="+U.getUsercode()+"  value='3' onclick='setUsercode(this.id)'>Enable User</button>";
                }
                action+="<button name='action' id="+U.getUsercode()+"  value='4' onclick='setUsercode(this.id)'>Reset Pass</button>";
                listUserssS +="<tr>";      
                listUserssS +="<td>"+i+"</td>";      
                listUserssS +="<td>"+role1+"</td>";      
                listUserssS +="<td>"+U.getUserid()+"</td>";      
                listUserssS +="<td>"+U.getUserfname()+" "+U.getUserlname()+"</td>";      
                listUserssS +="<td>"+gender+"</td>";      
                listUserssS +="<td>"+U.getDob()+"</td>";      
                listUserssS +="<td>"+U.getAddress()+"<br>"+U.getPincode()+"</td>";      
                listUserssS +="<td>"+U.getMobilenumber()+"</td>";      
                listUserssS +="<td>"+action+"</td>";      
                listUserssS +="</tr>";      
            }
       
            
        
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
      out.write("        <div id=\"bodycontent\" style=\"min-height: 1200px;\">\n");
      out.write("            ");
      out.write("<div id=\"left\" class=\"cdiv\">\n");

    String role = (String)request.getSession().getAttribute("role");
    if(role!=null)
    {   

      out.write("    \n");
      out.write("    <div id=\"al\">\n");
      out.write("        ");
            
            if(role.equals("A"))
            {   
        
      out.write("\n");
      out.write("        <span><a href=\"initialization.jsp\">Initialization</a></span><br><hr>        \n");
      out.write("        <span><a href=\"manageuser.jsp\">Manage User</a></span><br><hr>       \n");
      out.write("        ");

            }else if(role.equals("L")){
        
      out.write("\n");
      out.write("        <span><a href=\"initbooks.jsp\">Book Initialization</a></span><br><hr>  \n");
      out.write("        <span><a href=\"issuebook.jsp\">Issue Book</a></span><br><hr>  \n");
      out.write("        <span><a href=\"returnbook.jsp\">Return Book</a></span><br><hr>  \n");
      out.write("        ");

            }else if(role.equals("T")){
        
      out.write("          \n");
      out.write("        <span><a href=\"stdmarks.jsp\">Marks Entry</a></span><br><hr>\n");
      out.write("        <span><a href=\"stdcertificate.jsp\">Certificates</a></span><br><hr>\n");
      out.write("        ");

            }else if(role.equals("S")){
        
      out.write("\n");
      out.write("        <span><a href=\"stconformation.jsp\">Approve Students</a></span><br><hr>\n");
      out.write("        <span><a href=\"stdpromote.jsp\">Promote Students</a></span><br><hr>\n");
      out.write("        ");

            }else if(role.equals("D")){
        
      out.write("        \n");
      out.write("        <span><a href=\"stdcertificates.jsp\">Print Certificates</a></span><br><hr>\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("    </div>\n");

    }else{

      out.write("    \n");
      out.write("    <div id=\"bl\">\n");
      out.write("        <a href=\"registrationform.jsp\"><button class=\"but\">REGISTRATION <sup id=\"sup\"  style=\"font-size: 12px; color:#541258;\">2018</sup></button></a><br>\n");
      out.write("        <a href=\"campusprogram.jsp\"><button class=\"but\">CAMPUS PROGRAMS</button></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"bottom\" style=\"margin-top:5px;\">\n");
      out.write("    <div id=\"d1\">Useful Link</div>\n");
      out.write("    <div id=\"d3\">\n");
      out.write("         <a href=\"https://www.mystudylife.com/\">MyStudyLife </button</a><br>\n");
      out.write("         <a href=\"https://keepmeout.com/en/\">KeepMeOut</a><br>\n");
      out.write("         <a href=\"https://habitica.com/static/front\">Habitica</a><br>\n");
      out.write("         <a href=\"https://en.todoist.com/\">Todoist</a><br>\n");
      out.write("         <a href=\"https://calendar.google.com/calendar/\">Google Calendar</a><br>\n");
      out.write("         <a href=\"https://www.dropbox.com/\">Dropbox</a><br>\n");
      out.write("         <a href=\"https://slack.com/\">Slack</a><br>\n");
      out.write("         <a href=\"https://unplugthetv.com/\">UnplugTheTV</a><br>\n");
      out.write("         <a href=\"https://www.edx.org/\">EdX</a><br>\n");
      out.write("         <a href=\"https://www.coursera.org/\">Coursera</a><br>\n");
      out.write("         <a href=\"https://www.udacity.com/\">Udacity</a><br>\n");
      out.write("         <a href=\"https://academicearth.org/\"> Academic Earth</a><br>\n");
      out.write("         <a href=\"https://www.codecademy.com/\"> Codecademy</a><br>\n");
      out.write("         <a href=\"https://www.lynda.com/\"> Lynda</a><br>\n");
      out.write("         <a href=\"https://www.udemy.com/\"> Udemy</a><br>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");

    }

      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("            <div id=\"middle\" style=\"width:83%;min-height: 600px;border-right:0px; \">\n");
      out.write("                <form id=\"courseForm\" name=\"courseForm\" method=\"POST\" action=\"ControllerAdministration\">\n");
      out.write("                <table style=\"width: 100%\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td valign=\"top\" style=\"width:30%\">\n");
      out.write("                                <table id=\"userC\" class=\"initC\">\n");
      out.write("                                    <thead>                            \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th colspan=\"2\">\n");
      out.write("                                                Manage User\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th style=\"width: 30%\">\n");
      out.write("                                                <label>Roles</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <select  class=\"select\" id=\"roles\" name=\"roles\">\n");
      out.write("                                                    <option value=\"\">-</option>\n");
      out.write("                                                    <option value=\"T\">Teacher</option>\n");
      out.write("                                                    <option value=\"S\">Staff</option>\n");
      out.write("                                                    <option value=\"L\">Librarian</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Email</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" class=\"inputtext\" id=\"userid\" name=\"userid\" placeholder=\"Enter the email\" maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Password</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"password\" class=\"inputtext\"  id=\"userpassword\" name=\"userpassword\" placeholder=\"Enter the Password\"  maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Confirm Password</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"password\" class=\"inputtext\"  id=\"conuserpassword\" name=\"conuserpassword\" placeholder=\"Enter the Confirm Password\"  maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>First Name</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" class=\"inputtext\" id=\"userfname\" name=\"userfname\" placeholder=\"Enter the First Name\"   maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Last Name</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" class=\"inputtext\" id=\"userlname\" name=\"userlname\" placeholder=\"Enter the Last Name\"   maxlength=\"50\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>DOB</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" class=\"inputtext\" id=\"dob\" name=\"dob\" maxlength=\"10\" placeholder=\"YYYY-MM-DD\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                        \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Gender</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <select  class=\"select\" id=\"gender\" name=\"gender\">\n");
      out.write("                                                    <option value=\"\">-</option>\n");
      out.write("                                                    <option value=\"M\">Male</option>\n");
      out.write("                                                    <option value=\"F\">Female</option>                                                   \n");
      out.write("                                                </select>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                            \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Address</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <textarea class=\"textarea\" id=\"address\" name=\"address\" placeholder=\"Enter the Address\"   maxlength=\"250\"></textarea>                                                    \n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>    \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Pin Code</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" class=\"inputtext\" id=\"pincode\" name=\"pincode\" placeholder=\"Enter the Pin Code\"   maxlength=\"6\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                         \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>\n");
      out.write("                                                <label>Mobile No.</label>\n");
      out.write("                                            </th>\n");
      out.write("                                            <th>\n");
      out.write("                                                <input type=\"text\" class=\"inputtext\" id=\"mobilenumber\" name=\"mobilenumber\" placeholder=\"Enter the Mobile No.\"   maxlength=\"10\"/>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>                                         \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th colspan=\"2\" style=\"text-align: center\">                                \n");
      out.write("                                                <button name=\"action\" value=\"1\">Insert</button>\n");
      out.write("                                            </th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                        </td>                                                                         \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td valign=\"top\">\n");
      out.write("                            <input type=\"hidden\" id=\"usercode\" name=\"usercode\"/>\n");
      out.write("                            <table class=\"initC\">\n");
      out.write("                                <tbead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>Slno</th>\n");
      out.write("                                        <th>Role</th>\n");
      out.write("                                        <th>UserId</th>\n");
      out.write("                                        <th>Name</th>\n");
      out.write("                                        <th>Gender</th>\n");
      out.write("                                        <th>Dob</th>\n");
      out.write("                                        <th>Address</th>\n");
      out.write("                                        <th>Mobile</th>\n");
      out.write("                                        <th>Action</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      out.print(listUserssS);
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </td>                    \n");
      out.write("                    <tr>\n");
      out.write("                    \n");
      out.write("                </table>   \n");
      out.write("                </form>\n");
      out.write("            </div>            \n");
      out.write("        </div>        \n");
      out.write("    </body>\n");
      out.write("    <script src=\"scripts/js/manageuser.js\" type=\"text/javascript\" ></script> \n");
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
