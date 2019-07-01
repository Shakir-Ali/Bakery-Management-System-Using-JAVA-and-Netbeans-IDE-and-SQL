
package Classes;

import  classes.JConnect;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdminTable {
    
    
    JConnect jconnect = new JConnect();
    Connection conn = jconnect.javaConnect("bakery");
    public void updatePassword(String uname,String npwd) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query3="UPDATE Admin SET Pass='"+npwd+"' where id ='"+uname+"'";
            stmt.executeUpdate(query3);
            JOptionPane.showMessageDialog(null,"Password Changed");
       
    }
    
}
