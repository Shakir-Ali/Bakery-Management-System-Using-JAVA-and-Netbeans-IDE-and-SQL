package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends JConnect {
    JConnect jconnect = new JConnect();
    Connection conn = jconnect.javaConnect("bakery");
    String ClassName;
    public Login(String s)
    {
        ClassName=s;
    }
        
    public  boolean isLogin(String user,String pass) throws SQLException
    {   String Un = null,Pass = null;
        String query = "SELECT id,pass FROM "+ClassName+" Where id='"+user+"'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next())
        {
            Un = rs.getString("id");
            Pass = rs.getString("pass");

        } //end of while 
        if(Un.equals(user)&&Pass.equals(pass))
            return true;
        else
            return false;
    }
        
}