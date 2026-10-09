
package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import modles.Certificatre;
import modles.Conformation;
import modles.TMarks;
import modles.TUserlogin;
import utility.CommonUtil;
import utility.DBconnection;

public class DaoAdministration 
{
    private String sql = "";    
    private ResultSet rs = null;
    private Connection con = null;
    private PreparedStatement pst = null; 
    
    public boolean insertUsers(HttpServletRequest request)
    {  
        boolean res=false;        
        CommonUtil cu = new CommonUtil();
        try 
        {       
            sql="SELECT MAX(usercode) FROM t_userlogin";
            Integer usercode = cu.getNextValue(sql);     
            String userid = request.getParameter("userid").trim();
            String userpassword = request.getParameter("userpassword").trim();
            String userfname = request.getParameter("userfname").trim();
            String userlname = request.getParameter("userlname").trim();
            String dob = request.getParameter("dob").trim();
            String gender = request.getParameter("gender").trim();
            String address = request.getParameter("address").trim();
            String pincode = request.getParameter("pincode").trim();
            String mobilenumber = request.getParameter("mobilenumber").trim();
            String userstatus = "Y";
            String roles = request.getParameter("roles").trim();
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                sql = "INSERT INTO t_userlogin(usercode,userid,userpassword,userfname,userlname,dob,gender,address,pincode,mobilenumber,userstatus,roles) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)"; 
                pst = con.prepareStatement(sql);       
                pst.setInt(1, usercode);
                pst.setString(2, userid);
                pst.setString(3, userpassword);
                pst.setString(4, userfname);
                pst.setString(5, userlname);
                pst.setDate(6, Date.valueOf(dob));
                pst.setString(7, gender);
                pst.setString(8, address);
                pst.setString(9, pincode);
                pst.setString(10, mobilenumber);
                pst.setString(11, userstatus);
                pst.setString(12, roles);
                res=pst.executeUpdate()>0;                              
            }
        } catch (Exception e) {
            System.out.println("Error in DaoAdministration.insertUsers(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoAdministration.insertUsers(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }  
    
    public List<TUserlogin> listUserss() 
    {
        List<TUserlogin> listUserss = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT * FROM t_userlogin WHERE roles!='A' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
       
                    TUserlogin us =new TUserlogin();
                    us.setUsercode(rs.getInt("usercode"));
                    us.setUserid(rs.getString("userid"));
                    us.setUserpassword(rs.getString("userpassword"));
                    us.setUserfname(rs.getString("userfname"));
                    us.setUserlname(rs.getString("userlname"));
                    us.setDob(rs.getString("dob"));
                    us.setGender(rs.getString("gender"));
                    us.setAddress(rs.getString("address"));
                    us.setPincode(rs.getString("pincode"));
                    us.setMobilenumber(rs.getString("mobilenumber"));
                    us.setUserstatus(rs.getString("userstatus"));
                    us.setRoles(rs.getString("roles"));                                                            
                    listUserss.add(us);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.listUserss() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.listUserss() : " + e);
            }
        }
        return listUserss;
    }     
    
    
    public boolean enbdisUser(HttpServletRequest request,String userstatus)
    {  
        boolean res=false;        
        try 
        {       
            Integer usercode = Integer.valueOf(request.getParameter("usercode").trim());
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                sql = "UPDATE t_userlogin SET userstatus=? WHERE usercode=? ";
                pst = con.prepareStatement(sql);       
                pst.setString(1,userstatus);
                pst.setInt(2,usercode);
                res=pst.executeUpdate()>0;                              
            }
        }catch(Exception e) {
            System.out.println("Error in DaoAdministration.enbdisUser(HttpServletRequest request,String userstatus) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoAdministration.enbdisUser(HttpServletRequest request,String userstatus) : " + ex);
                }
            }
        }  
        return res;
    }      
    
    public boolean resetPassword(Integer usercode,String userpassword)
    {  
        boolean res=false;        
        try 
        {       
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                sql = "UPDATE t_userlogin SET userpassword=? WHERE usercode=? ";
                pst = con.prepareStatement(sql);       
                pst.setString(1,userpassword);
                pst.setInt(2,usercode);
                res=pst.executeUpdate()>0;                              
            }
        } catch (Exception e) {
            System.out.println("Error in DaoAdministration.resetPassword(Integer usercode,String userpassword) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoAdministration.resetPassword(Integer usercode,String userpassword) : " + ex);
                }
            }
        }  
        return res;
    }    
    
    
    public TUserlogin checkLogin(String userid,String userpassword) 
    {
        TUserlogin us = new TUserlogin();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT * FROM t_userlogin WHERE userstatus='Y' AND userid=? AND userpassword=? ";
                pst = con.prepareStatement(sql);
                pst.setString(1, userid);
                pst.setString(2, userpassword);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    us.setUsercode(rs.getInt("usercode"));
                    us.setUserid(rs.getString("userid"));
                    us.setUserpassword(rs.getString("userpassword"));
                    us.setUserfname(rs.getString("userfname"));
                    us.setUserlname(rs.getString("userlname"));
                    us.setDob(rs.getString("dob"));
                    us.setGender(rs.getString("gender"));
                    us.setAddress(rs.getString("address"));
                    us.setPincode(rs.getString("pincode"));
                    us.setMobilenumber(rs.getString("mobilenumber"));
                    us.setUserstatus(rs.getString("userstatus"));
                    us.setRoles(rs.getString("roles"));                                                            
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.checkLogin(String userid,String userpassword) : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.checkLogin(String userid,String userpassword) : " + e);
            }
        }
        return us;
    }     
    
    public boolean insertStudentdetails(HttpServletRequest request)
    {  
        boolean res=false;        
        CommonUtil cu = new CommonUtil();
        try 
        {       
            sql="SELECT MAX(usercode) FROM t_userlogin";
            Integer usercode = cu.getNextValue(sql);     
            
            String coursecode = request.getParameter("coursecode").trim();
            String userid = request.getParameter("userid").trim();
            String userpassword = request.getParameter("userpassword").trim();
            String userfname = request.getParameter("userfname").trim();
            String userlname = request.getParameter("userlname").trim();
            String dob = request.getParameter("dob").trim();
            String gender = request.getParameter("gender").trim();
            String address = request.getParameter("address").trim();
            String pincode = request.getParameter("pincode").trim();
            String mobilenumber = request.getParameter("mobilenumber").trim();                        
            String userstatus = "N";
            String roles="D";
            Short semistercode=1;
            String ispresent="Y";
            String[] institute=request.getParameterValues("institute");
            String[] passingyear=request.getParameterValues("passingyear");
            String[] marks=request.getParameterValues("marks");
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                sql = "INSERT INTO t_userlogin(usercode,userid,userpassword,userfname,userlname,dob,gender,address,pincode,mobilenumber,userstatus,roles) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)"; 
                pst = con.prepareStatement(sql);       
                pst.setInt(1, usercode);
                pst.setString(2, userid);
                pst.setString(3, userpassword);
                pst.setString(4, userfname);
                pst.setString(5, userlname);
                pst.setDate(6, Date.valueOf(dob));
                pst.setString(7, gender);
                pst.setString(8, address);
                pst.setString(9, pincode);
                pst.setString(10, mobilenumber);
                pst.setString(11, userstatus);
                pst.setString(12, roles);
                res=pst.executeUpdate()>0;    
                if(res)
                {
                    sql = "INSERT INTO t_usercourses(usercode,coursecode,semistercode,ispresent) "
                        + "VALUES(?,?,?,?)"; 
                    pst = con.prepareStatement(sql);       
                    pst.setInt(1, usercode);
                    pst.setShort(2, Short.valueOf(coursecode));
                    pst.setShort(3,semistercode);
                    pst.setString(4, ispresent);
                    res=pst.executeUpdate()>0;                    
                }
                if(res)
                {                    
                    sql = "INSERT INTO t_qualification(usercode,qualificationid,qualificationname,institute,passingyear,percentage) "
                        + "VALUES(?,?,?,?,?,?)"; 
                    pst = con.prepareStatement(sql);
                    int i=0;
                    for(i=0;i<institute.length;i++)
                    {
                        String qualificationname="";
                        if(i==0){
                            qualificationname="10th";
                        }else if(i==1){
                            qualificationname="12th";
                        }else if(i==2){
                            qualificationname="Graduation";
                        }
                        pst.setInt(1, usercode);
                        pst.setString(2, usercode+"E"+i);
                        pst.setString(3,qualificationname);
                        pst.setString(4, institute[i]);
                        pst.setShort(5, Short.valueOf(passingyear[i]));
                        pst.setShort(6, Short.valueOf(marks[i]));
                        pst.addBatch();
                    }    
                    res=pst.executeBatch().length >= 0;                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in DaoAdministration.insertStudentdetails(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoAdministration.insertStudentdetails(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }  
    
    public List<Conformation> listUserssD() 
    {
        List<Conformation> listUserssD = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT L.usercode,userfname,userlname,userid,mobilenumber,coursename FROM t_userlogin L " +
                    "INNER JOIN t_usercourses UC ON UC.usercode=L.usercode " +
                    "INNER JOIN m_courses C ON C.coursecode=UC.coursecode " +
                    "WHERE UC.semistercode=1 AND L.userstatus='N' AND L.roles='D' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Conformation us =new Conformation();
                    us.setUsercode(rs.getInt("usercode"));
                    us.setUserfname(rs.getString("userfname"));
                    us.setUserlname(rs.getString("userlname"));
                    us.setUserid(rs.getString("userid"));
                    us.setMobilenumber(rs.getString("mobilenumber"));
                    us.setCoursename(rs.getString("coursename"));                                                           
                    listUserssD.add(us);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.listUserssD() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.listUserssD() : " + e);
            }
        }
        return listUserssD;
    }     
    
    
    public List<Conformation> listUserssP(String coursecode,String semistercode,String regyear) 
    {
        List<Conformation> listUserssD = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT L.usercode,userfname,userlname,userid,mobilenumber,coursename FROM t_userlogin L " +
                    "INNER JOIN t_usercourses UC ON UC.usercode=L.usercode " +
                    "INNER JOIN m_courses C ON C.coursecode=UC.coursecode " +
                    "WHERE L.userstatus='Y' AND L.roles='D' AND UC.ispresent='Y' "+
                    "AND UC.coursecode="+coursecode+" AND UC.semistercode="+semistercode+" AND YEAR(L.entrydate)="+regyear+" ";                
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Conformation us =new Conformation();
                    us.setUsercode(rs.getInt("usercode"));
                    us.setUserfname(rs.getString("userfname"));
                    us.setUserlname(rs.getString("userlname"));
                    us.setUserid(rs.getString("userid"));
                    us.setMobilenumber(rs.getString("mobilenumber"));
                    us.setCoursename(rs.getString("coursename"));                                                           
                    listUserssD.add(us);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.listUserssP() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.listUserssP() : " + e);
            }
        }
        return listUserssD;
    } 
    
    
    public boolean promote(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            String regyear = request.getParameter("regyear");
            Integer ccode = Integer.valueOf(request.getParameter("ccode"));
            Integer scode = Integer.valueOf(request.getParameter("scode"));
            Integer usercode = Integer.valueOf(request.getParameter("usercode"));
            CommonUtil cu = new CommonUtil();
            con = DBconnection.getConnection();
            if (con != null) 
            {                                    
                if(usercode!=null)
                {
                    sql ="UPDATE t_usercourses SET ispresent='N' WHERE usercode="+usercode+" "; 
                    pst = con.prepareStatement(sql);       
                    res=pst.executeUpdate()>0;                         
                    
                    if(res)
                    {
                        sql = "INSERT INTO t_usercourses(usercode,coursecode,semistercode,ispresent) VALUES(?,?,?,?)"; 
                        pst = con.prepareStatement(sql);       
                        pst.setInt(1, usercode);
                        pst.setInt(2, ccode);
                        pst.setInt(3, scode+1);
                        pst.setString(4, "Y");
                        res=pst.executeUpdate()>0;
                    }
                }    

            }
        } catch (Exception e) {
            System.out.println("Error in DaoLibrarymanagement.promote(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoLibrarymanagement.promote(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }      
    
    
    public boolean insertMarks(HttpServletRequest request)
    {  
        boolean res=false;                
        try 
        {                  
            String regyear = request.getParameter("regyear");
            String coursecode = request.getParameter("coursecode");
            String semistercode = request.getParameter("semistercode");                       
            String subjectcode = request.getParameter("subjectcode");                       
            String[] usercodes=request.getParameterValues("usercode");            
            String[] marks=request.getParameterValues("marks");
            con = DBconnection.getConnection();
            if (con != null) 
            {                                           
                sql = "DELETE FROM t_marks WHERE coursecode=? AND semistercode=?  AND subjectcode=? AND YEAR(entrydate)=? ";   
                pst = con.prepareStatement(sql);                 
                pst.setShort(1, Short.valueOf(coursecode));
                pst.setShort(2, Short.valueOf(semistercode));
                pst.setShort(3, Short.valueOf(subjectcode));                
                pst.setShort(4, Short.valueOf(regyear));
                res=pst.executeUpdate()>= 0; 
                
                sql = "INSERT INTO t_marks(usercode,coursecode,semistercode,subjectcode,marks) "
                    + "VALUES(?,?,?,?,?)"; 
                pst = con.prepareStatement(sql);
                int i=0;
                for(i=0;i<marks.length;i++)
                {                    
                    if(marks[i].trim().length()>0)
                    {
                        pst.setInt(1, Integer.valueOf(usercodes[i].trim()));
                        pst.setShort(2, Short.valueOf(coursecode.trim()));
                        pst.setShort(3,Short.valueOf(semistercode.trim()));
                        pst.setShort(4, Short.valueOf(subjectcode.trim()));
                        pst.setShort(5, Short.valueOf(marks[i].trim()));                        
                        pst.addBatch();
                    }    
                }    
                res=pst.executeBatch().length >= 0;                    
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error in DaoAdministration.insertMarks(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoAdministration.insertMarks(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }     
    
    
    
    public List<Conformation> listUserssC(String coursecode,String semistercode,String regyear) 
    {
        List<Conformation> listUserssD = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT L.usercode,userfname,userlname,userid,mobilenumber,coursename FROM t_userlogin L " +
                    "INNER JOIN t_usercourses UC ON UC.usercode=L.usercode " +
                    "INNER JOIN m_courses C ON C.coursecode=UC.coursecode " +
                    "WHERE L.userstatus='Y' AND L.roles='D' "+
                    "AND UC.coursecode="+coursecode+" AND UC.semistercode="+semistercode+" AND YEAR(L.entrydate)="+regyear+" ";                
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Conformation us =new Conformation();
                    us.setUsercode(rs.getInt("usercode"));
                    us.setUserfname(rs.getString("userfname"));
                    us.setUserlname(rs.getString("userlname"));
                    us.setUserid(rs.getString("userid"));
                    us.setMobilenumber(rs.getString("mobilenumber"));
                    us.setCoursename(rs.getString("coursename"));                                                           
                    listUserssD.add(us);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.listUserssP() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.listUserssP() : " + e);
            }
        }
        return listUserssD;
    }
    
    public List<TMarks> getMarks(String coursecode,String semistercode,String regyear,String usercode) 
    {
        List<TMarks> list = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT T.usercode,userfname,userlname,coursename,subjectname,marks, " +
                    "YEAR(U.entrydate) AS regyear,CONCAT(YEAR(U.entrydate),coursename,T.usercode) AS rollno " +
                    "FROM t_marks T " +
                    "INNER JOIN t_userlogin U ON U.usercode=T.usercode " +
                    "INNER JOIN m_subjects S ON S.subjectcode=T.subjectcode " +
                    "INNER JOIN m_courses C ON C.coursecode=T.coursecode " +
                    "WHERE U.userstatus='Y' AND U.roles='D' AND U.usercode="+usercode+" "+
                    "AND T.coursecode="+coursecode+" AND T.semistercode="+semistercode+" AND YEAR(U.entrydate)="+regyear+" ";                
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    TMarks us =new TMarks();
                    us.setUsercode(rs.getInt("usercode"));
                    us.setUserfname(rs.getString("userfname"));
                    us.setUserlname(rs.getString("userlname"));
                    us.setCoursename(rs.getString("coursename"));
                    us.setSubjectname(rs.getString("subjectname"));
                    us.setMarks(rs.getShort("marks"));
                    us.setRegyear(rs.getShort("regyear"));
                    us.setRollno(rs.getString("rollno"));                                                                           
                    list.add(us);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.getMarks(String coursecode,String semistercode,String regyear,String usercode) : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.getMarks(String coursecode,String semistercode,String regyear,String usercode) : " + e);
            }
        }
        return list;
    }     
    
    public List<Certificatre> listCertificatre(String usercode) 
    {
        List<Certificatre> list = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT UC.usercode,UC.coursecode,UC.semistercode,coursename,YEAR(U.entrydate) AS regyear FROM t_usercourses UC " +
                    "INNER JOIN m_courses C ON C.coursecode=UC.coursecode " +
                    "INNER JOIN t_userlogin U ON U.usercode=UC.usercode " +
                    "WHERE U.userstatus='Y' AND U.roles='D' AND U.usercode="+usercode+" "+
                    "ORDER BY UC.coursecode,UC.semistercode ";                    
                System.out.println("SQL : "+sql);
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Certificatre us =new Certificatre();
                    us.setUsercode(rs.getInt("usercode"));
                    us.setCoursecode(rs.getShort("coursecode"));
                    us.setCoursename(rs.getString("coursename"));
                    us.setSemistercode(rs.getShort("semistercode"));
                    us.setRegyear(rs.getShort("regyear"));
                    list.add(us);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoAdministration.listCertificatre(String usercode)  : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoAdministration.listCertificatre(String usercode)  : " + e);
            }
        }
        return list;
    }       
    
}
