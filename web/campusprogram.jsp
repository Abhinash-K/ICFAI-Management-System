<%@page import="modles.MPCourseSubjects"%>
<%@page import="modles.MSubjects"%>
<%@page import="modles.MCourses"%>
<%@page import="java.util.List"%>
<%@page import="daos.DaoInitialization"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Campus Programs</title>
        <%@include file="common/headerfiles.jsp"%>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="padding-left:60px;min-height:1160px; padding-right:80px;">
            <h1 style="text-align:center;"><span  style="color:blue;">CAMPUS PROGRAMS</span></h1>
            <div id="abouticfai" style="color:black;">
                <div id="events" style="padding:10px;"><img src="scripts/css/images/event2.jpg"  style="border:1px solid #4C4F4D; width:100%; height:380px; border-radius:15px 50px;"></div>
                <div style="padding:16px; padding-left:22px;">
                      <%
                        DaoInitialization ci = new DaoInitialization();
                        String listCoursesS1="",listCoursesS2="",a="",b="";
                        List<MCourses> listCourses = ci.listCourses();
                        for(MCourses M:listCourses){
                            a="<span  style='color:red;'>UG PROGRAMS</span><br>";
                            b="<span  style='color:red;'>PG PROGRAMS</span><br>";
                            if(M.getCoursename().startsWith("B"))
                            {
                                if(M.getCoursename().equals("BCA")){
                                    listCoursesS1+="<ul><li><a href='bcainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.Com")){
                                    listCoursesS1+="<ul><li><a href='bcominfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("BBA")){
                                    listCoursesS1+="<ul><li><a href='bbainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(Economics)")){
                                    listCoursesS1+="<ul><li><a href='baeconomicsinfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(Education)")){
                                    listCoursesS1+="<ul><li><a href='baeducation.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(English)")){
                                    listCoursesS1+="<ul><li><a href='baenglish.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("B.A.(Pol.Sc.)")){
                                    listCoursesS1+="<ul><li><a href='bapolsc.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("BTTM")){
                                    listCoursesS1+="<ul><li><a href='bttminfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else{
                                    listCoursesS1+="<ul><li><a href='info.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }
                            }else if(M.getCoursename().startsWith("M") || M.getCoursename().startsWith("I"))
                            {
                                if(M.getCoursename().equals("MBA")){
                                    listCoursesS2+="<ul><li><a href='mbainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("MTTM")){
                                    listCoursesS2+="<ul><li><a href='mttminfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("M.Com")){
                                    listCoursesS2+="<ul><li><a href='mcominfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("IMCA")){
                                    listCoursesS2+="<ul><li><a href='imcainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else if(M.getCoursename().equals("MCA")){
                                    listCoursesS2+="<ul><li><a href='mcainfo.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }else{
                                    listCoursesS2+="<ul><li><a href='info.jsp'>"+M.getCoursename()+"</a></li></ul>";
                                }
                            }
                        }
                    %>
                    <%=a%>
                    <%=listCoursesS1%>
                    <%=b%>
                    <%=listCoursesS2%>
              </div>
            </div>
        </div>
        <%@include file="common/footer.jsp"%>
    </body>
</html>

