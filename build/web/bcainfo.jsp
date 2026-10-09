
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BCA Program | The ICFAI University Shillong</title>
        <%@include file="common/headerfiles.jsp"%>
        <script>
            function bca1()
            {
                var data="";
                data="<span style='color:blue'>ABOUT THE PROGRAM</span><br>";
                data+="<p>The Bachelor of Computer Applications (BCA) program provides a sound academic base in computer skills and applications from which an advanced career in computer applications can be developed. The students get a good conceptual grounding in computer usage and its practical business applications. </p>";
                data+="<span style='color:blue'>Duration :</span><br>";
                data+="<p>Three years.</p>";
                data+="<span style='color:blue'>Eligibility :</span><br>";
                data+="<p> Pass in Class XII (any discipline).<br>Students awaiting results are also eligible to apply. </p>"
                data+="<span style='color:blue'>Program Structure :</span><br>";
                data+="<p> The BCA Program is organized into 6 semesters in 3 years. There are 30 courses including soft skills. Students are additionally required to do two summer projects at the end of Year-I and Year-II respectively and an Internship in the sixth semester. </p>"
                data+="<span style='color:blue'>Elective Streams :</span><br>";
                data+="<p>During the 5th semester, students are exposed to elective courses in their respective field of specialization. These elective courses provide an understanding of the specialized focus fields. </p>"
                data+="<span style='color:blue'>Electives : </span><br>";
                data+="<p>E Commerce, Computer Graphics, Mobile Computing & Wireless Markup Language, Data Warehousing and Data Mining, Compiler Design, Structured Query Language and Database Applications, Artificial Intelligence, Advanced Java Programming, Multimedia Systems, Intranet Administration, Network Programming, Theory of Computations, Management Information Systems, Software Testing and Quality Management, IT Project. </p>";
                data+="<div style='padding:20px;'><table border='1' style='width:60%;border-collapse:collapse;'>";
                data+="<tr><td colspan='3'><center>BCA Program Structure</center></td></tr>";
                data+="<tr><td>&nbsp;</td><td style='padding:10px;'>Semester-I</td><td style='padding:10px;'>Semester-II</td></tr>";
                data+="<tr><td style='padding:10px;'>YEAR I</td><td><ul><li>English Language Skills - I</li>";
                data+="<li>Information Technology Trends</li><li>Mathematics - I</li><li>Probability & Statistics</li><li>Principles of Management</li><li>Computer Programming - I</li></ul></td>";
                data+="<td><ul><li>English Language Skills - II</li>";
                data+="<li>Fundamentals of Finance & Accounting</li><li>Mathematics - II</li><li>Computer Organization</li><li>Principles of Economics</li><li>Computer Programming - II</li></ul></td></tr>";
                data+="<tr><td colspan='3'><center>Summer Project I</center></td></tr>";
                data+="<tr><td>&nbsp;</td><td style='padding:10px;'>Semester-III</td><td style='padding:10px;'>Semester-IV</td></tr>";
                data+="<tr><td style='padding:10px;'>YEAR II</td><td><ul><li>System Analysis & Design</li>";
                data+="<li>Database Management Systems</li><li>Data Structures & Algorithms</li><li>Operations Research</li><li>Technical Report Writing</li><li>Object Oriented Programming</li></ul></td>";
                data+="<td><ul><li>Software Engineering</li>";
                data+="<li>Soft Skills</li><li>Dot Net Technologies</li><li>Operating Systems</li><li>Web Technologies</li><li>Java Programming</li></ul></td></tr>";
                data+="<tr><td colspan='3'><center>Summer Project II</center></td></tr>";
                data+="<tr><td>&nbsp;</td><td style='padding:10px;'>Semester-V</td><td style='padding:10px;'>Semester-VI</td></tr>";
                data+="<tr><td style='padding:10px;'>YEAR III</td><td><ul><li>Data Communication & Computer Networks</li>";
                data+="<li>ASP.Net</li><li>Elective - I</li><li>Elective - II</li><li>Elective - III</li><li>Elective - IV</li></ul></td>";
                data+="<td><ul><li>Internship</li></ul></td></tr>";
                data+="</table></div><br>";
                document.getElementById("abouticfai").innerHTML=data;
            }
            function bca2()
            {
                var data="";
                data+="<span style='color:red;font-size:140%;'>ADMISSION MODALITIES</span><br><br>";
                data+="<span style='color:blue'>Eligibility:</span><br>";
                data+="<ul><li>Pass in Class XII (any discipline). Students awaiting final examinations results are also eligible to apply.</li>";
                data+="<br><li>Students of Class XII who have not received the original certificates from the Board by July 15, 2018 will be admitted provisionally. Their admission will be confirmed subject to their passing the qualifying examination. The registration of the candidates not meeting the criteria by September 15, 2018 will be cancelled and admission fee will be forfeited and only 50% of the semester fee will be refunded after notifying the cancellation of the seat by the University.</li></ul>";
                data+="<span style='color:blue'>Admission Criteria :</span><br>";
                data+="<ul><li> The selection of applicants into the Program is made through screening of applications and interview. While evaluating students for admission, due weightage is given to their academic distinction, awards in sports/cultural events, debates, quizzes and other extra cocurricular activities.</li>";
                data+="<br><li> Original certificates and Domicile certificate should be produced for verification at the time of payment of first semester fee. The original certificates will be returned after verification.</li></ul>";
                data+="<span style='color:blue'>Special Reservation :</span><br>";
                data+="<ul><li>  There shall be a special provision for admission of students belonging to the State of Meghalaya in any course of ICFAI University, Meghalaya, which shall not be less than 25 (twenty five) per cent of seats in each course / discipline subject to the students meeting the minimum qualifying requirements referred to above.</li>";
                data+="<br><li> Seats remaining unfilled under special reservation may be filled up by allotting the same to students belonging to Open Category.</li></ul>";
                data+="<br><span style='color:red;font-size:140%;'>APPLICATION MODALITIES</span><br><br>";
                data+="<span style='color:blue'>Guidelines on how to Complete the Application Form :</span><br>";
                data+="<p>The applicants are advised to read the guidelines carefully before completing the Application Form for Admission.</p>";
                data+="<span style='color:blue'>Application Form </span><br>";
                data+="<p>1.Please make sure that you meet the eligibility criteria before filling up the form.";
                data+="<br>2.Fill the Application Form in Capital Letters.<br>3.Provide all the available information under appropriate sections.";
                data+="<br>4.Make sure to sign the Application Form.<br>5.Retain a photocopy of the completed Application Form.";
                data+="<br>6.DD for Rs. 300.</p><br>";
                data+="<span style='color:blue'>Attested Copies of Certificates :</span><br>";
                data+=" Applicants have to enclose attested copies of the following certificates (Attestation should be done by any Gazetted Officer/Principal of the College). ";
                data+="<ul><li> Date of Birth Certificate/Class X Certificate. </li><li> Marksheet of Class XII/Degree certificate (as may be applicable). </li>";
                data+="<li> Domicile Certificate. </li><li> Any other certificates pertaining to academic and other activities. </li><li> Please paste your recent passport size colour photograph on the Application Form given on next page. </li></ul><br>";
                data+="<span style='color:blue'>Submission of Application Form :</span><br>";
                data+="<p> The completed Application Form for Admission along with a DD for Rs. 300 (drawn in favour of ‘The ICFAI University, Meghalaya - Fee Collection A/c’) may be submitted to:</p><br><br>";
                data+="<span style='color:blue'>The Admissions Officer,</span><br>";
                data+="<span style='color:gray'>The ICFAI University, Meghalaya,</span><br>";
                data+="<span style='color:gray'>Address :</span> Danakgre, (Near BSF Camp), P O Araimile,<br>";
                data+="<span style='color:gray'>Phone :</span> 9436716440<br>";
                data+="<span style='color:gray'>Shillong Campus:</span> Phawa Ville, Near Shillong Law College, Dhankheti,<br>";
                data+="<span style='color:gray'>Phone No: </span> 0364-2220057, 9485158603<br>";
                data+="<span style='color:gray'>E-mail:</span> admissions@iumeghalaya.edu.in<br>";
                data+="<span style='color:gray'>Website:</span> www.iumeghalaya.edu.in <br>";
                document.getElementById("abouticfai").innerHTML=data;
            }
            function bca3()
            {
                var data="";
                data+="<span style='color:red;font-size:140%;'>FEE SCHEDULE</span><br><br>";
                data+="<span style='color:blue'>Fee :</span><br>";
                data+="<p> Admission Fee of Rs. 5,000 for UG Programs is to be paid by all the selected candidates immediately after the admission decision is announced. * Foreign students have to pay an admission fee of Rs. 6,000 for UG programs and Rs. 12,000 for PG Programs. The last date for payment of admission fee is June 29, 2018.</p>";
                data+="<span style='color:blue'>Program Fee :</span><br>";
                data+="<p> Students have to pay the program fee at the beginning of each semester, as per the due dates which will be indicated in the Student Handbook. The first semester fee is to be paid on or before July 10, 2018.</p>";
                data+="<span style='color:blue'>Domicile : </span><br>";
                data+="<p> Students from State of Meghalaya.</p>";
                data+="<span style='color:blue'>Non-Domicile :</span><br>";
                data+="<p> Students from States other than Meghalaya. </p>";
                data+="<div style='padding:20px;'><table border='1' style='width:60%;border-collapse:collapse;'>";
                data+="<tr><td rowspan='2'>Programs</td><td colspan='3'><center>Fee per semester (Rs.)</center></td><td colspan='3'><center>Total Program Fee (Rs.) </center></td></tr>"
                data+="<tr><td>Domicile</td><td>Non- Domicile</td><td>International</td><td>Domicile</td><td>Non- Domicile</td><td>International</td></tr>";
                data+="<tr><td>BCA <br>(6 semesters)</td><td>16,800</td><td>24,300</td><td>30,300</td><td>1,00,800</td><td>1,45,800</td><td>1,81,800</td></tr>";
                data+="</table>";
                data+="<br><p> All payments should be made by way of Demand Draft in favor of 'The ICFAI University, Meghalaya - Fee Collection A/c ' payable at Tura / Shillong, Meghalaya. </p>";
                document.getElementById("abouticfai").innerHTML=data;
            }
        </script>
    </head>
    <body onload="bca1();">
        <%@include file="common/header.jsp"%>
        <div id="bodycontent" style="padding-left:60px;min-height:1560px; padding-right:80px;">
            <br><br>
            <center>
                <table border="1px solid black;">
                    <button style="width:20%; min-height:10%; font-size:20px;" onclick="bca1();">Program info</button>
                    <button style="width:20%;min-height:10%;font-size:20px;" onclick="bca2();">Admission</button>
                    <button style="width:20%;min-height:10%;font-size:20px;" onclick="bca3();">Fee Structure</button>
                </table>
            </center>
            <br>
            <div id="abouticfai" style="color:black;">
                
            </div>
        </div>
    </body>
</html>

