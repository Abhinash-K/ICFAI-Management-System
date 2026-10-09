
package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonUtil 
{
    private String sql = "";    
    private ResultSet rs = null;
    private Connection con = null;
    private PreparedStatement ps = null;   
    
    public int getNextValue(final String sql) 
    {
        int slno = 1;
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    slno = rs.getInt(1)+1;
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in CommonUtil.getNextValue(String sql) : " + e);
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in CommonUtil.getNextValue(String sql) : " + e);
            }
        }
        return slno;
    } 
    
    public String getFieldValue(final String sql) 
    {
        String data = null;
        try 
        {
            con = DBconnection.getConnection();
            if (con != null) 
            {
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();
                while(rs.next()){
                    data = rs.getString(1);
                }
            }
        } catch (SQLException e) {            
            System.out.println("Error in CommonUtil.getFieldValue(final String sql) : " + e);
        } finally {
            try {
                if (ps != null) {ps.close();}
                if (rs != null) {rs.close();}
                if (con != null) {con.close();}
            } catch (SQLException e) {
                System.out.println("Error in CommonUtil.getFieldValue(final String sql) : " + e);
            }
        }
        return data;
    }      
    
}
