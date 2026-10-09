
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="modles.MCourses"%>
<%@page import="daos.DaoInitialization"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
        <%@include file="common/headerfiles.jsp"%>
        <script src="scripts/js/registrationform.js"></script>
        <%
            DaoInitialization ci = new DaoInitialization();
            String listCoursesS = "<option value=''>-</option>";
            List<MCourses> listCourses = ci.listCourses();
            for (MCourses M : listCourses) {
                listCoursesS += "<option value=" + M.getCoursecode() + ">" + M.getCoursename() + "</option>";
            }

        %>        
    </head>
    <body>
        <%@include file="common/header.jsp"%>
        <div id="bodycontent">
            <div id="registration">
                <form id="registrationForm"  name="registrationForm" method="POST" action="ControllerAdministration">
                    <table id="table" border="0" style="width:100%; height:auto;">
                        <tr>
                            <th colspan="2" style="background:#B60000; color:white;">Online Application Form<br>ICFAI University Meghalaya Shillong</th>
                        </tr>
                        <tr>
                            <td style="text-align:right;">CAMPUS PROGRAM<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <select class="select" id="coursecode" name="coursecode" onblur="return(checkcoursecode());">
                                    <%=listCoursesS%>   
                                </select>
                                <div id="v1" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">FIRST NAME<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="text"  onblur="return(checkuserfname());" id="userfname" name="userfname" class="inputtext" maxlength="50" placeholder="Enter firsty name"/>
                                <div id="v2" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">LAST NAME<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="text" onblur="return(checkuserlname());" id="userlname" name="userlname" class="inputtext" maxlength="50" placeholder="Enter last name"/>
                                <div id="v3" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">DATE OF BIRTH<sup> <span style="color:red;font-size:16px;">(yyyy-mm-dd)</span>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="text" onblur="return(checkdob());" id="dob" name="dob" class="inputtext"/>
                                <div id="v4" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">GENDER<sup>*</sup> : </td>
                            <td>
                                <select id="gender" name="gender" onblur="return(checkgender());" class="select"> 
                                    <option value="">-</option>   
                                    <option value="M">Male</option>   
                                    <option value="F">Female</option>   
                                </select>
                                <div id="v5" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">ADDRESS<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <textarea id="address" name="address" onblur="return(checkaddress());" placeholder="Enter address" maxlength="250" class="textarea"></textarea>
                                <div id="v6" class="validate"></div>
                        </tr>
                        <tr>
                            <td style="text-align:right;">PIN CODE<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="text" onblur="return(checkpincode());" id="pincode" name="pincode"  class="inputtext" maxlength="6" placeholder="Enter pincode"/>
                                <div id="v7" class="validate"></div>
                            </td>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">MOBILE NUMBER<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="text" onblur="return(checkmobilenumber());" id="mobilenumber" name="mobilenumber"  class="inputtext"  maxlength="10" placeholder="Enter pincode"/>
                                <div id="v8" class="validate"></div>
                            </td>
                        </tr>

                        <tr>
                            <td style="text-align:right;">E-MAIL<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="text" onblur="return(checkuserid());" id="userid" name="userid" class="inputtext" maxlength="50" placeholder="Enter email id"/>
                                <div id="v9" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">PASSWORD<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="password" onblur="return(checkuserpassword());" id="userpassword" name="userpassword" class="inputtext" maxlength="50" placeholder="Enter password"/>
                                <div id="v10" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td style="text-align:right;">CONFIRM PASSWORD<sup>*</sup> : </td>
                            <td style="text-align:left;">
                                <input type="password" onblur="return(checkconuserpassword());" id="conuserpassword" name="conuserpassword" class="inputtext" maxlength="50" placeholder="confirm password"/>
                                <div id="v11" class="validate"></div>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2">
                                <table border="0" style="width:100%; height:auto;">
                                    <tr>
                                        <th colspan="4" style="background:#B60000; color:white;"> ACADEMIC RECORD: SCHOOL/ COLLEGE</th>
                                    </tr>
                                    <tr>
                                        <td>Class</td>
                                        <td>Name of the School/College</td>
                                        <td>Year of Passing</td>
                                        <td>% of Marks</td>
                                    </tr>
                                    <tr>
                                        <td>10th<sup>*</sup></td>
                                        <td>
                                            <input type="text" onblur="return(checkinstitute1());" id="institute1" name="institute" class="inputtext" placeholder=""/>

                                        </td>
                                        <td>
                                            <input type="text" onblur="return(checkpassingyear1());" id="passingyear1" name="passingyear"  class="inputtext" placeholder=""/>

                                        </td>
                                        <td>
                                            <input type="text" onblur="return(checkmarks1());" id="marks1" name="marks"  class="inputtext" placeholder=""/>

                                        </td>
                                    </tr>
                                    <tr>
                                        <td>12th<sup>*</sup></td>
                                        <td>
                                            <input type="text" onblur="return(checkinstitute2());"  id="institute2" name="institute" class="inputtext" placeholder=""/>

                                        </td>
                                        <td>
                                            <input type="text" onblur="return(checkpassingyear2());" id="passingyear2" name="passingyear" class="inputtext" placeholder=""/>

                                        </td>
                                        <td>
                                            <input type="text" onblur="return(checkmarks2());" id="marks2" name="marks" class="inputtext" placeholder=""/>

                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Graduation<sup>*</sup>(only for PG Student)</td>
                                        <td>
                                            <input type="text" onblur="return(checkinstitute3());" id="institute3" name="institute" class="inputtext" placeholder=""/>

                                        </td>
                                        <td>
                                            <input type="text" onblur="return(checkpassingyear3());" id="passingyear3" name="passingyear" class="inputtext" placeholder=""/>

                                        </td>
                                        <td>
                                            <input type="text" onblur="return(checkmarks3());" id="marks3" name="marks" class="inputtext" placeholder=""/>

                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="text-align:right;" colspan="4"><hr></td>
                                    </tr>
                                    <tr>
                                        <td style="text-align:right;" colspan="4">
                                            <button name="action" value="6" class="button">submit</button>   
                                            <input type="button" class="button" value="reset" onclick="resetIT();"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>

                        </tr>
                    </table>
                </form>
            </div>

        </div>
        <%@include file="common/footer.jsp"%>
    </body>
</html>

