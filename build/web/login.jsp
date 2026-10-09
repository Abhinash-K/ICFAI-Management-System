
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
        <title>Login</title>
        <%@include file="common/headerfiles.jsp"%>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <div id="middle" style="width:100%;min-height: 600px;border:0px;">
                <table style="width: 60%;margin :0 auto; ">
                    <tr>
                        <td valign="top">
                            <form id="loginForm" name="loginForm" method="POST" action="ControllerLogin">
                                <br><br><br>
                                <table id="courseC" class="initC">
                                    <thead> 
                                        <tr>
                                            <th colspan="2" style="text-align: center;font-size: 20px;">
                                                Login
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <label>User Id : </label>
                                            </th>
                                            <th>
                                                <input type="text" id="userid" class="inputtext" name="userid" maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <label>Password : </label>
                                            </th>                                            
                                            <th>
                                                <input type="password" id="userpassword" class="inputtext" name="userpassword" maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th  colspan="2" style="text-align: center;font-size: 20px;">                                 
                                                <button name="action" >Login</button>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>

                                    </tbody>
                                </table>
                            </form>
                        </td>                                                                         
                    </tr>
                </table>   

            </div>            
        </div>        
    </body>
    <script src="scripts/js/login.js" type="text/javascript" ></script> 
</html>

