<%
    String username = (String)request.getSession().getAttribute("username");
%>
<div id="headcontact">
    <div id="left">
        <img src="scripts/css/images/icfai.png" style="width: 40%">
    </div>
    <div id="right">
        <a href="IBS.jsp">IBS</a>&nbsp;|
        <a href="happenings.jsp">Happenings</a>&nbsp;|
        <a href="Placements.jsp">Placements</a>&nbsp;|
        <a href="contact.jsp">Contact</a>&nbsp;&nbsp;
        <a href="https://www.facebook.com/thangflipmate/"><img src="scripts/css/images/facebook.png" align="center" vspace=20></a>
        <a href="https://twitter.com/icfaiofficial"><img src="scripts/css/images/twitter.png" align="center"></a>
        <a href="https://www.youtube.com/channel/UC5KoZDDGw1n7hwdNopNszOA"><img src="scripts/css/images/youtube.png" align="center"></a>
        <a href="http://in.linkedin.com/in/icfaiofficial"><img src="scripts/css/images/linkedin.png" align="center"></a>
        <a href="https://plus.google.com/114231297122642777392"><img src="scripts/css/images/google_plus.png" align="center"></a>&nbsp;&nbsp;
        <span>
            <a href="Ranking.jsp">Rankings</a>&nbsp;|
            <a href="Awards.jsp">Awards</a>
        </span>
    </div>
</div>
<div id="menus">
    <span><a href="index.jsp">Home</a></span>&nbsp;|
    <span><a href="igroup.jsp">ICFAI Group</a></span>&nbsp;|
    <span><a href="aboutus.jsp">About us</a></span>&nbsp;|
    <span><a href="contactus.jsp">Contact us</a></span>&nbsp;|
    <span><a href="faculty.jsp">Faculty</a></span>&nbsp;|
    <span><a href="gallery.jsp">Gallery</a></span>&nbsp;|
    <%
        if(username!=null)
        {   
    %>  
    <span style="text-align:right;"><a href="changepass.jsp">Change Password</a>&nbsp;|
    <a href="logout.jsp">Logout</a></span>
    <%
        }else {   
    %>    
    <span><a href="login.jsp">Login</a></span>
    <%
        } 
    %>     
</div>
<span style="float:right">    
<%
    if(username!=null){
        out.print("Logged in User : "+username);
    }
%>
</span>    