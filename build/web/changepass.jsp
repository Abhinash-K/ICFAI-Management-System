
<%@page import="modles.TUserlogin"%>
<%@page import="daos.DaoAdministration"%>
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
        <title>Change Password</title>
        <%@include file="common/headerfiles.jsp"%>
        <%@include file="authenticate.jsp"%>

    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <form id="courseForm" name="courseForm" method="POST" action="ControllerAdministration">
                    <table style="width: 100%">
                        <tr>
                            <td valign="top" style="width:30%">
                                <table id="userC" class="initC">
                                    <thead>                            

                                        <tr>
                                            <th>
                                                <label>Password</label>
                                            </th>
                                            <th>
                                                <input type="password" class="inputtext"  id="userpassword" name="userpassword" maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <label>Confirm Password</label>
                                            </th>
                                            <th>
                                                <input type="password" class="inputtext"  id="conuserpassword" name="conuserpassword" maxlength="50"/>
                                            </th>
                                        </tr>

                                        <tr>
                                            <th colspan="2" style="text-align: center">                                
                                                <button name="action" value="5">Submit
                                                </button>
                                            </th>
                                        </tr>
                                    </thead>
                                </table>
                            </td>                                                                         
                        </tr>
                    </table>   
                </form>
            </div>            
        </div>        
    </body>
    <script src="scripts/js/manageuser.js" type="text/javascript" ></script> 
</html>

