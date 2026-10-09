
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
        <title>Home</title>
        <%@include file="common/headerfiles.jsp"%>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <br><br><br>
                <table style="width: 60%;margin :0 auto; ">
                    <tr>
                        <td valign="top" style="width:30%">
                            <h2>Welcome to Icfai</h2>
                        </td>                                                                         
                    </tr>
                </table>   
            </div>            
        </div>        
    </body>
    <script src="scripts/js/home.js" type="text/javascript" ></script> 
</html>

