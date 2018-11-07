package data;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionDB {

Connection conn = null;      
    public static Connection connectDB(){
        try{
             Class.forName("com.mysql.jdbc.Driver");             //załądowanie sterownika
             Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kingym", "root", "Samsung188");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
