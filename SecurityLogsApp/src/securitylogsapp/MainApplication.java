/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitylogsapp;

/**
 *
 * @author HNMP
 */
public class MainApplication extends javax.swing.JFrame {

    /**
     * Creates new form MainApplication
     */
    public MainApplication() {
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

        panel_base = new javax.swing.JPanel();
        panel_top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_left = new javax.swing.JPanel();
        pnbtn_visitors = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnbtn_noid = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnbtn_parking = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnbtn_lost = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnbtn_ext = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel_centre = new javax.swing.JPanel();
        panel_visitors = new javax.swing.JPanel();
        panel_noid = new javax.swing.JPanel();
        panel_parking = new javax.swing.JPanel();
        panel_lost = new javax.swing.JPanel();
        panel_ext = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setLayout(new java.awt.BorderLayout());

        panel_top.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Java Project");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_base.add(panel_top, java.awt.BorderLayout.PAGE_START);

        panel_left.setBackground(new java.awt.Color(153, 153, 153));

        pnbtn_visitors.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Visitors");

        javax.swing.GroupLayout pnbtn_visitorsLayout = new javax.swing.GroupLayout(pnbtn_visitors);
        pnbtn_visitors.setLayout(pnbtn_visitorsLayout);
        pnbtn_visitorsLayout.setHorizontalGroup(
            pnbtn_visitorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_visitorsLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnbtn_visitorsLayout.setVerticalGroup(
            pnbtn_visitorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_visitorsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnbtn_noid.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("No ID Issued");

        javax.swing.GroupLayout pnbtn_noidLayout = new javax.swing.GroupLayout(pnbtn_noid);
        pnbtn_noid.setLayout(pnbtn_noidLayout);
        pnbtn_noidLayout.setHorizontalGroup(
            pnbtn_noidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnbtn_noidLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45))
        );
        pnbtn_noidLayout.setVerticalGroup(
            pnbtn_noidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_noidLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnbtn_parking.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Parking");

        javax.swing.GroupLayout pnbtn_parkingLayout = new javax.swing.GroupLayout(pnbtn_parking);
        pnbtn_parking.setLayout(pnbtn_parkingLayout);
        pnbtn_parkingLayout.setHorizontalGroup(
            pnbtn_parkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_parkingLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnbtn_parkingLayout.setVerticalGroup(
            pnbtn_parkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_parkingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnbtn_lost.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Lost and Found");

        javax.swing.GroupLayout pnbtn_lostLayout = new javax.swing.GroupLayout(pnbtn_lost);
        pnbtn_lost.setLayout(pnbtn_lostLayout);
        pnbtn_lostLayout.setHorizontalGroup(
            pnbtn_lostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnbtn_lostLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(35, 35, 35))
        );
        pnbtn_lostLayout.setVerticalGroup(
            pnbtn_lostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_lostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnbtn_ext.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Extra");

        javax.swing.GroupLayout pnbtn_extLayout = new javax.swing.GroupLayout(pnbtn_ext);
        pnbtn_ext.setLayout(pnbtn_extLayout);
        pnbtn_extLayout.setHorizontalGroup(
            pnbtn_extLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_extLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnbtn_extLayout.setVerticalGroup(
            pnbtn_extLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbtn_extLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_leftLayout = new javax.swing.GroupLayout(panel_left);
        panel_left.setLayout(panel_leftLayout);
        panel_leftLayout.setHorizontalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnbtn_visitors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnbtn_noid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnbtn_parking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnbtn_lost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnbtn_ext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_leftLayout.setVerticalGroup(
            panel_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_leftLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(pnbtn_visitors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnbtn_noid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnbtn_parking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnbtn_lost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnbtn_ext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        panel_base.add(panel_left, java.awt.BorderLayout.LINE_START);

        panel_centre.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panel_visitorsLayout = new javax.swing.GroupLayout(panel_visitors);
        panel_visitors.setLayout(panel_visitorsLayout);
        panel_visitorsLayout.setHorizontalGroup(
            panel_visitorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        panel_visitorsLayout.setVerticalGroup(
            panel_visitorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        panel_centre.add(panel_visitors, "card2");

        javax.swing.GroupLayout panel_noidLayout = new javax.swing.GroupLayout(panel_noid);
        panel_noid.setLayout(panel_noidLayout);
        panel_noidLayout.setHorizontalGroup(
            panel_noidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        panel_noidLayout.setVerticalGroup(
            panel_noidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        panel_centre.add(panel_noid, "card4");

        javax.swing.GroupLayout panel_parkingLayout = new javax.swing.GroupLayout(panel_parking);
        panel_parking.setLayout(panel_parkingLayout);
        panel_parkingLayout.setHorizontalGroup(
            panel_parkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        panel_parkingLayout.setVerticalGroup(
            panel_parkingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        panel_centre.add(panel_parking, "card4");

        javax.swing.GroupLayout panel_lostLayout = new javax.swing.GroupLayout(panel_lost);
        panel_lost.setLayout(panel_lostLayout);
        panel_lostLayout.setHorizontalGroup(
            panel_lostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        panel_lostLayout.setVerticalGroup(
            panel_lostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        panel_centre.add(panel_lost, "card5");

        javax.swing.GroupLayout panel_extLayout = new javax.swing.GroupLayout(panel_ext);
        panel_ext.setLayout(panel_extLayout);
        panel_extLayout.setHorizontalGroup(
            panel_extLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        panel_extLayout.setVerticalGroup(
            panel_extLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        panel_centre.add(panel_ext, "card6");

        panel_base.add(panel_centre, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPanel panel_centre;
    private javax.swing.JPanel panel_ext;
    private javax.swing.JPanel panel_left;
    private javax.swing.JPanel panel_lost;
    private javax.swing.JPanel panel_noid;
    private javax.swing.JPanel panel_parking;
    private javax.swing.JPanel panel_top;
    private javax.swing.JPanel panel_visitors;
    private javax.swing.JPanel pnbtn_ext;
    private javax.swing.JPanel pnbtn_lost;
    private javax.swing.JPanel pnbtn_noid;
    private javax.swing.JPanel pnbtn_parking;
    private javax.swing.JPanel pnbtn_visitors;
    // End of variables declaration//GEN-END:variables
}
