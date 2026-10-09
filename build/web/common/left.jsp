<div id="left" class="cdiv">
<%
    String role = (String)request.getSession().getAttribute("role");
    if(role!=null)
    {   
%>    
    <div id="al">
        <%            
            if(role.equals("A"))
            {   
        %>
        <span><a href="initialization.jsp">Initialization</a></span><br><hr>        
        <span><a href="manageuser.jsp">Manage User</a></span><br><hr>       
        <%
            }else if(role.equals("L")){
        %>
        <span><a href="initbooks.jsp">Book Initialization</a></span><br><hr>  
        <span><a href="issuebook.jsp">Issue Book</a></span><br><hr>  
        <span><a href="returnbook.jsp">Return Book</a></span><br><hr>  
        <%
            }else if(role.equals("T")){
        %>          
        <span><a href="stdmarks.jsp">Marks Entry</a></span><br><hr>
        <span><a href="stdcertificate.jsp">Certificates</a></span><br><hr>
        <%
            }else if(role.equals("S")){
        %>
        <span><a href="stconformation.jsp">Approve Students</a></span><br><hr>
        <span><a href="stdpromote.jsp">Promote Students</a></span><br><hr>
        <%
            }else if(role.equals("D")){
        %>        
        <span><a href="stdcertificates.jsp">Print Certificates</a></span><br><hr>
        <%
            }
        %>
    </div>
<%
    }else{
%>    
    <div id="bl">
        <a href="registrationform.jsp"><button class="but">REGISTRATION <sup id="sup"  style="font-size: 12px; color:#541258;">2018</sup></button></a><br>
        <a href="campusprogram.jsp"><button class="but">CAMPUS PROGRAMS</button></a>
    </div>
    <div class="bottom" style="margin-top:5px;">
    <div id="d1">Useful Link</div>
    <div id="d3">
         <a href="https://www.mystudylife.com/">MyStudyLife </button</a><br>
         <a href="https://keepmeout.com/en/">KeepMeOut</a><br>
         <a href="https://habitica.com/static/front">Habitica</a><br>
         <a href="https://en.todoist.com/">Todoist</a><br>
         <a href="https://calendar.google.com/calendar/">Google Calendar</a><br>
         <a href="https://www.dropbox.com/">Dropbox</a><br>
         <a href="https://slack.com/">Slack</a><br>
         <a href="https://unplugthetv.com/">UnplugTheTV</a><br>
         <a href="https://www.edx.org/">EdX</a><br>
         <a href="https://www.coursera.org/">Coursera</a><br>
         <a href="https://www.udacity.com/">Udacity</a><br>
         <a href="https://academicearth.org/"> Academic Earth</a><br>
         <a href="https://www.codecademy.com/"> Codecademy</a><br>
         <a href="https://www.lynda.com/"> Lynda</a><br>
         <a href="https://www.udemy.com/"> Udemy</a><br>
    </div>
</div>

<%
    }
%>
</div>