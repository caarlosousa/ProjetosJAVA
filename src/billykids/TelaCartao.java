/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package billykids;
import DAL.ModuloConexao;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuário
 */
public class TelaCartao extends javax.swing.JInternalFrame {
    Connection conexao = null; 
    PreparedStatement pst = null; 
    ResultSet rs = null;        

    /**
     * Creates new form TelaCartao
     */
    public TelaCartao() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCartaoAdd = new javax.swing.JButton();
        btnCartaoPes = new javax.swing.JButton();
        btnCartaoEdi = new javax.swing.JButton();
        btnCartaoDel = new javax.swing.JButton();
        btnCartaoImp = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCVC = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        txtTipo = new javax.swing.JTextField();
        txtBandeira = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JFormattedTextField();
        txtLimite = new javax.swing.JFormattedTextField();
        txtValidade = new javax.swing.JFormattedTextField();
        txtID = new javax.swing.JTextField();
        txtNumero = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(854, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCartaoAdd.setBackground(new java.awt.Color(28, 28, 28));
        btnCartaoAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Adicionar.png"))); // NOI18N
        btnCartaoAdd.setBorder(null);
        btnCartaoAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 70, -1));

        btnCartaoPes.setBackground(new java.awt.Color(28, 28, 28));
        btnCartaoPes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Pesquisar.png"))); // NOI18N
        btnCartaoPes.setBorder(null);
        btnCartaoPes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoPesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoPes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 70, -1));

        btnCartaoEdi.setBackground(new java.awt.Color(28, 28, 28));
        btnCartaoEdi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Editar.png"))); // NOI18N
        btnCartaoEdi.setBorder(null);
        btnCartaoEdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoEdiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 70, -1));

        btnCartaoDel.setBackground(new java.awt.Color(28, 28, 28));
        btnCartaoDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Deletar.png"))); // NOI18N
        btnCartaoDel.setBorder(null);
        btnCartaoDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 70, -1));

        btnCartaoImp.setBackground(new java.awt.Color(28, 28, 28));
        btnCartaoImp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/Imprimir.png"))); // NOI18N
        btnCartaoImp.setBorder(null);
        btnCartaoImp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoImpActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoImp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 70, -1));

        txtCodigo.setBackground(new java.awt.Color(28, 28, 28));
        txtCodigo.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 2, 50, 40));

        txtNome.setBackground(new java.awt.Color(28, 28, 28));
        txtNome.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 42, 340, 30));

        txtCVC.setBackground(new java.awt.Color(28, 28, 28));
        txtCVC.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        txtCVC.setForeground(new java.awt.Color(255, 255, 255));
        txtCVC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        getContentPane().add(txtCVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, 30));

        txtData.setBackground(new java.awt.Color(28, 28, 28));
        txtData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        txtData.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 142, 120, 30));

        txtTipo.setBackground(new java.awt.Color(28, 28, 28));
        txtTipo.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));
        txtTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 30));

        txtBandeira.setBackground(new java.awt.Color(28, 28, 28));
        txtBandeira.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        txtBandeira.setForeground(new java.awt.Color(255, 255, 255));
        txtBandeira.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        getContentPane().add(txtBandeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 212, 210, 30));

        txtSaldo.setBackground(new java.awt.Color(28, 28, 28));
        txtSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        getContentPane().add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 252, 110, 30));

        txtLimite.setBackground(new java.awt.Color(28, 28, 28));
        txtLimite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        txtLimite.setForeground(new java.awt.Color(255, 255, 255));
        txtLimite.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        getContentPane().add(txtLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 282, 110, 30));

        txtValidade.setBackground(new java.awt.Color(28, 28, 28));
        txtValidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        txtValidade.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValidade.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        getContentPane().add(txtValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 70, 40));

        txtID.setBackground(new java.awt.Color(28, 28, 28));
        txtID.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 340, 60, 30));

        txtNumero.setBackground(new java.awt.Color(28, 28, 28));
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 28, 28)));
        txtNumero.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumero.setFont(new java.awt.Font("Poppins ExtraLight", 2, 20)); // NOI18N
        getContentPane().add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 82, 280, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/imagens/TelaCartao.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -15, -1, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCartaoAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoAddActionPerformed
        cadastrar();
    }//GEN-LAST:event_btnCartaoAddActionPerformed

    private void btnCartaoPesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoPesActionPerformed
        buscar();
    }//GEN-LAST:event_btnCartaoPesActionPerformed

    private void btnCartaoEdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoEdiActionPerformed
        editar();
    }//GEN-LAST:event_btnCartaoEdiActionPerformed

    private void btnCartaoDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoDelActionPerformed
        deletar();
    }//GEN-LAST:event_btnCartaoDelActionPerformed

    private void btnCartaoImpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoImpActionPerformed
        RelCartao();
    }//GEN-LAST:event_btnCartaoImpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartaoAdd;
    private javax.swing.JButton btnCartaoDel;
    private javax.swing.JButton btnCartaoEdi;
    private javax.swing.JButton btnCartaoImp;
    private javax.swing.JButton btnCartaoPes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtBandeira;
    private javax.swing.JTextField txtCVC;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtID;
    private javax.swing.JFormattedTextField txtLimite;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JFormattedTextField txtSaldo;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables

    private void cadastrar() {
        String sql = "INSERT INTO cartaocredito (Código, NomeCartão, NúmeroCartão, CVC,"
                + "DataEmissão, TipoCartão, Bandeira, Saldo,"
                + "Limite, Validade, idContas) VALUES"
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            pst.setString(2, txtNome.getText());  //PARA COPIAR CTRL+SHIFT+SETA PRA BAIXO
            pst.setString(3, txtNumero.getText());
            pst.setString(4, txtCVC.getText());
            pst.setString(5, txtData.getText());
            pst.setString(6, txtTipo.getText());
            pst.setString(7, txtBandeira.getText());
            pst.setString(8, txtSaldo.getText());
            pst.setString(9, txtLimite.getText());
            pst.setString(10, txtValidade.getText());
            pst.setString(11, txtID.getText());
            
            int resultado = pst.executeUpdate();
            
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Cartão cadastrado com sucesso!!");
                 txtCodigo.setText(null);
                 txtNome.setText(null);
                 txtNumero.setText(null);
                 txtCVC.setText(null);
                 txtData.setText(null);
                 txtTipo.setText(null);
                 txtBandeira.setText(null);
                 txtSaldo.setText(null);
                 txtLimite.setText(null);                 
                 txtValidade.setText(null);                 
                 txtID.setText(null);                 
                        
            }else{
                JOptionPane.showMessageDialog(null, "Cartão NÃO cadastrado!" );
            }
                     
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void buscar() {
        String sql= "SELECT * FROM cartaocredito WHERE Código=?";
    
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                txtNome.setText(rs.getString("NomeCartão"));
                txtNumero.setText(rs.getString("NúmeroCartão"));
                txtCVC.setText(rs.getString("CVC"));
                txtData.setText(rs.getString("DataEmissão"));
                txtTipo.setText(rs.getString("TipoCartão"));
                txtBandeira.setText(rs.getString("Bandeira"));
                txtSaldo.setText(rs.getString("Saldo"));
                txtLimite.setText(rs.getString("Limite"));                            
                txtValidade.setText(rs.getString("Limite"));                            
                txtID.setText(rs.getString("idContas"));                            
              
            }else{
                JOptionPane.showMessageDialog(null, "Cartão não localizado!!");
                txtNome.setText(null);
                txtNumero.setText(null);
                txtCVC.setText(null);
                txtData.setText(null);
                txtTipo.setText(null);
                txtBandeira.setText(null);
                txtSaldo.setText(null);
                txtLimite.setText(null);
                txtValidade.setText(null);
                txtID.setText(null);
                
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void editar() {
        String sql = "UPDATE cartaocredito SET NomeCartão=?, NúmeroCartão=?, CVC=?,"
                + "DataEmissão=?, TipoCartão=?, Bandeira=?, Saldo=?,"
                + "Limite=?, Validade=?, idContas=? WHERE Código=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNome.getText());  //PARA COPIAR CTRL+SHIFT+SETA PRA BAIXO
            pst.setString(2, txtNumero.getText());
            pst.setString(3, txtCVC.getText());
            pst.setString(4, txtData.getText());
            pst.setString(5, txtTipo.getText());
            pst.setString(6, txtBandeira.getText());
            pst.setString(7, txtSaldo.getText());
            pst.setString(8, txtLimite.getText());
            pst.setString(9, txtValidade.getText());
            pst.setString(10, txtID.getText());
            pst.setString(11, txtCodigo.getText());
            
            int atualizado = pst.executeUpdate();
            
            if(atualizado==1){
                JOptionPane.showMessageDialog(null, "Cartão atualizado com sucesso!!");
                 txtCodigo.setText(null);
                 txtNome.setText(null);
                 txtNumero.setText(null);
                 txtCVC.setText(null);
                 txtData.setText(null);
                 txtTipo.setText(null);
                 txtBandeira.setText(null);
                 txtSaldo.setText(null);
                 txtLimite.setText(null);
                 txtValidade.setText(null);
                 txtID.setText(null);
                        
            }else{
                JOptionPane.showMessageDialog(null, "Cartão NÃO atualizado!!" );
            }
                     
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }   
    }

    private void deletar() {
        String sql= "DELETE FROM cartaocredito WHERE Código=?";
    
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtCodigo.getText());
            int apagado = pst.executeUpdate();
            
            if(apagado>0){
                JOptionPane.showMessageDialog(null, "Cartão excluído com sucesso!!");
                txtNome.setText(null);
                txtCodigo.setText(null);
                txtNumero.setText(null);
                txtCVC.setText(null);
                txtData.setText(null);
                txtTipo.setText(null);
                txtBandeira.setText(null);
                txtSaldo.setText(null);
                txtLimite.setText(null);                           
                txtValidade.setText(null);                           
                txtID.setText(null);                           
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }            
    }

    private void RelCartao() {
        int op= JOptionPane.showConfirmDialog(null, "Confirma impressão?", "Relatório de Cartões", JOptionPane.YES_NO_OPTION);
        if(op==JOptionPane.YES_OPTION){
            
            try {
                String caminho = "C:/Rel/RelCartao.jasper";
                JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
                JasperViewer.viewReport(print,false);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }    
    }    
}
