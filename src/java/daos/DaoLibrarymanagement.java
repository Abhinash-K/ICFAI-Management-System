
package daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import modles.MLibrary;
import utility.CommonUtil;
import utility.DBconnection;


public class DaoLibrarymanagement 
{
    private String sql = "";    
    private ResultSet rs = null;
    private Connection con = null;
    private PreparedStatement pst = null;   
    
    public boolean insertBooks(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            String bookname = request.getParameter("bookname");
            String author = request.getParameter("author");
            String ibsnnumber = request.getParameter("ibsnnumber");
            Short copies = Short.valueOf(request.getParameter("copies"));
            Short available = copies;
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                
                sql = "INSERT INTO m_library(bookname,author,ibsnnumber,copies,available) VALUES(?,?,?,?,?)"; 
                pst = con.prepareStatement(sql);       
                pst.setString(1, bookname);
                pst.setString(2, author);
                pst.setString(3, ibsnnumber);
                pst.setShort(4, copies);
                pst.setShort(5, available);
                res=pst.executeUpdate()>0; 
            }
        } catch (Exception e) {
            System.out.println("Error in DaoLibrarymanagement.insertBooks(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoLibrarymanagement.insertBooks(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }   
    
    public List<MLibrary> listBooks() 
    {
        List<MLibrary> list = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT bookcode,bookname,author,ibsnnumber,copies,available,DATE_FORMAT(entrydate,'%Y-%m-%d' ) AS entrydate FROM m_library ORDER BY bookcode DESC ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    MLibrary b =new MLibrary();
                    b.setBookcode(rs.getInt("bookcode"));
                    b.setBookname(rs.getString("bookname"));
                    b.setAuthor(rs.getString("author"));
                    b.setIbsnnumber(rs.getString("ibsnnumber"));
                    b.setCopies(rs.getShort("copies"));
                    b.setAvailable(rs.getShort("available"));                                                                        
                    b.setEntrydate(rs.getString("entrydate"));                                                                        
                    list.add(b);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoLibrarymanagement.listBooks() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoLibrarymanagement.listBooks() : " + e);
            }
        }
        return list;
    }   
    
    
    public List<MLibrary> listBooksSearch(String search) 
    {
        List<MLibrary> list = new ArrayList<>();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT bookcode,bookname,author,ibsnnumber,copies,available,DATE_FORMAT(entrydate,'%Y-%m-%d' ) AS entrydate FROM m_library ";
                sql+="WHERE (UPPER(bookname) LIKE '%"+search.toUpperCase()+"%' OR UPPER(author) LIKE '%"+search.toUpperCase()+"%') AND available>0 ";
                sql+="ORDER BY bookcode DESC ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    MLibrary b =new MLibrary();
                    b.setBookcode(rs.getInt("bookcode"));
                    b.setBookname(rs.getString("bookname"));
                    b.setAuthor(rs.getString("author"));
                    b.setIbsnnumber(rs.getString("ibsnnumber"));
                    b.setCopies(rs.getShort("copies"));
                    b.setAvailable(rs.getShort("available"));                                                                        
                    b.setEntrydate(rs.getString("entrydate"));                                                                        
                    list.add(b);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoLibrarymanagement.listBooks() : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoLibrarymanagement.listBooks() : " + e);
            }
        }
        return list;
    }         
    
    public boolean issusBook(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            Integer bookcode = Integer.valueOf(request.getParameter("bookcode"));
            String stdemid = request.getParameter("stdemid");
            String usercode=null;
            CommonUtil cu = new CommonUtil();
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                
                sql="SELECT usercode FROM t_userlogin WHERE userid='"+stdemid+"' OR mobilenumber='"+stdemid+"' ";
                usercode=cu.getFieldValue(sql);
                
                if(usercode!=null)
                {
                    sql = "INSERT INTO t_bookissues(usercode,bookcode) VALUES(?,?)"; 
                    pst = con.prepareStatement(sql);       
                    pst.setInt(1, Integer.valueOf(usercode));
                    pst.setInt(2, bookcode);
                    res=pst.executeUpdate()>0;
                    
                    if(res)
                    {
                        sql = "UPDATE m_library SET available=available-1"; 
                        pst = con.prepareStatement(sql);       
                        res=pst.executeUpdate()>0; 
                    }
                }    

            }
        } catch (Exception e) {
            System.out.println("Error in DaoLibrarymanagement.issusBook(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoLibrarymanagement.issusBook(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }  
    
    public List<MLibrary> listUserBooks(String stdemid) 
    {
        List<MLibrary> list = new ArrayList<>();
        String usercode=null;
        CommonUtil cu = new CommonUtil();
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                sql="SELECT usercode FROM t_userlogin WHERE userid='"+stdemid+"' OR mobilenumber='"+stdemid+"' ";
                usercode=cu.getFieldValue(sql);
                
                sql="SELECT L.bookcode,bookname,author,ibsnnumber,copies,available,DATE_FORMAT(issuedate,'%Y-%m-%d' ) AS entrydate ";
                sql+="FROM m_library L,t_bookissues B ";
                sql+="WHERE L.bookcode=B.bookcode AND usercode= "+usercode+" ";
                sql+="ORDER BY entrydate DESC ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next())
                {
                    MLibrary b =new MLibrary();
                    b.setBookcode(rs.getInt("bookcode"));
                    b.setBookname(rs.getString("bookname"));
                    b.setAuthor(rs.getString("author"));
                    b.setIbsnnumber(rs.getString("ibsnnumber"));
                    b.setCopies(rs.getShort("copies"));
                    b.setAvailable(rs.getShort("available"));                                                                        
                    b.setEntrydate(rs.getString("entrydate"));                                                                        
                    list.add(b);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in DaoLibrarymanagement.listUserBooks(String stdemid) : " + e);
        } finally {
            try {
                if (pst != null) {pst.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in DaoLibrarymanagement.listUserBooks(String stdemid) : " + e);
            }
        }
        return list;
    }  
    
    public boolean returnBook(HttpServletRequest request)
    {  
        boolean res=false;        
        try 
        {       
            Integer bookcode = Integer.valueOf(request.getParameter("bookcode"));
            String stdemid = request.getParameter("stdemid");
            String usercode=null;
            CommonUtil cu = new CommonUtil();
            con = DBconnection.getConnection();
            if (con != null) 
            {                    
                
                sql="SELECT usercode FROM t_userlogin WHERE userid='"+stdemid+"' OR mobilenumber='"+stdemid+"' ";
                usercode=cu.getFieldValue(sql);
                
                if(usercode!=null)
                {
                    sql = "UPDATE t_bookissues SET issuestatus='R' WHERE usercode=? AND bookcode=?"; 
                    pst = con.prepareStatement(sql);       
                    pst.setInt(1, Integer.valueOf(usercode));
                    pst.setInt(2, bookcode);
                    res=pst.executeUpdate()>0;
                    
                    if(res)
                    {
                        sql = "UPDATE m_library SET available=available+1"; 
                        pst = con.prepareStatement(sql);       
                        res=pst.executeUpdate()>0; 
                    }
                }    

            }
        } catch (Exception e) {
            System.out.println("Error in DaoLibrarymanagement.returnBook(HttpServletRequest request) : " + e);
        } finally {
            if (con != null) 
            {
                try 
                {
                    if (pst != null) {pst.close();}                
                    con.close();
                } catch (SQLException ex) {
                    System.out.println("Finally Error in DaoLibrarymanagement.returnBook(HttpServletRequest request) : " + ex);
                }
            }
        }  
        return res;
    }      
    
    
}
