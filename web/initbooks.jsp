
<%@page import="java.util.List"%>
<%@page import="modles.MLibrary"%>
<%@page import="daos.DaoLibrarymanagement"%>
<%@page import="controllers.ControllerInitialization"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Initialization</title>
        <%@include file="common/headerfiles.jsp"%>
        <%@include file="authenticate.jsp"%>
        <%
            DaoLibrarymanagement lm = new DaoLibrarymanagement();
            List<MLibrary> list = lm.listBooks();
            String listBooksS="<table style='width:100%'>";
            
            listBooksS+= "<thead>";                             
            listBooksS+= "<tr>";                             
            listBooksS+= "<th>Name</th>";                             
            listBooksS+= "<th>Author</th>";                             
            listBooksS+= "<th>ISBN</th>";                             
            listBooksS+= "<th>Copies</th>";                             
            listBooksS+= "<th>Entrydate</th>";                             
            listBooksS+= "</tr>";             
            listBooksS+= "</thead>";             
            listBooksS+= "<tbody>";             
            for(MLibrary L:list){                
                listBooksS+= "<tr>";                             
                listBooksS+= "<td>"+L.getBookname()+"</td>";                             
                listBooksS+= "<td>"+L.getAuthor()+"</td>";                             
                listBooksS+= "<td>"+L.getIbsnnumber()+"</td>";                             
                listBooksS+= "<td>"+L.getCopies()+"</td>";                             
                listBooksS+= "<td>"+L.getEntrydate()+"</td>";                             
                listBooksS+= "</tr>";                             
            }
            listBooksS+= "</tbody>";             
            listBooksS+="</table>";

        %>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 600px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <table style="width: 100%">
                    <tr>
                        <td valign="top" style="width:30%">
                            <form id="booksForm" name="booksForm" method="POST" action="ControllerLibrary">
                                <table id="booksC" class="initC">
                                    <thead>                            
                                        <tr>
                                            <th colspan="2">
                                                Initialization of Books
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                Book Name
                                            </th>
                                            <th>
                                                <input type="text" id="bookname" name="bookname" class="inbook" maxlength="100"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                Author
                                            </th>                                            
                                            <th>
                                                <textarea id="author" name="author" class="inbook" maxlength="250"></textarea>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                ISBN No.
                                            </th>                                            
                                            <th>
                                                <input type="text" id="ibsnnumber" class="inbook" name="ibsnnumber" maxlength="20"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                Copies
                                            </th>                                            
                                            <th>
                                                <input type="text" id="copies" class="inbook" name="copies" maxlength="6"/>
                                            </th>
                                        </tr>                                        
                                        <tr>
                                            <th>
                                                &nbsp;
                                            </th>
                                            <th>                                
                                                <button name="action" value="1">Insert Books</button>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td colspan="2">
                                                <%=listBooksS%>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </form>
                        </td>                                                                         
                    </tr>                    
                </table>   

            </div>            
        </div>        
    </body>
    <!--<script src="scripts/js/initbooks.js" type="text/javascript" ></script>--> 
</html>

