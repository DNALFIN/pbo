/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kalkulator;

/**
 *
 * @author dwinuralfin
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bil1 = new javax.swing.JTextField();
        bil2 = new javax.swing.JTextField();
        tombolTambah = new javax.swing.JButton();
        aksi = new javax.swing.JLabel();
        kolomHasil = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tombolKurang = new javax.swing.JButton();
        tombolBagi = new javax.swing.JButton();
        tombolKali = new javax.swing.JButton();
        tombolMod = new javax.swing.JButton();
        kolomNotif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bil1ActionPerformed(evt);
            }
        });

        bil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bil2ActionPerformed(evt);
            }
        });

        tombolTambah.setText("+");
        tombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolTambahActionPerformed(evt);
            }
        });

        kolomHasil.setText("Hasil");

        jLabel3.setText("=");

        tombolKurang.setText("-");
        tombolKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKurangActionPerformed(evt);
            }
        });

        tombolBagi.setText("/");
        tombolBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBagiActionPerformed(evt);
            }
        });

        tombolKali.setText("X");
        tombolKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKaliActionPerformed(evt);
            }
        });

        tombolMod.setText("MOD %");
        tombolMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolModActionPerformed(evt);
            }
        });

        kolomNotif.setText("    ");
        kolomNotif.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tombolTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolKurang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolKali, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolBagi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombolMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aksi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kolomNotif, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kolomHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aksi)
                    .addComponent(kolomHasil)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kolomNotif)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tombolTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolKurang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolKali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolBagi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombolMod)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bil1ActionPerformed

    private void tombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolTambahActionPerformed
        // TODO add your handling code here:
        kolomNotif.setText("");
        try {
        double hasil1 = Double.parseDouble(bil1.getText()) + Double.parseDouble(bil2.getText()) ;
        kolomHasil.setText(Double.toString(hasil1));
        } 
        catch (NumberFormatException e) {
            kolomHasil.setText("Error");
            kolomNotif.setText("Masukan bilangan");
        } catch (Exception e) {
            kolomHasil.setText("Error " + e.getMessage());
        }
        aksi.setText(" + ");
    }//GEN-LAST:event_tombolTambahActionPerformed

    private void bil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bil2ActionPerformed

    private void tombolKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKurangActionPerformed
        // TODO add your handling code here:
        kolomNotif.setText("");
        try {
        double hasil2 = Double.parseDouble(bil1.getText()) - Double.parseDouble(bil2.getText()) ;
        kolomHasil.setText(Double.toString(hasil2));
        } 
        catch (NumberFormatException e) {
            kolomHasil.setText("Error");
            kolomNotif.setText("Masukan bilangan");
        } catch (Exception e) {
            kolomHasil.setText("Error " + e.getMessage());
        }
        aksi.setText(" - ");
    }//GEN-LAST:event_tombolKurangActionPerformed

    private void tombolBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBagiActionPerformed
        // TODO add your handling code here:
        kolomNotif.setText("");
        try {
        double num1 = Double.parseDouble(bil1.getText());
        double num2 = Double.parseDouble(bil2.getText());
        if (num2 == 0) {
            kolomHasil.setText("Error");
            kolomNotif.setText("Bilangan tidak bisa dibagi 0");
        } else {
            double hasil = num1 / num2;
            kolomHasil.setText(Double.toString(hasil));
        }
        } 
        catch (NumberFormatException e) {
            kolomHasil.setText("Error");
            kolomNotif.setText("Masukan bilangan");
        } catch (Exception e) {
            kolomHasil.setText("Error " + e.getMessage());
        } 
        aksi.setText(" / ");
    }//GEN-LAST:event_tombolBagiActionPerformed

    private void tombolKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKaliActionPerformed
        // TODO add your handling code here:
        kolomNotif.setText("");
        try {
        double hasil4 = Double.parseDouble(bil1.getText()) * Double.parseDouble(bil2.getText()) ;
        kolomHasil.setText(Double.toString(hasil4));
        } 
        catch (NumberFormatException e) {
            kolomHasil.setText("Error");
            kolomNotif.setText("Masukan bilangan");
        } catch (Exception e) {
            kolomHasil.setText("Error " + e.getMessage());
        }
        aksi.setText(" x ");
    }//GEN-LAST:event_tombolKaliActionPerformed

    private void tombolModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolModActionPerformed
        // TODO add your handling code here:
        kolomNotif.setText("");
        try {
        double hasil5 = Double.parseDouble(bil1.getText()) % Double.parseDouble(bil2.getText()) ;
        kolomHasil.setText(Double.toString(hasil5));
        } 
        catch (NumberFormatException e) {
            kolomHasil.setText("Error");
            kolomNotif.setText("Masukan bilangan");
        } catch (Exception e) {
            kolomHasil.setText("Error " + e.getMessage());
        }
        aksi.setText(" % ");
    }//GEN-LAST:event_tombolModActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aksi;
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel kolomHasil;
    private javax.swing.JLabel kolomNotif;
    private javax.swing.JButton tombolBagi;
    private javax.swing.JButton tombolKali;
    private javax.swing.JButton tombolKurang;
    private javax.swing.JButton tombolMod;
    private javax.swing.JButton tombolTambah;
    // End of variables declaration//GEN-END:variables
}
