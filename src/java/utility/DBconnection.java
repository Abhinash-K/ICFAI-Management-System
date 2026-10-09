
package utility;

import java.sql.*;

public class DBconnection 
{    
    public static Connection getConnection()
    {
        Connection con=null;
        String driver   = "com.mysql.jdbc.Driver";      			
        String user     = "root"; 
        String password = "root";
        String dbname   = "icfai";
        String url      = "jdbc:mysql://localhost:3306/"+dbname;	
        try
        {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url,user,password);			
            return con;
        }catch(Exception e){
            System.out.println("Unable to connect : "+e);
        }
        return null;        
    }	  
}
