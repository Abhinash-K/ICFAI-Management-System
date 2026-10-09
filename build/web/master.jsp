
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
        <title>Master</title>
        <%@include file="common/headerfiles.jsp"%>
        <%//            DaoInitialization ci = new DaoInitialization();
//            String listCoursesS="",listCoursesS1="";
//            List<MCourses> listCourses = ci.listCourses();
//            for(MCourses M:listCourses){
//                String cdt=M.getCoursename()+"<br>Duration : "+M.getDuration()+" Years<br>Fee : Rs."+M.getFee()+"/-";
//                listCoursesS+= "<tr><td>"+cdt+"</td></tr>";
//                listCoursesS1+= "<option value="+M.getCoursecode()+">"+M.getCoursename()+"</option>";                
//            }

        %>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <table style="width: 100%">
                    <tr>
                        <td valign="top" style="width:30%">
                            <form id="courseForm" name="courseForm" method="POST" action="ControllerInitialization">
                                <table id="courseC" class="initC">
                                    <thead>                            
                                        <tr>
                                            <th>
                                                Init Courses
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <input type="text" id="coursename" name="coursename" maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>                                
                                                <button name="action" value="1">Insert Courses</button>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </form>
                        </td>                                                                         
                    </tr>
                    <!--                    <tr>
                                            <td valign="top">-------</td>                    
                                        <tr>
                    -->
                </table>   

            </div>            
        </div>        
    </body>
    <script src="scripts/js/manageuser.js" type="text/javascript" ></script> 
</html>

