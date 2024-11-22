/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projekakhirperpustakaan;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ridho
 */
public class mainFrame extends javax.swing.JFrame {

    private final int AUid;

    /**
     * Creates new form mainFrame
     */
    public mainFrame(String username, int activeUserId) {
        initComponents();
        this.activeUser = username;
        this.AUid = activeUserId;
        load_username(activeUser);
        System.out.println(username);
        
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        plDash1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlActive1 = new javax.swing.JPanel();
        plDash2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnlActive2 = new javax.swing.JPanel();
        plDash4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlActive4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        plDash5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlActive5 = new javax.swing.JPanel();
        plDash6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlActive6 = new javax.swing.JPanel();
        plDash7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlActive7 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JLabel();
        plMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtHello = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        plMenuAlas = new javax.swing.JPanel();
        plMainMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(1020, 650));
        setResizable(false);

        plMenu.setBackground(new java.awt.Color(255, 255, 255));
        plMenu.setPreferredSize(new java.awt.Dimension(200, 600));
        plMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("AMBACA");
        plMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        plDash1.setBackground(new java.awt.Color(255, 255, 255));
        plDash1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plDash1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDash1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plDash1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plDash1MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N
        jLabel3.setText("Dashbord");
        jLabel3.setIconTextGap(10);

        pnlActive1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlActive1Layout = new javax.swing.GroupLayout(pnlActive1);
        pnlActive1.setLayout(pnlActive1Layout);
        pnlActive1Layout.setHorizontalGroup(
            pnlActive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pnlActive1Layout.setVerticalGroup(
            pnlActive1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plDash1Layout = new javax.swing.GroupLayout(plDash1);
        plDash1.setLayout(plDash1Layout);
        plDash1Layout.setHorizontalGroup(
            plDash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash1Layout.createSequentialGroup()
                .addComponent(pnlActive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        plDash1Layout.setVerticalGroup(
            plDash1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlActive1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        plMenu.add(plDash1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, -1));

        plDash2.setBackground(new java.awt.Color(255, 255, 255));
        plDash2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plDash2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDash2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plDash2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plDash2MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/borrow.png"))); // NOI18N
        jLabel5.setText("Transaksi Buku");
        jLabel5.setIconTextGap(10);

        pnlActive2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlActive2Layout = new javax.swing.GroupLayout(pnlActive2);
        pnlActive2.setLayout(pnlActive2Layout);
        pnlActive2Layout.setHorizontalGroup(
            pnlActive2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pnlActive2Layout.setVerticalGroup(
            pnlActive2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plDash2Layout = new javax.swing.GroupLayout(plDash2);
        plDash2.setLayout(plDash2Layout);
        plDash2Layout.setHorizontalGroup(
            plDash2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash2Layout.createSequentialGroup()
                .addComponent(pnlActive2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        plDash2Layout.setVerticalGroup(
            plDash2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlActive2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        plMenu.add(plDash2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, -1));

        plDash4.setBackground(new java.awt.Color(255, 255, 255));
        plDash4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plDash4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDash4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plDash4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plDash4MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search-interface-symbol.png"))); // NOI18N
        jLabel7.setText("Cari Buku");
        jLabel7.setIconTextGap(10);

        pnlActive4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlActive4Layout = new javax.swing.GroupLayout(pnlActive4);
        pnlActive4.setLayout(pnlActive4Layout);
        pnlActive4Layout.setHorizontalGroup(
            pnlActive4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pnlActive4Layout.setVerticalGroup(
            pnlActive4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plDash4Layout = new javax.swing.GroupLayout(plDash4);
        plDash4.setLayout(plDash4Layout);
        plDash4Layout.setHorizontalGroup(
            plDash4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash4Layout.createSequentialGroup()
                .addComponent(pnlActive4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        plDash4Layout.setVerticalGroup(
            plDash4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlActive4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDash4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        plMenu.add(plDash4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 210, -1));

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu.png"))); // NOI18N
        jLabel8.setText("Menu ");
        jLabel8.setIconTextGap(15);
        plMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        plDash5.setBackground(new java.awt.Color(255, 255, 255));
        plDash5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plDash5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDash5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plDash5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plDash5MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bookmark.png"))); // NOI18N
        jLabel9.setText("Book Mark");
        jLabel9.setIconTextGap(10);

        pnlActive5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlActive5Layout = new javax.swing.GroupLayout(pnlActive5);
        pnlActive5.setLayout(pnlActive5Layout);
        pnlActive5Layout.setHorizontalGroup(
            pnlActive5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pnlActive5Layout.setVerticalGroup(
            pnlActive5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plDash5Layout = new javax.swing.GroupLayout(plDash5);
        plDash5.setLayout(plDash5Layout);
        plDash5Layout.setHorizontalGroup(
            plDash5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash5Layout.createSequentialGroup()
                .addComponent(pnlActive5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        plDash5Layout.setVerticalGroup(
            plDash5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlActive5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDash5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        plMenu.add(plDash5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, -1));

        plDash6.setBackground(new java.awt.Color(255, 255, 255));
        plDash6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plDash6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDash6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plDash6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plDash6MouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/literature.png"))); // NOI18N
        jLabel10.setText("Book Manajement");
        jLabel10.setIconTextGap(10);

        pnlActive6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlActive6Layout = new javax.swing.GroupLayout(pnlActive6);
        pnlActive6.setLayout(pnlActive6Layout);
        pnlActive6Layout.setHorizontalGroup(
            pnlActive6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pnlActive6Layout.setVerticalGroup(
            pnlActive6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plDash6Layout = new javax.swing.GroupLayout(plDash6);
        plDash6.setLayout(plDash6Layout);
        plDash6Layout.setHorizontalGroup(
            plDash6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash6Layout.createSequentialGroup()
                .addComponent(pnlActive6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        plDash6Layout.setVerticalGroup(
            plDash6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlActive6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plDash6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        plMenu.add(plDash6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 210, -1));

        plDash7.setBackground(new java.awt.Color(255, 255, 255));
        plDash7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plDash7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plDash7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plDash7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plDash7MouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/management.png"))); // NOI18N
        jLabel11.setText("User Manajement");
        jLabel11.setIconTextGap(10);

        pnlActive7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlActive7Layout = new javax.swing.GroupLayout(pnlActive7);
        pnlActive7.setLayout(pnlActive7Layout);
        pnlActive7Layout.setHorizontalGroup(
            pnlActive7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        pnlActive7Layout.setVerticalGroup(
            pnlActive7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout plDash7Layout = new javax.swing.GroupLayout(plDash7);
        plDash7.setLayout(plDash7Layout);
        plDash7Layout.setHorizontalGroup(
            plDash7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plDash7Layout.createSequentialGroup()
                .addComponent(pnlActive7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        plDash7Layout.setVerticalGroup(
            plDash7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlActive7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(plDash7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plMenu.add(plDash7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        btnLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        btnLogout.setText("Log - Out");
        btnLogout.setIconTextGap(15);
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        plMenu.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 550, 204, 48));

        getContentPane().add(plMenu, java.awt.BorderLayout.LINE_START);

        plMain.setBackground(new java.awt.Color(255, 255, 0));
        plMain.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 50));

        txtHello.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        txtHello.setForeground(new java.awt.Color(255, 255, 255));
        txtHello.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHello.setText("Hello, Kontol");

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aplikasi Manajemen Bacaan");
        jLabel4.setIconTextGap(20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(txtHello)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHello)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        plMain.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        plMenuAlas.setBackground(new java.awt.Color(255, 255, 255));

        plMainMenu.setBackground(new java.awt.Color(137, 168, 178));
        plMainMenu.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Genshin-layla-splash.png"))); // NOI18N
        plMainMenu.add(jLabel2, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel6.setText("<html> <p> Selamat Datang di Ambaca <br> Aplikasi Manajemen Bacaan <br> Ambaca adalah aplikasi manajemen bacaan berbasis digital yang dirancang khusus untuk kebutuhan perpustakaan<br> Aplikasi ini membantu pustakawan dan pengguna perpustakaan dalam mengelola koleksi buku, <br> memantau aktivitas peminjaman, serta memberikan pengalaman<br>  membaca yang lebih terstruktur dan efisien      .<br>    </p> </html>");
        plMainMenu.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout plMenuAlasLayout = new javax.swing.GroupLayout(plMenuAlas);
        plMenuAlas.setLayout(plMenuAlasLayout);
        plMenuAlasLayout.setHorizontalGroup(
            plMenuAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMenuAlasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(plMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        plMenuAlasLayout.setVerticalGroup(
            plMenuAlasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plMenuAlasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(plMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        plMain.add(plMenuAlas, java.awt.BorderLayout.CENTER);

        getContentPane().add(plMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private String activeUser;
    private void plDash1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash1MouseEntered
        // TODO add your handling code here:
        plDash1.setBackground(new Color (216, 219, 189));
        pnlActive1.setBackground(Color.BLUE);
    }//GEN-LAST:event_plDash1MouseEntered

    private void plDash1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash1MouseExited
        // TODO add your handling code here:
        plDash1.setBackground(Color.white);
        pnlActive1.setBackground(Color.white);                                    
    }//GEN-LAST:event_plDash1MouseExited

    private void plDash1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash1MouseClicked
        // TODO add your handling code here:
        
        plMainMenu.removeAll();
        plMainMenu.add(new panelDashbord());
        plMenuAlas.setBackground(new Color(242, 242, 242));
        plMainMenu.repaint();
        plMainMenu.revalidate();
    }//GEN-LAST:event_plDash1MouseClicked

    private void plDash2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash2MouseClicked
        // TODO add your handling code here:
        plMainMenu.removeAll();
        plMainMenu.add(new panelTransaksiBuku(activeUser));
        plMenuAlas.setBackground(new Color(242, 242, 242));
        plMainMenu.repaint();
        plMainMenu.revalidate();
    }//GEN-LAST:event_plDash2MouseClicked

    private void plDash2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash2MouseEntered
        // TODO add your handling code here:
        plDash2.setBackground(new Color (216, 219, 189));
        pnlActive2.setBackground(Color.BLUE);
    }//GEN-LAST:event_plDash2MouseEntered

    private void plDash2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash2MouseExited
        // TODO add your handling code here:
        plDash2.setBackground(Color.white);
        pnlActive2.setBackground(Color.white);
    }//GEN-LAST:event_plDash2MouseExited

    private void plDash4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash4MouseClicked
        // TODO add your handling code here:
        plMainMenu.removeAll();
        plMainMenu.add(new panelSearchBook(AUid));
        plMenuAlas.setBackground(new Color(242, 242, 242));
        plMainMenu.repaint();
        plMainMenu.revalidate();
                      
    }//GEN-LAST:event_plDash4MouseClicked

    private void plDash4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash4MouseEntered
        // TODO add your handling code here:
        plDash4.setBackground(new Color (216, 219, 189));
        pnlActive4.setBackground(Color.BLUE);
    }//GEN-LAST:event_plDash4MouseEntered

    private void plDash4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash4MouseExited
        // TODO add your handling code here:
        plDash4.setBackground(Color.white);
        pnlActive4.setBackground(Color.white);
    }//GEN-LAST:event_plDash4MouseExited

    private void plDash5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash5MouseClicked
        // TODO add your handling code here:
        plMainMenu.removeAll();
        plMainMenu.add(new panelBookmark(AUid));
        plMenuAlas.setBackground(new Color(242, 242, 242));
        plMainMenu.repaint();
        plMainMenu.revalidate();
    }//GEN-LAST:event_plDash5MouseClicked

    private void plDash5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash5MouseEntered
        // TODO add your handling code here:
        plDash5.setBackground(new Color (216, 219, 189));
        pnlActive5.setBackground(Color.BLUE);
    }//GEN-LAST:event_plDash5MouseEntered

    private void plDash5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash5MouseExited
        // TODO add your handling code here:
        plDash5.setBackground(Color.white);
        pnlActive5.setBackground(Color.white);
    }//GEN-LAST:event_plDash5MouseExited

    private void plDash6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash6MouseClicked
        // TODO add your handling code here:
        plMainMenu.removeAll();
        plMainMenu.add(new panelManBuku());
        plMenuAlas.setBackground(new Color(242, 242, 242));
        plMainMenu.repaint();
        plMainMenu.revalidate();
    }//GEN-LAST:event_plDash6MouseClicked

    private void plDash6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash6MouseEntered
        // TODO add your handling code here:
        plDash6.setBackground(new Color (216, 219, 189));
        pnlActive6.setBackground(Color.BLUE);
    }//GEN-LAST:event_plDash6MouseEntered

    private void plDash6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash6MouseExited
        // TODO add your handling code here:
        plDash6.setBackground(Color.white);
        pnlActive6.setBackground(Color.white);
    }//GEN-LAST:event_plDash6MouseExited

    private void plDash7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash7MouseClicked
        // TODO add your handling code here:
         plMainMenu.removeAll();
        plMainMenu.add(new panelManUser());
        plMenuAlas.setBackground(new Color(242, 242, 242));
        plMainMenu.repaint();
        plMainMenu.revalidate();
    }//GEN-LAST:event_plDash7MouseClicked

    private void plDash7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash7MouseEntered
        // TODO add your handling code here:
        plDash7.setBackground(new Color (216, 219, 189));
        pnlActive7.setBackground(Color.BLUE);
    }//GEN-LAST:event_plDash7MouseEntered

    private void plDash7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plDash7MouseExited
        // TODO add your handling code here:
        plDash7.setBackground(Color.white);
        pnlActive7.setBackground(Color.white);
    }//GEN-LAST:event_plDash7MouseExited

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", 
            JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        this.setVisible(false);
        frameLogin loginForm = new frameLogin();
        loginForm.setVisible(true);
    }
    }//GEN-LAST:event_btnLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String username = "";
                int aciveUserId = 0;
                if(username.isEmpty()||username ==null){
                    new mainFrame(username,aciveUserId).setVisible(false);
                    frameLogin fl = new frameLogin();
                    fl.setVisible(true);   
                }
                System.out.println(username);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel plDash1;
    private javax.swing.JPanel plDash2;
    private javax.swing.JPanel plDash4;
    private javax.swing.JPanel plDash5;
    private javax.swing.JPanel plDash6;
    private javax.swing.JPanel plDash7;
    private javax.swing.JPanel plMain;
    private javax.swing.JPanel plMainMenu;
    private javax.swing.JPanel plMenu;
    private javax.swing.JPanel plMenuAlas;
    private javax.swing.JPanel pnlActive1;
    private javax.swing.JPanel pnlActive2;
    private javax.swing.JPanel pnlActive4;
    private javax.swing.JPanel pnlActive5;
    private javax.swing.JPanel pnlActive6;
    private javax.swing.JPanel pnlActive7;
    private javax.swing.JLabel txtHello;
    // End of variables declaration//GEN-END:variables

    public void load_username(String username) {
        this.activeUser = username;
            System.out.println("2 ; "+username);
            txtHello.setText("Hello , "+username);
        if(!username.equals("admin")){
            plDash6.setVisible(false);
            plDash7.setVisible(false);
        }
}

}