
<%@page import="java.util.List"%>
<%@page import="modles.MLibrary"%>
<%@page import="daos.DaoLibrarymanagement"%>
<%@page import="controllers.ControllerInitialization"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Library</title>
        <%@include file="common/headerfiles.jsp"%>
        <%--<%@include file="authenticate.jsp"%>--%>
        <%
            
            String listBooksS="";
            String search=request.getParameter("search");
            if(search!=null)
            {   
                DaoLibrarymanagement lm = new DaoLibrarymanagement();
                List<MLibrary> list = lm.listBooksSearch(search);
                listBooksS="<table style='width:100%'>";            
                listBooksS+= "<thead>";                             
                listBooksS+= "<tr>";                             
                listBooksS+= "<th>Name</th>";                             
                listBooksS+= "<th>Author</th>";                             
                listBooksS+= "<th>ISBN</th>";                             
                listBooksS+= "<th>Copies Avilable</th>";                             
                listBooksS+= "<th>Entrydate</th>";                             
                listBooksS+= "<th>Issue</th>";                             
                listBooksS+= "</tr>";             
                listBooksS+= "</thead>";             
                listBooksS+= "<tbody>";             
                for(MLibrary L:list){                
                    listBooksS+= "<tr>";                             
                    listBooksS+= "<td>"+L.getBookname()+"</td>";                             
                    listBooksS+= "<td>"+L.getAuthor()+"</td>";                             
                    listBooksS+= "<td>"+L.getIbsnnumber()+"</td>";                             
                    listBooksS+= "<td>"+L.getAvailable()+"</td>";                             
                    listBooksS+= "<td>"+L.getEntrydate()+"</td>";                             
                    listBooksS+= "<td><input type='button' id="+L.getBookcode()+" value='Select' onclick='issusIt(this.id)'></td>";                             
                    listBooksS+= "</tr>";                             
                }
                listBooksS+= "</tbody>";             
                listBooksS+="</table>";
            }
        %>
        <script>
            function searchBook(){
                var search = document.getElementById("search").value;
                window.location="issuebook.jsp?search="+search;
            }
            function issusIt(bookcode){
                document.getElementById("bookcode").value=bookcode;
                document.getElementById("stddetails").style.display='block';
            }
        </script>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <center><h1>Issue Book</h1></enter>
                <form id="courseForm" name="courseForm" method="POST" action="ControllerLibrary">
                    <table id="courseC" class="initC" style="width: 100%">
                        <thead>                            
                            <tr>
                                <th>
                                    Enter Book Name/Author
                                </th>
                                <th>
                                    <input type="text" id="search" name="search" class="inputtext" maxlength="50"/>
                                </th>
                                <th>                                
                                    <input type="button" value="Search" class="button" onclick="searchBook()"/>
                                </th>
                            </tr>
                            <tr id="stddetails" style="display:none;">
                                <th>
                                    Enter Student Email/Mobile
                                </th>
                                <th>
                                    <input type="hidden" id="bookcode" name="bookcode" class="inputtext" />
                                    <input type="text" id="stdemid" name="stdemid" class="inputtext" maxlength="50"/>
                                </th>
                                <th>                                
                                    <button value="2" name="action" class="button">Issue</button>
                                </th>
                            </tr>      
                        </thead>
                        <tbody>
                            <tr>
                                <td colspan="3">
                                    <%=listBooksS%>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>

            </div>            
        </div>        
    </body>
    <!--<script src="scripts/js/managelibrary.js" type="text/javascript" ></script>--> 
</html>

