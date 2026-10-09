

<%@page import="modles.TUserlogin"%>
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
        <title>User Management</title>
        <%@include file="common/headerfiles.jsp"%>
        <%@include file="authenticate.jsp"%>
        <%
            DaoAdministration da = new DaoAdministration();
            String listUserssS="";
            List<TUserlogin> listUserss = da.listUserss();
            int i=0;
            for(TUserlogin U:listUserss)
            {
                i++;
                String role1="-",gender="";
                if(U.getRoles().equals("T")){
                    role1="Teacher";
                }else if(U.getRoles().equals("L")){
                    role1="Librarian";
                }else if(U.getRoles().equals("S")){
                    role1="Staff";
                }
                
                if(U.getGender().equals("M")){
                    gender="Male";
                }else if(U.getGender().equals("F")){
                    gender="Female";
                }                
                String action="";
                if(U.getUserstatus().equals("Y")){
                    action+="<button name='action' id="+U.getUsercode()+" value='2' onclick='setUsercode(this.id)'>Disable User</button>";
                }
                if(U.getUserstatus().equals("N")){
                    action+="<button name='action' id="+U.getUsercode()+"  value='3' onclick='setUsercode(this.id)'>Enable User</button>";
                }
                action+="<button name='action' id="+U.getUsercode()+"  value='4' onclick='setUsercode(this.id)'>Reset Pass</button>";
                listUserssS +="<tr>";      
                listUserssS +="<td>"+i+"</td>";      
                listUserssS +="<td>"+role1+"</td>";      
                listUserssS +="<td>"+U.getUserid()+"</td>";      
                listUserssS +="<td>"+U.getUserfname()+" "+U.getUserlname()+"</td>";      
                listUserssS +="<td>"+gender+"</td>";      
                listUserssS +="<td>"+U.getDob()+"</td>";      
                listUserssS +="<td>"+U.getAddress()+"<br>"+U.getPincode()+"</td>";      
                listUserssS +="<td>"+U.getMobilenumber()+"</td>";      
                listUserssS +="<td>"+action+"</td>";      
                listUserssS +="</tr>";      
            }
       
            
        %>
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="min-height: 1200px;">
            <%@include file="common/left.jsp"%>
            <div id="middle" style="width:83%;min-height: 600px;border-right:0px; ">
                <form id="courseForm" name="courseForm" method="POST" action="ControllerAdministration">
                <table style="width: 100%">
                    <tr>
                        <td valign="top" style="width:30%">
                                <table id="userC" class="initC">
                                    <thead>                            
                                        <tr>
                                            <th colspan="2">
                                                Manage User
                                            </th>
                                        </tr>
                                        <tr>
                                            <th style="width: 30%">
                                                <label>Roles</label>
                                            </th>
                                            <th>
                                                <select  class="select" id="roles" name="roles">
                                                    <option value="">-</option>
                                                    <option value="T">Teacher</option>
                                                    <option value="S">Staff</option>
                                                    <option value="L">Librarian</option>
                                                </select>
                                            </th>
                                        </tr>                                        
                                        <tr>
                                            <th>
                                                <label>Email</label>
                                            </th>
                                            <th>
                                                <input type="text" class="inputtext" id="userid" name="userid" placeholder="Enter the email" maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <label>Password</label>
                                            </th>
                                            <th>
                                                <input type="password" class="inputtext"  id="userpassword" name="userpassword" placeholder="Enter the Password"  maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <label>Confirm Password</label>
                                            </th>
                                            <th>
                                                <input type="password" class="inputtext"  id="conuserpassword" name="conuserpassword" placeholder="Enter the Confirm Password"  maxlength="50"/>
                                            </th>
                                        </tr>
                                        <tr>
                                            <th>
                                                <label>First Name</label>
                                            </th>
                                            <th>
                                                <input type="text" class="inputtext" id="userfname" name="userfname" placeholder="Enter the First Name"   maxlength="50"/>
                                            </th>
                                        </tr>                                        
                                        <tr>
                                            <th>
                                                <label>Last Name</label>
                                            </th>
                                            <th>
                                                <input type="text" class="inputtext" id="userlname" name="userlname" placeholder="Enter the Last Name"   maxlength="50"/>
                                            </th>
                                        </tr>                                        
                                        <tr>
                                            <th>
                                                <label>DOB</label>
                                            </th>
                                            <th>
                                                <input type="text" class="inputtext" id="dob" name="dob" maxlength="10" placeholder="YYYY-MM-DD"/>
                                            </th>
                                        </tr>                                        
                                        <tr>
                                            <th>
                                                <label>Gender</label>
                                            </th>
                                            <th>
                                                <select  class="select" id="gender" name="gender">
                                                    <option value="">-</option>
                                                    <option value="M">Male</option>
                                                    <option value="F">Female</option>                                                   
                                                </select>
                                            </th>
                                        </tr>                                            
                                        <tr>
                                            <th>
                                                <label>Address</label>
                                            </th>
                                            <th>
                                                <textarea class="textarea" id="address" name="address" placeholder="Enter the Address"   maxlength="250"></textarea>                                                    
                                            </th>
                                        </tr>    
                                        <tr>
                                            <th>
                                                <label>Pin Code</label>
                                            </th>
                                            <th>
                                                <input type="text" class="inputtext" id="pincode" name="pincode" placeholder="Enter the Pin Code"   maxlength="6"/>
                                            </th>
                                        </tr>                                         
                                        <tr>
                                            <th>
                                                <label>Mobile No.</label>
                                            </th>
                                            <th>
                                                <input type="text" class="inputtext" id="mobilenumber" name="mobilenumber" placeholder="Enter the Mobile No."   maxlength="10"/>
                                            </th>
                                        </tr>                                         
                                        <tr>
                                            <th colspan="2" style="text-align: center">                                
                                                <button name="action" value="1">Insert</button>
                                            </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        
                                    </tbody>
                                </table>
                        </td>                                                                         
                    </tr>
                    <tr>
                        <td valign="top">
                            <input type="hidden" id="usercode" name="usercode"/>
                            <table class="initC">
                                <tbead>
                                    <tr>
                                        <th>Slno</th>
                                        <th>Role</th>
                                        <th>UserId</th>
                                        <th>Name</th>
                                        <th>Gender</th>
                                        <th>Dob</th>
                                        <th>Address</th>
                                        <th>Mobile</th>
                                        <th>Action</th>
                                    </tr>
                                </tbead>
                                <tbody>
                                    <%=listUserssS%>
                                </tbody>
                            </table>
                        </td>                    
                    <tr>
                    
                </table>   
                </form>
            </div>            
        </div>        
    </body>
    <script src="scripts/js/manageuser.js" type="text/javascript" ></script> 
</html>

