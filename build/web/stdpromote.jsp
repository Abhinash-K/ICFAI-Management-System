
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
        <title>Promote Students</title>
        <%@include file="common/headerfiles.jsp"%>
        <%@include file="authenticate.jsp" %>
        <%
            DaoInitialization ci = new DaoInitialization();
            String listCoursesS="<option value=''>-</option>";
            List<MCourses> listCourses = ci.listCourses();
            for(MCourses M:listCourses){
                listCoursesS+= "<option value="+M.getCoursecode()+">"+M.getCoursename()+"</option>";                
            }                        
            
            String listUserssS = "",coursecode="",semistercode="",regyear;
            coursecode = request.getParameter("coursecode");
            semistercode = request.getParameter("semistercode");
            regyear = request.getParameter("regyear");
            if(coursecode!=null && semistercode!=null && regyear!=null)
            {
                DaoAdministration da = new DaoAdministration();
                List<Conformation> listUserssP = da.listUserssP(coursecode,semistercode,regyear);
                int i = 0;
                for (Conformation U : listUserssP) 
                {
                    i++;                    
                    String action = "";
                    action += "<button name='action' id=" + U.getUsercode()+ " value='8' onclick='setUsercode(this.id)'>Promote</button>";
                    listUserssS += "<tr>";
                    listUserssS += "<td>" + i + "</td>";
                    listUserssS += "<td>" + U.getUserfname() + " " + U.getUserlname() + "</td>";
                    listUserssS += "<td>" + U.getUserid() + "</td>";
                    listUserssS += "<td>" + U.getMobilenumber() + "</td>";
                    listUserssS += "<td>" + U.getCoursename() + "</td>";
                    listUserssS += "<td>" + action + "</td>";
                    listUserssS += "</tr>";
                }
            }else{
                coursecode="";
                semistercode="";
                regyear="";
            }    


        %>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <center><h1>Promote Students</h1></center>
                <form id="courseForm" name="courseForm" method="POST" action="ControllerAdministration">
                    <input type="hidden" id="usercode" name="usercode"/>
                    <input type="hidden" id="ccode" name="ccode" value="<%=coursecode%>"/>
                    <input type="hidden" id="scode" name="scode" value="<%=semistercode%>"/>                    
                    <table class="initC">
                        <tbead>
                            <tr>
                                <th style="width:40%">Course</th>
                                <th style="width:40%">Semester</th>
                                <th style="width:10%">Registration Year</th>                                
                                <th>Action</th>
                            </tr>
                            <tr>
                                <th>
                                    <select id="coursecode" name="coursecode" class="select"> 
                                        <%=listCoursesS%>  
                                    </select>
                                </th>
                                <th>
                                    <select id="semistercode" name="semistercode" class="select"> 
                                        <option value="">-</option>   
                                        <option value="1">1st</option>    
                                        <option value="2">2nd</option>    
                                        <option value="3">3rd</option>    
                                        <option value="4">4th</option>    
                                        <option value="5">5th</option>    
                                        <option value="6">6th</option>    
                                    </select>                                    
                                </th>
                                <th>
                                    <input type="text" id="regyear" name="regyear" class="inputtext" value="<%=regyear%>"/>
                                </th>                                
                                <th>
                                    <input type="button" class="button" value="Submit" onclick="listStudents()"/>
                                </th>
                            </tr>
                        </tbead>                            
                    </table>                    
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
    <script>
        function setUsercode(usercode){
            document.getElementById("usercode").value=usercode;
        }
        function listStudents(){                
            var coursecode = document.getElementById("coursecode").value;
            var semistercode = document.getElementById("semistercode").value;
            var regyear = document.getElementById("regyear").value;
            window.location="stdpromote.jsp?coursecode="+coursecode+"&semistercode="+semistercode+"&regyear="+regyear;                
        }        
        document.getElementById("coursecode").value=document.getElementById("ccode").value;
        document.getElementById("semistercode").value=document.getElementById("scode").value;
    </script>
</html>

