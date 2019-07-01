
package Classes;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import classes.JConnect;

/**
 *
 * @author HP
 */
public class CashierTable {
    JConnect jconnect = new JConnect();
    Connection conn = jconnect.javaConnect("bakery");
    public void updateData(String name,String email,long mobile,String id,String pwd) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query="UPDATE CASHIER SET NAME='"+name+"',EMAIL='"+email+"',MOBILE='"+mobile+"',ID='"+id+"',PASS='"+pwd+"'WHERE ID='"+id+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Updated");
       
    }
    public void AddData(String name,String email,long mobile,String id,String pwd) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query="Insert INTO CASHIER Values('"+name+"','"+email+"','"+mobile+"','"+id+"','"+pwd+"')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Added");
       
    }
    public void DeleteData(String id) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query="Delete from Cashier Where id ='"+id+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Deleted");
       
    }
    
}
