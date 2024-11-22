/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekakhirperpustakaan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ridho
 */
public class frameRegister extends javax.swing.JFrame {

    /**
     * Creates new form frameLogin
     */
    public frameRegister() {
        initComponents();
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        colUsername = new javax.swing.JTextField();
        colPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnDaftar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBackLogin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(219, 226, 239));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(219, 226, 239));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(219, 226, 239));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        colUsername.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        colUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        colUsername.setText("Masukkan Username Anda !!!");
        colUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                colUsernameFocusGained(evt);
            }
        });
        colUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colUsernameMouseClicked(evt);
            }
        });
        jPanel3.add(colUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 260, 31));

        colPass.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        colPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        colPass.setText("ridhoganss");
        colPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colPassMouseClicked(evt);
            }
        });
        colPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colPassActionPerformed(evt);
            }
        });
        jPanel3.add(colPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 260, 30));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 114, 175));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register !");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 10, 650, -1));

        jPanel4.setLayout(new java.awt.BorderLayout());

        btnDaftar.setBackground(new java.awt.Color(63, 114, 175));
        btnDaftar.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setText("Register Now !");
        btnDaftar.setIconTextGap(0);
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        jPanel4.add(btnDaftar, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 360, 30));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 45, 78));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aplikasi Manajemen Bacaan");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 100, 320, -1));

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 114, 175));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Selamat datang di halaman Daftar AMBACA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 340, -1));

        jLabel5.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel5.setText("Sudah punya akun ???");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        txtBackLogin.setBackground(new java.awt.Color(0, 255, 204));
        txtBackLogin.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        txtBackLogin.setForeground(new java.awt.Color(63, 114, 175));
        txtBackLogin.setText("Kembali ke halaman Login");
        txtBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBackLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackLoginMouseClicked(evt);
            }
        });
        jPanel3.add(txtBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/padlock.png"))); // NOI18N
        jLabel7.setText("Password :");
        jLabel7.setIconTextGap(10);
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/man.png"))); // NOI18N
        jLabel8.setText("Username :");
        jLabel8.setIconTextGap(10);
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 400, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sucrose-Login.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 401));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bukuTOD.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 40, -1, 401));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 890, 420));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bersama AMBACA mari bersama menjadi Ambativasi untuk Indonesia Emas 2045");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 900, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
        String username = colUsername.getText().trim();
        String password = new String(colPass.getPassword()).trim(); 
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username atau Password tidak boleh kosong atau hanya spasi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return; 
        }if (username.equals("Masukkan Username Anda !!!")||password.equals("ridhoganss")){
            JOptionPane.showMessageDialog(this, "Username atau Password tidak boleh kosong atau hanya spasi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }if (!cekUsername(username)) {
        JOptionPane.showMessageDialog(null, "Username sudah digunakan! Silakan pilih username lain.");
        return;
    }
        String sql = "INSERT INTO user (username, password) VALUES (?, ?)";
        try {
            Connection conn = Koneksi.getKoneksi();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username); 
            stmt.setString(2, password);
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "User berhasil didaftarkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                frameLogin loginFrame = new frameLogin();
                this.dispose();
                loginFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Gagal mendaftarkan user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDaftarActionPerformed

    private void colPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colPassActionPerformed

    private void colUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_colUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_colUsernameFocusGained

    private void colUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colUsernameMouseClicked
        // TODO add your handling code here:
        colUsername.setText("");
    }//GEN-LAST:event_colUsernameMouseClicked

    private void colPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colPassMouseClicked
        // TODO add your handling code here:
        colPass.setText("");
    }//GEN-LAST:event_colPassMouseClicked

    private void txtBackLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackLoginMouseClicked
        // TODO add your handling code here:
        frameLogin fl = new frameLogin();
        this.dispose();
        fl.setVisible(true);
    }//GEN-LAST:event_txtBackLoginMouseClicked

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
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frameRegister fl = new frameRegister();
                fl.setVisible(true);
}            });

            };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JPasswordField colPass;
    private javax.swing.JTextField colUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtBackLogin;
    // End of variables declaration//GEN-END:variables

    private boolean cekUsername(String username) {
        String query = "SELECT COUNT(*) FROM user WHERE username = ?";
        try (Connection conn = Koneksi.getKoneksi();
             PreparedStatement stm = conn.prepareStatement(query)) {
             stm.setString(1, username);
             ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 0; }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
        }
}

