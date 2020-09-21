
package pack;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
   private static Connection con;
    static{
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sameer","1234");
            
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
    }
    public static Connection getConncetion(){
       return con;
    }
}
