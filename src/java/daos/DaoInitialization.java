
package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import modles.MCourses;
import modles.MPCourseSubjects;
import modles.MSubjects;
import utility.CommonUtil;
import utility.DBconnection;

public class DaoInitialization 
{
    private String sql = "";    
    private ResultSet rs = null;
    private Connection con = null;
    private PreparedStatement pst = null;       
    
    public boolean insertCourse(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            String coursename = request.getParameter("coursename");
            String fee = request.getParameter("fee");
            String duration = request.getParameter("duration");
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                
                sql = "INSERT INTO m_courses(coursename,fee,duration) VALUES(?,?,?)"; 
                pst = con.prepareStatement(sql);       
                pst.setString(1, coursename);
                pst.setShort(2, Short.valueOf(fee));
                pst.setShort(3, Short.valueOf(duration));
                res=pst.executeUpdate()>0; 
            }
        } catch (Exception e) {
            System.out.println("Error in DaoInitialization.insertCourse(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoInitialization.insertCourse(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }     
    
    public List<MCourses> listCourses() 
    {
        List<MCourses> listCourses = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT * FROM m_courses";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Short coursecode=rs.getShort("coursecode");
                    String couresname=rs.getString("coursename");
                    Short fee=rs.getShort("fee");
                    Short duration=rs.getShort("duration");
                    listCourses.add(new MCourses(coursecode, couresname, fee, duration));
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoInitialization.listCourses() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoInitialization.listCourses() : " + e);
            }
        }
        return listCourses;
    }         
    
    
    public boolean insertSubject(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            String subjectname = request.getParameter("subjectname");
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                
                sql = "INSERT INTO m_subjects(subjectname) VALUES(?)"; 
                pst = con.prepareStatement(sql);       
                pst.setString(1, subjectname);
                res=pst.executeUpdate()>0; 
            }
        } catch (Exception e) {
            System.out.println("Error in DaoInitialization.insertSubject(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoInitialization.insertSubject(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }     
    
    public List<MSubjects> listSubjects() 
    {
        List<MSubjects> listSubjects = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT * FROM m_subjects";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Short subjectcode=rs.getShort("subjectcode");
                    String subjectname=rs.getString("subjectname");
                    listSubjects.add(new MSubjects(subjectcode,subjectname));
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoInitialization.listSubjects() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoInitialization.listSubjects() : " + e);
            }
        }
        return listSubjects;
    }       
    
    
    public boolean insertCourseSubjects(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            String coursecode = request.getParameter("course");
            String subjectcodes[] = request.getParameterValues("subjects");
            int sl = subjectcodes.length;
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                sql = "DELETE FROM mp_coursesubjects WHERE coursecode=?"; 
                pst = con.prepareStatement(sql); 
                pst.setShort(1, Short.valueOf(coursecode));
                res=pst.executeUpdate()>= 0;   
                
                sql = "INSERT INTO mp_coursesubjects(coursecode,subjectcode) VALUES(?,?)"; 
                pst = con.prepareStatement(sql);   
                for(int i=0;i<sl;i++){                   
                    pst.setShort(1, Short.valueOf(coursecode));
                    pst.setShort(2, Short.valueOf(subjectcodes[i].trim()));
                    pst.addBatch();
                }
                res=pst.executeBatch().length >= 0;                                
            }
        } catch (Exception e) {
            System.out.println("Error in DaoInitialization.insertCourseSubjects(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoInitialization.insertCourseSubjects(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }       
    
    public List<MPCourseSubjects> listCourseSubjects() 
    {
        List<MPCourseSubjects> listCourseSubjects = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT CS.coursecode,coursename,CS.subjectcode,subjectname FROM mp_coursesubjects CS "
                   +"INNER JOIN m_courses C ON C.coursecode=CS.coursecode "
                   +"INNER JOIN m_subjects S ON S.subjectcode=CS.subjectcode "
                   +"ORDER BY coursecode,subjectcode ";
                pst = con.prepareStatement(sql); 
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Short coursecode   =rs.getShort("coursecode");
                    String coursename  =rs.getString("coursename");
                    Short subjectcode  =rs.getShort("subjectcode");
                    String subjectname =rs.getString("subjectname");
                    listCourseSubjects.add(new MPCourseSubjects(coursecode, coursename, subjectcode, subjectname));
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoInitialization.listCourseSubjects() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoInitialization.listCourseSubjects() : " + e);
            }
        }
        return listCourseSubjects;
    }     
 
    public List<MPCourseSubjects> listCourseSubjects(String ccode) 
    {
        List<MPCourseSubjects> listCourseSubjects = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT CS.coursecode,coursename,CS.subjectcode,subjectname FROM mp_coursesubjects CS "
                   +"INNER JOIN m_courses C ON C.coursecode=CS.coursecode "
                   +"INNER JOIN m_subjects S ON S.subjectcode=CS.subjectcode "
                   +"WHERE CS.coursecode="+ccode+" "
                   +"ORDER BY coursecode,subjectcode ";
                pst = con.prepareStatement(sql); 
                rs = pst.executeQuery();
                while(rs.next())
                {
                    Short coursecode   =rs.getShort("coursecode");
                    String coursename  =rs.getString("coursename");
                    Short subjectcode  =rs.getShort("subjectcode");
                    String subjectname =rs.getString("subjectname");
                    listCourseSubjects.add(new MPCourseSubjects(coursecode, coursename, subjectcode, subjectname));
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoInitialization.listCourseSubjects(String coursecode) : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoInitialization.listCourseSubjects(String coursecode) : " + e);
            }
        }
        return listCourseSubjects;
    }      
     
            
}
