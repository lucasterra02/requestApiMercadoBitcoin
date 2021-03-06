/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.google.gson.Gson;
import control.ConsultaValores;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.TickerDTO;

/**
 *
 * @author lucas
 */
public class HomeJFrame extends javax.swing.JFrame {

    private final ConsultaValores consultaValores;

    /**
     * Creates new form HomeJFrame
     */
    public HomeJFrame() {
        setIconImage(new ImageIcon(getClass().getResource("/images/criptoIcon.png")).getImage());
        setLocationRelativeTo(null);
        consultaValores = new ConsultaValores();
        initComponents();

        TickerDTO tBTC = consultaBTC();
        TickerDTO tLTC = consultaLTC();

        popularCampos(tBTC, tLTC);

    }

    public ConsultaValores getConsultaValores() {
        return consultaValores;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLtcLast = new javax.swing.JLabel();
        txtLtcLast = new javax.swing.JTextField();
        txtBtcLast = new javax.swing.JTextField();
        lblBtcLast = new javax.swing.JLabel();
        lblLast = new javax.swing.JLabel();
        lblHigh = new javax.swing.JLabel();
        txtLtcHigh = new javax.swing.JTextField();
        txtBtcHigh = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        txtLtcLow = new javax.swing.JTextField();
        txtBtcLow = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta API Mercado Bitcoin");
        setName("frmHome"); // NOI18N
        setPreferredSize(new java.awt.Dimension(371, 197));

        lblLtcLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLtcLast.setText("LTC");

        txtLtcLast.setEditable(false);
        txtLtcLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLtcLastActionPerformed(evt);
            }
        });

        txtBtcLast.setEditable(false);
        txtBtcLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtcLastActionPerformed(evt);
            }
        });

        lblBtcLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBtcLast.setText("BTC");

        lblLast.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLast.setText("Último Valor Unitário");

        lblHigh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHigh.setText("Maior / Menor preço nas últimas 24hs");

        txtLtcHigh.setEditable(false);
        txtLtcHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLtcHighActionPerformed(evt);
            }
        });

        txtBtcHigh.setEditable(false);
        txtBtcHigh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtcHighActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblMsg.setForeground(new java.awt.Color(255, 0, 0));

        txtLtcLow.setEditable(false);
        txtLtcLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLtcLowActionPerformed(evt);
            }
        });

        txtBtcLow.setEditable(false);
        txtBtcLow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtcLowActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("/");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLast)
                        .addGap(18, 18, 18)
                        .addComponent(lblHigh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(txtLtcHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLtcLow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLtcLast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLtcLast, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(txtBtcHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBtcLow, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBtcLast)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBtcLast, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnAtualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLast)
                    .addComponent(lblHigh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLtcLast)
                    .addComponent(txtLtcLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLtcHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLtcLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBtcLast)
                    .addComponent(txtBtcLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtcHigh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBtcLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtualizar)
                .addGap(96, 96, 96)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLtcLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLtcLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLtcLastActionPerformed

    private void txtBtcLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtcLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtcLastActionPerformed

    private void txtLtcHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLtcHighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLtcHighActionPerformed

    private void txtBtcHighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtcHighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtcHighActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

        TickerDTO tBTC = consultaBTC();
        TickerDTO tLTC = consultaLTC();

        popularCampos(tBTC, tLTC);

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtLtcLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLtcLowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLtcLowActionPerformed

    private void txtBtcLowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtcLowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtcLowActionPerformed

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
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new HomeJFrame().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBtcLast;
    private javax.swing.JLabel lblHigh;
    private javax.swing.JLabel lblLast;
    private javax.swing.JLabel lblLtcLast;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JTextField txtBtcHigh;
    private javax.swing.JTextField txtBtcLast;
    private javax.swing.JTextField txtBtcLow;
    private javax.swing.JTextField txtLtcHigh;
    private javax.swing.JTextField txtLtcLast;
    private javax.swing.JTextField txtLtcLow;
    // End of variables declaration//GEN-END:variables

    private TickerDTO consultaLTC() {
        TickerDTO tickerDTO = null;
        try {
            String jsonResult = consultaValores.sendGet("LTC");

            // Convert JSON to Java Object
            Gson gson = new Gson();
            tickerDTO = gson.fromJson(jsonResult, TickerDTO.class);

        } catch (Exception ex) {
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tickerDTO;
    }

    private TickerDTO consultaBTC() {
        TickerDTO tickerDTO = null;
        try {
            String jsonResult = consultaValores.sendGet("BTC");

            // Convert JSON to Java Object
            Gson gson = new Gson();
            tickerDTO = gson.fromJson(jsonResult, TickerDTO.class);

        } catch (Exception ex) {
            Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tickerDTO;
    }

    private void popularCampos(TickerDTO tmBTC, TickerDTO tmLTC) {
        txtLtcLast.setText(tmLTC.getTicker().getLast());
        txtBtcLast.setText(tmBTC.getTicker().getLast());
        txtLtcHigh.setText(tmLTC.getTicker().getHigh());
        txtBtcHigh.setText(tmBTC.getTicker().getHigh());
        txtLtcLow.setText(tmLTC.getTicker().getLow());
        txtBtcLow.setText(tmBTC.getTicker().getLow());
    }

}
