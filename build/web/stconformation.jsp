
<%@page import="modles.TUserlogin"%>
<%@page import="modles.Conformation"%>
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
        <title>Approve Students</title>
        <%@include file="common/headerfiles.jsp"%>
        <% // @include file="authenticate.jsp" %>
        <%
            DaoAdministration da = new DaoAdministration();
            String listUserssS = "";
            List<Conformation> listUserssD = da.listUserssD();
            int i = 0;
            for (Conformation U : listUserssD) {
                i++;
                String role1 = "-";
                String action = "";
                action += "<button name='action' id=" + U.getUsercode()+ "  value='7' onclick='setUsercode(this.id)'>Approve</button>";
                listUserssS += "<tr>";
                listUserssS += "<td>" + i + "</td>";
                listUserssS += "<td>" + U.getUserfname() + " " + U.getUserlname() + "</td>";
                listUserssS += "<td>" + U.getUserid() + "</td>";
                listUserssS += "<td>" + U.getMobilenumber() + "</td>";
                listUserssS += "<td>" + U.getCoursename() + "</td>";
                listUserssS += "<td>" + action + "</td>";
                listUserssS += "</tr>";
            }


        %>
        <script>
            function setUsercode(usercode){
                document.getElementById("usercode").value=usercode;
            }
        </script>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <center><h1>Approve Students</h1></center>
                <form id="courseForm" name="courseForm" method="POST" action="ControllerAdministration">
                    <input type="hidden" id="usercode" name="usercode"/>
                    <table class="initC">
                        <tbead>
                            <tr>
                                <th>Sl.no.</th>
                                <th>Name</th>
                                <th>E-mail</th>
                                <th>Mobile Number</th>
                                <th>Course Name</th>
                                <th>Action</th>
                            </tr>
                        </tbead>    
                        <tbody>
                            <%=listUserssS%>
                        </tbody>
                    </table>
                </form>
            </div>            
        </div>        
    </body>
    <script src="scripts/js/manageuser.js" type="text/javascript" ></script> 
</html>

