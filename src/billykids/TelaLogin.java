/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billykids;

import DAL.ModuloConexao;
//import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class TelaLogin extends javax.swing.JFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        
        if(conexao!=null){
            //dbon.setText("Banco Conectado");
            dboff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billykids/dbon.png")));
        }else{
            //dbon.setText("Banco Desconectado");
            dbon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billykids/dboff.png")));
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSenha = new javax.swing.JPasswordField();
        btnLogar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        dboff = new javax.swing.JLabel();
        dbon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSenha.setBackground(new java.awt.Color(85, 55, 0));
        txtSenha.setFont(new java.awt.Font("Poppins Thin", 0, 24)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 55, 0)));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 590, 30));

        btnLogar.setBackground(new java.awt.Color(85, 55, 0));
        btnLogar.setFont(new java.awt.Font("Poppins Medium", 2, 32)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(255, 166, 0));
        btnLogar.setText("LOGAR");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 140, 80));

        txtUsuario.setBackground(new java.awt.Color(85, 55, 0));
        txtUsuario.setFont(new java.awt.Font("Poppins Thin", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(85, 55, 0)));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 590, 30));

        dboff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billykids/dboff.png"))); // NOI18N
        getContentPane().add(dboff, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 150, 90));

        dbon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billykids/dbon.png"))); // NOI18N
        getContentPane().add(dbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Tela_Login.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        logar();
    }//GEN-LAST:event_btnLogarActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel dboff;
    private javax.swing.JLabel dbon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void logar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "SELECT * FROM usuarios WHERE Usuario=? AND Senha=?"; 
        try { // executa comandos caso positivo
            pst = conexao.prepareStatement(sql);
            pst.setString(1,txtUsuario.getText());
            pst.setString(2,txtSenha.getText());
            
            rs = pst.executeQuery(); // retorna valores e executa comando sql
            
            if(rs.next()){
                // se tiver login/senha dá acesso a tela principal 
                TelaLogin.this.dispose();
                Principal principal = new Principal();
                principal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário sem acesso!");
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }
}
