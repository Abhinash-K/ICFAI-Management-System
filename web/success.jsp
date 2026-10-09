
<%@page import="modles.MPCourseSubjects"%>
<%@page import="modles.MSubjects"%>
<%@page import="java.util.List"%>
<%@page import="modles.MCourses"%>
<%@page import="daos.DaoInitialization"%>
<%@page import="controllers.ControllerInitialization"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
        <%@include file="common/headerfiles.jsp"%>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <br><br><br>
                <table style="width: 60%;margin :0 auto; ">
                    <tr>
                        <td valign="top" style="width:30%">
                            <h2>
                                <%
                                    String opt=request.getParameter("opt");
                                    if(opt.equals("1")){
                                        out.print("Passsword changed successfully");
                                    }else if(opt.equals("2")){
                                        out.print("Registration completed sucessfully.");
                                        out.print("<p>For official work please visite the office.</p>");
                                    }else if(opt.equals("3")){
                                        out.print("Unable to process.Please check your details.");
                                    }else if(opt.equals("4")){
                                        out.print("book issued successfully.");
                                    }else if(opt.equals("5")){
                                        out.print("book not issued.");
                                    }else if(opt.equals("6")){
                                        out.print("book return successfully.");
                                    }else if(opt.equals("7")){
                                        out.print("book not return.");
                                    }
                                %>                                                              
                            </h2>
                        </td>                                                                         
                    </tr>
                </table>   
            </div>            
        </div>        
    </body>
</html>

