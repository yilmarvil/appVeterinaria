package VISTA;



import CONTROLADOR.cUsuarios;
import ENCRIPTACION.EncriptadorAES256;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class frmLogin extends javax.swing.JFrame {
    
    cUsuarios ocUsuarios = new cUsuarios();
    public frmLogin() {
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

        pnlFondo = new javax.swing.JPanel();
        pnlIzquierda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pssPasword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        pnlDerecha = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlFondo.setPreferredSize(new java.awt.Dimension(630, 440));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIzquierda.setBackground(new java.awt.Color(48, 161, 191));
        pnlIzquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contrase??a");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlIzquierda.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 210, 200, 40));

        txtUsuario.setBackground(new java.awt.Color(48, 161, 191));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setSelectionColor(new java.awt.Color(255, 255, 255));
        pnlIzquierda.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 167, 200, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario o Email");
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlIzquierda.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 127, 190, 40));

        pssPasword.setBackground(new java.awt.Color(48, 161, 191));
        pssPasword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pssPasword.setForeground(new java.awt.Color(255, 255, 255));
        pssPasword.setBorder(null);
        pssPasword.setSelectionColor(new java.awt.Color(255, 255, 255));
        pnlIzquierda.add(pssPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 252, 201, 35));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        pnlIzquierda.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 287, -1, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        pnlIzquierda.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 202, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/assets/contrase??a-35.png"))); // NOI18N
        pnlIzquierda.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 252, 40, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/assets/nombre-35.png"))); // NOI18N
        pnlIzquierda.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 167, 40, -1));

        jLabel7.setFont(new java.awt.Font("Gotham Thin", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicio de Sesi??n");
        pnlIzquierda.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 48, -1, -1));

        jPanel7.setBackground(new java.awt.Color(48, 161, 191));

        btnCancelar.setBackground(new java.awt.Color(217, 83, 79));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/assets/apagar-32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.setIconTextGap(15);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(92, 184, 92));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/assets/entrar-32.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIngresar.setIconTextGap(15);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlIzquierda.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 337, -1, 60));

        lblClose.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("x");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        pnlIzquierda.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 30));

        pnlFondo.add(pnlIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 0, 320, 440));

        pnlDerecha.setBackground(new java.awt.Color(1, 92, 132));
        pnlDerecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/assets/logo.png"))); // NOI18N
        pnlDerecha.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tekton Pro Cond", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Lozano");
        pnlDerecha.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 120, -1));

        jLabel9.setFont(new java.awt.Font("Tekton Pro Cond", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Mata");
        pnlDerecha.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        jLabel2.setBackground(new java.awt.Color(1, 92, 132));
        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(48, 161, 191));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clinica Veterinaria");
        pnlDerecha.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 50));

        pnlFondo.add(pnlDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 315, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
  
        String nick = txtUsuario.getText();
        //comvertimos password a String
        char[] arregloPassword = pssPasword.getPassword();
        String password = new String(arregloPassword);
        
        EncriptadorAES256 encriptador = new EncriptadorAES256();
        String encriptado = encriptador.getAESEncrypt(password);
        
        DefaultTableModel modeloUsuarios =ocUsuarios.RecuperarUsuario(nick, encriptado);

        if (modeloUsuarios.getRowCount()==1) {
            frmPrincipalMenu ofPrincipal= new frmPrincipalMenu();
            ofPrincipal.lblUsuario.setText(modeloUsuarios.getValueAt(0,4).toString());
            int tipo = Integer.parseInt(modeloUsuarios.getValueAt(0, 1).toString());
            //roles y permisos de usuaro segun el tipo
            switch (tipo) {
                case 0:
                    ofPrincipal.btnUsuarios.setVisible(true);
                break;
                case 1:
                    ofPrincipal.btnUsuarios.setVisible(false);
                break;
                default:
                    ofPrincipal.btnUsuarios.setEnabled(false);
                    ofPrincipal.btnInicio.setEnabled(false);
                    ofPrincipal.btnRegistroCliente.setEnabled(false);
                    ofPrincipal.btnRegistroMascota.setEnabled(false);
                    ofPrincipal.btnMedicos.setEnabled(false);
                    ofPrincipal.btnConsultas.setEnabled(false);
                    ofPrincipal.btnTratamientos.setEnabled(false);
            }
            
            ofPrincipal.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane,"Usuario y/o Contrase??a son incorrectos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        UIManager.put( "TextComponent.arc", 15 );
        UIManager.put( "Button.arc", 20 );
        UIManager.put( "Component.focusWidth", 4 );
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblClose;
    private javax.swing.JPanel pnlDerecha;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlIzquierda;
    private javax.swing.JPasswordField pssPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
