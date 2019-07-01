/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import classes.JConnect;

public class ItemTable {
    JConnect jconnect = new JConnect();
    Connection conn = jconnect.javaConnect("bakery");
    public void updateData(String name,int price,int stock,String code) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query="UPDATE ITEM SET NAME='"+name+"',PRICE='"+price+"',STOCK='"+stock+"',CODE='"+code+"'WHERE CODE='"+code+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Updated");
       
    }
    public void AddData(String name,int price,int STOCK,String code) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query="Insert INTO item(name,price,stock,code) Values('"+name+"','"+price+"','"+STOCK+"','"+code+"')";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Added");
       
    }
    public void DeleteData(String id) throws SQLException
    {
       
            Statement stmt = (Statement) conn.createStatement();
            String query="Delete from ITEM Where CODE ='"+id+"'";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Deleted");
       
    }
    
}
