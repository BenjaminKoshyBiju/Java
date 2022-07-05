import java.sql.*;
import java.io.*;
public class Jdbc
{
    public static void main(String[] args) 
    {try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=null;
        
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Orcl","HR","oRACLE123");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("Select *from ben");
            while(rs.next())
            {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}