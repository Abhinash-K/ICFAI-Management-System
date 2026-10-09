
<%@page import="modles.MPCourseSubjects"%>
<%@page import="modles.MSubjects"%>
<%@page import="modles.MSubjects"%>
<%@page import="modles.MCourses"%>
<%@page import="java.util.List"%>
<%@page import="daos.DaoInitialization"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Initialization</title>
        <%@include file="common/headerfiles.jsp"%>
        <%@include file="authenticate.jsp"%>
        <%
            DaoInitialization ci = new DaoInitialization();
            String listCoursesS="",listCoursesS1="";
            List<MCourses> listCourses = ci.listCourses();
            for(MCourses M:listCourses){
                String cdt=M.getCoursename()+"<br>Duration : "+M.getDuration()+" Years<br>Fee : Rs."+M.getFee()+"/-";
                listCoursesS+= "<tr><td>"+cdt+"</td></tr>";
                listCoursesS1+= "<option value="+M.getCoursecode()+">"+M.getCoursename()+"</option>";                
            }
            
            String listSubjectsS="",listSubjectsS1="";
            List<MSubjects> listSubjects = ci.listSubjects();
            for(MSubjects S:listSubjects){
                listSubjectsS+= "<tr><td>"+S.getSubjectname()+"</td></tr>";
                listSubjectsS1+= "<tr><td colspan='2'><input type='checkbox' name='subjects' value="+S.getSubjectcode()+" /> "+S.getSubjectname()+"</td></tr>";                
            }  
            
            String listCourseSubjectsS="";
            List<MPCourseSubjects> listCourseSubjects = ci.listCourseSubjects();
            for(MPCourseSubjects CS:listCourseSubjects){
                listCourseSubjectsS+= "<tr><td style='width:20%'>"+CS.getCoursename()+"</td><td>"+CS.getSubjectname()+"</td></tr>";
            }            
            
        %>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="height:1400px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;height:auto;border-right:0px; ">
                <table style="width: 100%">
                    <tr>
                        <td valign="top" style="width:30%">
                            <form id="courseForm" name="courseForm" method="POST" action="ControllerInitialization">
                                <table id="courseC" class="initC">
                                    <thead>                            
                                        <tr>
                                            <th style="text-align: center">
                                                Init Courses
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <input type="text" class="inputtext" id="coursename" name="coursename" placeholder="Enter the course" maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr> 
                                            <th>
                                                <input type="text" class="inputtext" id="fee" name="fee" placeholder="Enter the Free"  maxlength="6"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <input type="text" class="inputtext" id="duration" name="duration" placeholder="Enter the duration"  maxlength="6"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th style="text-align: center">                                
                                                <button name="action" value="1">Insert Courses</button>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%=listCoursesS%>
                                    </tbody>
                                </table>
                            </form>
                        </td> 
                        <td valign="top" style="width:30%">
                            <form id="subjectForm" name="subjectForm" method="POST" action="ControllerInitialization">
                                <table id="subjectS" class="initC">
                                    <thead>                            
                                        <tr>
                                            <th style="text-align: center">
                                                Init Subject
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <input type="text" class="inputtext" id="subjectname" name="subjectname" placeholder="Enter the Subject"  maxlength="50"/>
                                            </th>
                                        </tr>

                                        <tr>
                                            <th style="text-align: center">                                
                                                <button name="action" value="2">Insert Subjects</button>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%=listSubjectsS%>
                                    </tbody>
                                </table>
                            </form>   
                        </td>
                        <td valign="top" style="width:30%">
                            <form id="coursesubjectForm" name="coursesubjectForm" method="POST" action="ControllerInitialization">
                                <table id="coursesubjectC" class="initC">
                                    <thead>                            
                                        <tr>
                                            <th colspan="2" style="text-align: center">
                                                Map Courses+Subject
                                            </th>
                                        </tr>                                        
                                        <tr>
                                            <th colspan="2">
                                                <select  class="select" id="course"  name="course">
                                                    <option value="">-</option>
                                                    <%=listCoursesS1%>
                                                </select>
                                            </th>
                                        </tr>
                                        <%=listSubjectsS1%>
                                        <tr>
                                            <th colspan="2" style="text-align: center">                                
                                                <button name="action" value="3">Mapping Course+Subjects</button>
                                            </th>
                                        </tr>
                                    </thead>  
                                    <tbody>
                                        <%=listCourseSubjectsS%>
                                    </tbody>
                                </table>
                            </form>
                        </td>                         
                    </tr>
                </table>   

            </div>            
        </div>        
    </body>
    <script src="scripts/js/initialization.js" type="text/javascript" ></script> 
</html>

