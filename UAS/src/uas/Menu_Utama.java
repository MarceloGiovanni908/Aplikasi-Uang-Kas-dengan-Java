/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS;

/**
 *
 * @author Rama
 */
public class Menu_Utama extends javax.swing.JFrame {


    public Menu_Utama() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Mahasiswa = new javax.swing.JButton();
        Uang_Kas = new javax.swing.JButton();
        LOGOUT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU UTAMA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 130, 280, 50);

        Mahasiswa.setForeground(new java.awt.Color(242, 242, 242));
        Mahasiswa.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmad\\Desktop\\UAS\\Prak PBO\\student3_118124.png")); // NOI18N
        Mahasiswa.setBorder(null);
        Mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MahasiswaActionPerformed(evt);
            }
        });
        jPanel1.add(Mahasiswa);
        Mahasiswa.setBounds(150, 240, 160, 170);

        Uang_Kas.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmad\\Desktop\\UAS\\Prak PBO\\New folder (2)\\uang.png")); // NOI18N
        Uang_Kas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Uang_KasActionPerformed(evt);
            }
        });
        jPanel1.add(Uang_Kas);
        Uang_Kas.setBounds(440, 240, 160, 170);

        LOGOUT.setText("LOGOUT");
        LOGOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUTActionPerformed(evt);
            }
        });
        jPanel1.add(LOGOUT);
        LOGOUT.setBounds(640, 10, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahmad\\Desktop\\UAS\\Prak PBO\\universitas-pembangunan-nasional-veteran-jakarta-upnvj-di-pondok-labu_.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(761, 503));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 761, 503);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MahasiswaActionPerformed
        new Data_Mahasiswa().setVisible(true);
        dispose();
    }//GEN-LAST:event_MahasiswaActionPerformed

    private void LOGOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUTActionPerformed

        new Login().setVisible(true);
        dispose();
        javax.swing.JOptionPane.showMessageDialog(null, "ANDA BERHASIL LOGOUT");
    }//GEN-LAST:event_LOGOUTActionPerformed

    private void Uang_KasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Uang_KasActionPerformed
        // TODO add your handling code here:
        new UangKas().setVisible(true);
        dispose();
    }//GEN-LAST:event_Uang_KasActionPerformed

    
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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGOUT;
    private javax.swing.JButton Mahasiswa;
    private javax.swing.JButton Uang_Kas;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
