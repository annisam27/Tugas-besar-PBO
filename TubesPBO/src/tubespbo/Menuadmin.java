/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;



/**
 *
 * @author LATHNETBOOK
 */
public class Menuadmin extends javax.swing.JFrame {

    /**
     * Creates new form Menuadmin
     */
    public Menuadmin() {
        initComponents();
        setLocationRelativeTo(null);
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
        Ruangan = new javax.swing.JButton();
        Peminjaman = new javax.swing.JButton();
        Laporan = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        pengembalian = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(112, 128, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ruangan.setBackground(new java.awt.Color(255, 255, 255));
        Ruangan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ruangan.setText("KELOLA DATA RUANGAN");
        Ruangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuanganActionPerformed(evt);
            }
        });
        jPanel1.add(Ruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 268, 50));

        Peminjaman.setBackground(new java.awt.Color(255, 255, 255));
        Peminjaman.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Peminjaman.setText("KELOLA PEMINJAMAN");
        Peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeminjamanActionPerformed(evt);
            }
        });
        jPanel1.add(Peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 268, 50));

        Laporan.setBackground(new java.awt.Color(255, 255, 255));
        Laporan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Laporan.setText("LAPORAN PEMINJAMAN");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });
        jPanel1.add(Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 268, 50));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        pengembalian.setBackground(new java.awt.Color(255, 255, 255));
        pengembalian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pengembalian.setText("KELOLA PENGEMBALIAN");
        pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengembalianActionPerformed(evt);
            }
        });
        jPanel1.add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 270, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuanganActionPerformed
        // TODO add your handling code here:
      KelolaDataRuang kel = new KelolaDataRuang();
      kel.setVisible(true);
    }//GEN-LAST:event_RuanganActionPerformed

    private void PeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeminjamanActionPerformed
        // TODO add your handling code here:
         KelolaPeminjaman pem = new KelolaPeminjaman();
         pem.setVisible(true);
    }//GEN-LAST:event_PeminjamanActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
        // TODO add your handling code here:
         Laporan lap = new Laporan ();
         lap.setVisible(true);
    }//GEN-LAST:event_LaporanActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
          dispose();
        new Menulogin().show();
    }//GEN-LAST:event_LogoutActionPerformed

    private void pengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengembalianActionPerformed
        // TODO add your handling code here:
        Kembali kmbl = new Kembali ();
         kmbl.setVisible(true);
    }//GEN-LAST:event_pengembalianActionPerformed

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
            java.util.logging.Logger.getLogger(Menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Laporan;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Peminjaman;
    private javax.swing.JButton Ruangan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pengembalian;
    // End of variables declaration//GEN-END:variables
}
