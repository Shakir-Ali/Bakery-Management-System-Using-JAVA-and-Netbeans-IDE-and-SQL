package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class JConnect {
    public  Connection javaConnect(String s){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+s+"","root","");
            System.out.println("Connected");
            return con;
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
      
    }
    
            
    
}
