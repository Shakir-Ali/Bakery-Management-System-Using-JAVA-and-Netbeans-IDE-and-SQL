import classes.Login;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YAGYANSH PATIDAR
 */
public class CASHIER_LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form CASHIER_LOGIN
     */
    public CASHIER_LOGIN() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UPWD = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BAKERY MANAGEMENT SYSTEM");
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 48)); // NOI18N
        jLabel2.setText("CASHIERS' LOGIN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 20, 580, 110);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 160, 140);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ENTER USER NAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(600, 390, 270, 50);

        UID.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        UID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIDActionPerformed(evt);
            }
        });
        jPanel1.add(UID);
        UID.setBounds(890, 400, 200, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ENTER PASSWORD:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(600, 450, 260, 60);

        UPWD.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        UPWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPWDActionPerformed(evt);
            }
        });
        jPanel1.add(UPWD);
        UPWD.setBounds(890, 460, 200, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("LOG IN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(770, 610, 160, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40149476-bakery-wallpapers.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, -40, 1950, 1070);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        START2 SO = new  START2();
        SO.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String un=UID.getText();
        String Upwd=UPWD.getText();
        Login login = new Login("cashier");
        try
        {
            if(login.isLogin(un,Upwd))
            {
            BILL SO = new  BILL();
            SO.setVisible(true);
            this.setVisible(false);
            }
            else if(un.equals("")||Upwd.equals("")) 
                   {
                       JOptionPane.showMessageDialog(null,"Access Denied");
            
                   }
            else
            {
                     JOptionPane.showMessageDialog(null,"Access Denied");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }                                        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UPWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPWDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPWDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CASHIER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CASHIER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CASHIER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CASHIER_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CASHIER_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UID;
    private javax.swing.JPasswordField UPWD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("2.png")));    }
}
