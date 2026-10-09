
<%@page import="modles.Certificatre"%>
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
        <title>Print Certificates</title>
        <%@include file="common/headerfiles.jsp"%>
        <%     
            Integer usercode = Integer.valueOf((Integer)request.getSession().getAttribute("usercode"));
            String link="";            
            if(usercode!=null)
            {
                DaoAdministration da = new DaoAdministration();
                List<Certificatre> list=da.listCertificatre(usercode+"");                
                for(Certificatre C:list)
                {            
                    String lk="certificate.jsp?coursecode="+C.getCoursecode()+"&semistercode="+C.getSemistercode()+"&regyear="+C.getRegyear()+"&usercode="+usercode;
                    link+="<a href='"+lk+"' target='_blank'>"+C.getCoursename()+" ("+C.getSemistercode()+" Sem)</a><br>";                                      
                }                                 
            }
        %>        
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">                
                <table style="width: 60%;margin :0 auto; ">
                    <tr>
                        <td valign="top" style="width:30%">
                            <h2>Print Certificates</h2>
                            <%=link%>
                        </td>                                                                         
                    </tr>
                </table>   
            </div>            
        </div>        
    </body>
    <script src="scripts/js/home.js" type="text/javascript" ></script> 
</html>

