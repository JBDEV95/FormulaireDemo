
package Vue;

import java.awt.Color;

/**
 *
 * @author JBDEV95
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        super.setBackground(new Color(0, 0, 0, 0));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new com.jbdev.panel.Panel95();
        panelHeader = new com.jbdev.panel.Panel95();
        jLabel1 = new javax.swing.JLabel();
        panelForm = new com.jbdev.panel.Panel95();
        panelUsername = new com.jbdev.panel.Panel95();
        txtUsername = new javax.swing.JTextField();
        panelUsername1 = new com.jbdev.panel.Panel95();
        txtUsername1 = new javax.swing.JTextField();
        panelUsername2 = new com.jbdev.panel.Panel95();
        txtUsername2 = new javax.swing.JTextField();
        panelUsername3 = new com.jbdev.panel.Panel95();
        txtUsername3 = new javax.swing.JTextField();
        panelFooter = new com.jbdev.panel.Panel95();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        panelButtonCenter = new com.jbdev.panel.Panel95();
        panelButtonLeft = new com.jbdev.panel.Panel95();
        panelButtonRight = new com.jbdev.panel.Panel95();
        btnSeconnecter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(22, 51, 82));
        panelPrincipal.setArc_coin(new java.awt.Dimension(20, 20));

        panelHeader.setBackground(new java.awt.Color(15, 25, 36));
        panelHeader.setArc_coin(new java.awt.Dimension(20, 20));
        panelHeader.setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Resgistartion Form");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 35));
        panelHeader.add(jLabel1);

        panelForm.setBackground(new java.awt.Color(22, 51, 82));
        panelForm.setForeground(new java.awt.Color(22, 51, 82));
        panelForm.setCouleur_ombre(new java.awt.Color(22, 51, 82));
        panelForm.setLayout(new java.awt.GridLayout(4, 1, 4, 20));

        panelUsername.setBackground(new java.awt.Color(255, 255, 255));
        panelUsername.setArc_coin(new java.awt.Dimension(20, 20));
        panelUsername.setLayout(new java.awt.FlowLayout());

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setText("Username");
        txtUsername.setBorder(null);
        txtUsername.setMaximumSize(new java.awt.Dimension(300, 37));
        txtUsername.setMinimumSize(new java.awt.Dimension(300, 37));
        txtUsername.setPreferredSize(new java.awt.Dimension(300, 37));
        panelUsername.add(txtUsername);

        panelForm.add(panelUsername);

        panelUsername1.setBackground(new java.awt.Color(255, 255, 255));
        panelUsername1.setArc_coin(new java.awt.Dimension(20, 20));
        panelUsername1.setLayout(new java.awt.FlowLayout());

        txtUsername1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername1.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername1.setText("Last name");
        txtUsername1.setBorder(null);
        txtUsername1.setMaximumSize(new java.awt.Dimension(300, 37));
        txtUsername1.setMinimumSize(new java.awt.Dimension(300, 37));
        txtUsername1.setPreferredSize(new java.awt.Dimension(300, 37));
        panelUsername1.add(txtUsername1);

        panelForm.add(panelUsername1);

        panelUsername2.setBackground(new java.awt.Color(255, 255, 255));
        panelUsername2.setArc_coin(new java.awt.Dimension(20, 20));
        panelUsername2.setLayout(new java.awt.FlowLayout());

        txtUsername2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername2.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername2.setText("Email");
        txtUsername2.setBorder(null);
        txtUsername2.setMaximumSize(new java.awt.Dimension(300, 37));
        txtUsername2.setMinimumSize(new java.awt.Dimension(300, 37));
        txtUsername2.setPreferredSize(new java.awt.Dimension(300, 37));
        panelUsername2.add(txtUsername2);

        panelForm.add(panelUsername2);

        panelUsername3.setBackground(new java.awt.Color(255, 255, 255));
        panelUsername3.setArc_coin(new java.awt.Dimension(20, 20));
        panelUsername3.setLayout(new java.awt.FlowLayout());

        txtUsername3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername3.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername3.setText("Password");
        txtUsername3.setBorder(null);
        txtUsername3.setMaximumSize(new java.awt.Dimension(300, 37));
        txtUsername3.setMinimumSize(new java.awt.Dimension(300, 37));
        txtUsername3.setPreferredSize(new java.awt.Dimension(300, 37));
        panelUsername3.add(txtUsername3);

        panelForm.add(panelUsername3);

        panelFooter.setBackground(new java.awt.Color(22, 51, 82));
        panelFooter.setForeground(new java.awt.Color(22, 51, 82));
        panelFooter.setCouleur_ombre(new java.awt.Color(22, 51, 82));
        panelFooter.setLayout(new java.awt.GridLayout(3, 1, 4, 20));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("<html>Nous nous tenons à votre disposition pour tout/tous renseignement(s) complémentaire(s) qu’il vous plairait de nous demander.</html>");
        jCheckBox1.setOpaque(false);
        panelFooter.add(jCheckBox1);

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("<html>Nous nous tenons à votre disposition pour tout/tous renseignement(s) complémentaire(s) qu’il vous plairait de nous demander.</html>");
        jCheckBox2.setOpaque(false);
        panelFooter.add(jCheckBox2);

        panelButtonCenter.setBackground(new java.awt.Color(22, 51, 82));
        panelButtonCenter.setForeground(new java.awt.Color(22, 51, 82));
        panelButtonCenter.setCouleur_ombre(new java.awt.Color(22, 51, 82));
        panelButtonCenter.setLayout(new javax.swing.BoxLayout(panelButtonCenter, javax.swing.BoxLayout.LINE_AXIS));

        panelButtonLeft.setBackground(new java.awt.Color(22, 51, 82));
        panelButtonLeft.setForeground(new java.awt.Color(22, 51, 82));
        panelButtonLeft.setCouleur_ombre(new java.awt.Color(22, 51, 82));

        javax.swing.GroupLayout panelButtonLeftLayout = new javax.swing.GroupLayout(panelButtonLeft);
        panelButtonLeft.setLayout(panelButtonLeftLayout);
        panelButtonLeftLayout.setHorizontalGroup(
            panelButtonLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );
        panelButtonLeftLayout.setVerticalGroup(
            panelButtonLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        panelButtonCenter.add(panelButtonLeft);

        panelButtonRight.setBackground(new java.awt.Color(21, 137, 79));
        panelButtonRight.setArc_coin(new java.awt.Dimension(30, 30));
        panelButtonRight.setMaximumSize(new java.awt.Dimension(200, 40));
        panelButtonRight.setMinimumSize(new java.awt.Dimension(200, 40));
        panelButtonRight.setPreferredSize(new java.awt.Dimension(200, 40));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0);
        flowLayout1.setAlignOnBaseline(true);
        panelButtonRight.setLayout(flowLayout1);

        btnSeconnecter.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        btnSeconnecter.setForeground(new java.awt.Color(255, 255, 255));
        btnSeconnecter.setText("Se connecter");
        btnSeconnecter.setBorder(null);
        btnSeconnecter.setBorderPainted(false);
        btnSeconnecter.setContentAreaFilled(false);
        btnSeconnecter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSeconnecter.setMaximumSize(new java.awt.Dimension(180, 40));
        btnSeconnecter.setMinimumSize(new java.awt.Dimension(180, 40));
        btnSeconnecter.setOpaque(false);
        btnSeconnecter.setPreferredSize(new java.awt.Dimension(180, 40));
        btnSeconnecter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSeconnecterMouseEntered(evt);
            }
        });
        panelButtonRight.add(btnSeconnecter);

        panelButtonCenter.add(panelButtonRight);

        panelFooter.add(panelButtonCenter);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelForm, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(378, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeconnecterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeconnecterMouseEntered
        btnSeconnecter.setBackground(new Color(21,137,79));
    }//GEN-LAST:event_btnSeconnecterMouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeconnecter;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private com.jbdev.panel.Panel95 panelButtonCenter;
    private com.jbdev.panel.Panel95 panelButtonLeft;
    private com.jbdev.panel.Panel95 panelButtonRight;
    private com.jbdev.panel.Panel95 panelFooter;
    private com.jbdev.panel.Panel95 panelForm;
    private com.jbdev.panel.Panel95 panelHeader;
    private com.jbdev.panel.Panel95 panelPrincipal;
    private com.jbdev.panel.Panel95 panelUsername;
    private com.jbdev.panel.Panel95 panelUsername1;
    private com.jbdev.panel.Panel95 panelUsername2;
    private com.jbdev.panel.Panel95 panelUsername3;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsername1;
    private javax.swing.JTextField txtUsername2;
    private javax.swing.JTextField txtUsername3;
    // End of variables declaration//GEN-END:variables
}
