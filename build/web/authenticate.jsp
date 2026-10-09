<%
    String roleaut = (String)request.getSession().getAttribute("role");
    if(roleaut==null)
    {  
        response.sendRedirect("logout.jsp"); 
    }
%>