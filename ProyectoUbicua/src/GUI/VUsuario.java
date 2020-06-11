/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Usuario;
import java.awt.CardLayout;
import java.util.ArrayList;

/**
 *
 * @author evinha
 */
public class VUsuario extends javax.swing.JPanel {

    /**
     * Creates new form VPrincipal
     */
    private VInicial v;
    private Usuario usu;
    private javax.swing.JTextField TNombreUsu;
    private javax.swing.JTextField TApellidosUsu;
    private javax.swing.JTextField TTelefonoUsu;
    private javax.swing.JTextField TEmailUsu;
    private javax.swing.JTextField TTarjetaUsu;
    private javax.swing.JLabel LNombreUsu;
    private javax.swing.JLabel LApellidosUsu;
    private javax.swing.JLabel LTelefonoUsu;
    private javax.swing.JLabel LEmailUsu;
    private javax.swing.JLabel LTarjetaUsu;
    private javax.swing.JPanel PNombreT;
    private javax.swing.JPanel PApellidosT;
    private javax.swing.JPanel PTelefonoT;
    private javax.swing.JPanel PEmailT;
    private javax.swing.JPanel PTarjetaT;
    private javax.swing.JPanel PNombreL;
    private javax.swing.JPanel PApellidosL;
    private javax.swing.JPanel PTelefonoL;
    private javax.swing.JPanel PEmailL;
    private javax.swing.JPanel PTarjetaL;

    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }

    public VUsuario(Usuario us) {
        this.usu = us;
        initComponents();
        this.VolverPrincipal.setText("Volver a Principal");
        this.BContra.setVisible(false);
        this.BCambios.setVisible(false);
        TNombreUsu = new javax.swing.JTextField(15);
        TApellidosUsu = new javax.swing.JTextField(15);
        TTelefonoUsu = new javax.swing.JTextField(15);
        TEmailUsu = new javax.swing.JTextField(15);
        TTarjetaUsu = new javax.swing.JTextField(15);

        String[] nombre = usu.getNombre().split(" ");
        LNombreUsu = new javax.swing.JLabel(nombre[0]);
        if (nombre.length > 2) {
            LApellidosUsu = new javax.swing.JLabel(nombre[1] + " " + nombre[2]);
        } else {
            LApellidosUsu = new javax.swing.JLabel(nombre[1]);
        }
        LTelefonoUsu = new javax.swing.JLabel(usu.getTelefono());
        LEmailUsu = new javax.swing.JLabel(usu.getCorreo());
        LTarjetaUsu = new javax.swing.JLabel(usu.getMetodoPago());

        PNombreT = new javax.swing.JPanel();
        PNombreT.add(TNombreUsu);
        PApellidosT = new javax.swing.JPanel();
        PApellidosT.add(TApellidosUsu);
        PTelefonoT = new javax.swing.JPanel();
        PTelefonoT.add(TTelefonoUsu);
        PEmailT = new javax.swing.JPanel();
        PEmailT.add(TEmailUsu);
        PTarjetaT = new javax.swing.JPanel();
        PTarjetaT.add(TTarjetaUsu);

        PNombreL = new javax.swing.JPanel();
        PNombreL.add(LNombreUsu);
        PApellidosL = new javax.swing.JPanel();
        PApellidosL.add(LApellidosUsu);
        PTelefonoL = new javax.swing.JPanel();
        PTelefonoL.add(LTelefonoUsu);
        PEmailL = new javax.swing.JPanel();
        PEmailL.add(LEmailUsu);
        PTarjetaL = new javax.swing.JPanel();
        PTarjetaL.add(LTarjetaUsu);

        PNombre.setLayout(new CardLayout());
        PNombre.add(PNombreL, "label");
        PNombre.add(PNombreT, "TField");
        PApellidos.setLayout(new CardLayout());
        PApellidos.add(PApellidosL, "label");
        PApellidos.add(PApellidosT, "TField");
        PTelefono.setLayout(new CardLayout());
        PTelefono.add(PTelefonoL, "label");
        PTelefono.add(PTelefonoT, "TField");
        PEmail.setLayout(new CardLayout());
        PEmail.add(PEmailL, "label");
        PEmail.add(PEmailT, "TField");
        PTarjeta.setLayout(new CardLayout());
        PTarjeta.add(PTarjetaL, "label");
        PTarjeta.add(PTarjetaT, "TField");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopMenuPrincipal = new javax.swing.JPopupMenu();
        VolverPrincipal = new javax.swing.JMenuItem();
        Notificaciones = new javax.swing.JMenuItem();
        Multas = new javax.swing.JMenuItem();
        Configuración = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        SalirSesion = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jBotonMenu = new javax.swing.JButton();
        LabelAyuda = new javax.swing.JLabel();
        BEditar = new javax.swing.JButton();
        BVehiculos = new javax.swing.JButton();
        LNombre = new javax.swing.JLabel();
        LApellidos = new javax.swing.JLabel();
        LTelefono = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        LTarjeta = new javax.swing.JLabel();
        BContra = new javax.swing.JButton();
        BCambios = new javax.swing.JButton();
        PNombre = new javax.swing.JPanel();
        PApellidos = new javax.swing.JPanel();
        PTelefono = new javax.swing.JPanel();
        PEmail = new javax.swing.JPanel();
        PTarjeta = new javax.swing.JPanel();

        jPopMenuPrincipal.setBackground(new java.awt.Color(68, 217, 230));
        jPopMenuPrincipal.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jPopMenuPrincipal.setForeground(new java.awt.Color(68, 217, 230));
        jPopMenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 217, 230)));

        VolverPrincipal.setBackground(new java.awt.Color(68, 217, 230));
        VolverPrincipal.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        VolverPrincipal.setText("Usuario");
        VolverPrincipal.setBorder(null);
        VolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverPrincipalActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(VolverPrincipal);

        Notificaciones.setBackground(new java.awt.Color(68, 217, 230));
        Notificaciones.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        Notificaciones.setText("Notificaciones");
        Notificaciones.setBorder(null);
        Notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Notificaciones);
        Notificaciones.getAccessibleContext().setAccessibleName("JMenuItem1");

        Multas.setBackground(new java.awt.Color(68, 217, 230));
        Multas.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        Multas.setText("Multas");
        Multas.setBorder(null);
        Multas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultasActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Multas);

        Configuración.setBackground(new java.awt.Color(68, 217, 230));
        Configuración.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        Configuración.setText("Configuración");
        Configuración.setBorder(null);
        Configuración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguraciónActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Configuración);

        Ayuda.setBackground(new java.awt.Color(68, 217, 230));
        Ayuda.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        Ayuda.setText("Ayuda");
        Ayuda.setBorder(null);
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Ayuda);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPopMenuPrincipal.add(jSeparator2);

        SalirSesion.setBackground(new java.awt.Color(68, 217, 230));
        SalirSesion.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        SalirSesion.setText("Salir de sesión");
        SalirSesion.setBorder(null);
        SalirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSesionActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(SalirSesion);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(68, 217, 230));
        jPanel1.setForeground(new java.awt.Color(68, 217, 230));

        jBotonMenu.setBackground(new java.awt.Color(68, 217, 230));
        jBotonMenu.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jBotonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoMenuAzul.png"))); // NOI18N
        jBotonMenu.setBorder(null);
        jBotonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonMenuMouseClicked(evt);
            }
        });
        jBotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonMenuActionPerformed(evt);
            }
        });

        LabelAyuda.setBackground(new java.awt.Color(68, 217, 230));
        LabelAyuda.setFont(new java.awt.Font("Bitstream Vera Sans", 3, 24)); // NOI18N
        LabelAyuda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelAyuda.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBotonMenu)
                .addGap(63, 63, 63)
                .addComponent(LabelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelAyuda)
                    .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, -1));

        BEditar.setText("Editar");
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });
        add(BEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 58, -1, -1));

        BVehiculos.setText("Vehiculos");
        BVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVehiculosActionPerformed(evt);
            }
        });
        add(BVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 58, -1, -1));

        LNombre.setText("Nombre");
        add(LNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        LApellidos.setText("Apellidos");
        add(LApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        LTelefono.setText("Telefono");
        add(LTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        LEmail.setText("Email");
        add(LEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        LTarjeta.setText("Tarjeta");
        add(LTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        BContra.setText("Cambiar contraseña");
        BContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContraActionPerformed(evt);
            }
        });
        add(BContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        BCambios.setText("Guardar cambios");
        BCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCambiosActionPerformed(evt);
            }
        });
        add(BCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        PNombre.setLayout(new java.awt.CardLayout());
        add(PNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 116, 199, 30));

        PApellidos.setLayout(new java.awt.CardLayout());
        add(PApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 164, 199, 30));

        PTelefono.setLayout(new java.awt.CardLayout());
        add(PTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 212, 199, 30));

        PEmail.setLayout(new java.awt.CardLayout());
        add(PEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 260, 199, 30));

        PTarjeta.setLayout(new java.awt.CardLayout());
        add(PTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 308, 199, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonMenuActionPerformed
        // TODO add your handling code here:
        // menuEmergente.show(this,evt.get .getX(),evt.getY());
    }//GEN-LAST:event_jBotonMenuActionPerformed

    private void jBotonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonMenuMouseClicked
        // TODO add your handling code here:
        jPopMenuPrincipal.show(this, jBotonMenu.getX(), jBotonMenu.getY() + jBotonMenu.getHeight());
    }//GEN-LAST:event_jBotonMenuMouseClicked

    private void NotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificacionesActionPerformed
        this.v.getContentPane().setVisible(false);
        Notificaciones vp = new Notificaciones(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);

    }//GEN-LAST:event_NotificacionesActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        this.v.getContentPane().setVisible(false);
        Ayuda vp = new Ayuda(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_AyudaActionPerformed

    private void SalirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirSesionActionPerformed
        this.v.getContentPane().setVisible(false);
        Usuario usu1 = new Usuario("Eva Suarez Vazquez", "eva@gmail.com", "1234", "Tarjeta", "666666666");
        Usuario usu2 = new Usuario("admin", "admin", "admin", "Tarjeta", "666666666");
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usu1);
        usuarios.add(usu2);
        IniciarSesion vi = new IniciarSesion(usuarios);
        vi.setVisible(true);
        vi.setV(this.v);
        this.v.setContentPane(vi);
    }//GEN-LAST:event_SalirSesionActionPerformed

    private void VolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverPrincipalActionPerformed
        this.v.getContentPane().setVisible(false);
        VPrincipal vp = new VPrincipal(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_VolverPrincipalActionPerformed

    private void MultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultasActionPerformed
        this.v.getContentPane().setVisible(false);
        Multas vp = new Multas(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_MultasActionPerformed

    private void ConfiguraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguraciónActionPerformed
        this.v.getContentPane().setVisible(false);
        Configuracion vp = new Configuracion(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_ConfiguraciónActionPerformed

    private void BEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditarActionPerformed
        BContra.setVisible(true);
        BCambios.setVisible(true);
        BVehiculos.setVisible(false);
        BEditar.setVisible(false);
        CardLayout c = (CardLayout) PNombre.getLayout();
        TNombreUsu.setText(LNombreUsu.getText());
        c.show(PNombre, "TField");
        c = (CardLayout) PApellidos.getLayout();
        TApellidosUsu.setText(LApellidosUsu.getText());
        c.show(PApellidos, "TField");
        c = (CardLayout) PTelefono.getLayout();
        TTelefonoUsu.setText(LTelefonoUsu.getText());
        c.show(PTelefono, "TField");
        c = (CardLayout) PEmail.getLayout();
        TEmailUsu.setText(LEmailUsu.getText());
        c.show(PEmail, "TField");
        c = (CardLayout) PTarjeta.getLayout();
        TTarjetaUsu.setText(LTarjetaUsu.getText());
        c.show(PTarjeta, "TField");
    }//GEN-LAST:event_BEditarActionPerformed

    private void BContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContraActionPerformed
        VCambiarContra vc = new VCambiarContra(v, true, this.usu, this);
        vc.setVisible(true);
    }//GEN-LAST:event_BContraActionPerformed

    private void BCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCambiosActionPerformed
        ArrayList<Integer> vacios = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            vacios.add(0);
        }
        boolean fallo = false;

        if (TNombreUsu.getText().equals("")) {
            vacios.set(0, 1);
            fallo = true;
        }
        if (TApellidosUsu.getText().equals("")) {
            vacios.set(1, 1);
            fallo = true;
        }
        if (TTelefonoUsu.getText().equals("")) {
            vacios.set(2, 1);
            fallo = true;
        }
        if (TEmailUsu.getText().equals("")) {
            vacios.set(3, 1);
            fallo = true;
        }
        if (TTarjetaUsu.getText().equals("")) {
            vacios.set(4, 1);
            fallo = true;
        }

        if (fallo) {
            VErrorEditar vee = new VErrorEditar(v, true, vacios);
            vee.setVisible(true);
        } else {
            BContra.setVisible(false);
            BCambios.setVisible(false);
            BVehiculos.setVisible(true);
            BEditar.setVisible(true);

            CardLayout c = (CardLayout) PNombre.getLayout();
            LNombreUsu.setText(TNombreUsu.getText());
            c.show(PNombre, "label");
            c = (CardLayout) PApellidos.getLayout();
            LApellidosUsu.setText(TApellidosUsu.getText());
            c.show(PApellidos, "label");
            c = (CardLayout) PTelefono.getLayout();
            LTelefonoUsu.setText(TTelefonoUsu.getText());
            c.show(PTelefono, "label");
            c = (CardLayout) PEmail.getLayout();
            LEmailUsu.setText(TEmailUsu.getText());
            c.show(PEmail, "label");
            c = (CardLayout) PTarjeta.getLayout();
            LTarjetaUsu.setText(TTarjetaUsu.getText());
            c.show(PTarjeta, "label");
        }
    }//GEN-LAST:event_BCambiosActionPerformed

    private void BVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVehiculosActionPerformed
        this.v.getContentPane().setVisible(false);
        Vehiculos vp = new Vehiculos(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_BVehiculosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JButton BCambios;
    private javax.swing.JButton BContra;
    private javax.swing.JButton BEditar;
    private javax.swing.JButton BVehiculos;
    private javax.swing.JMenuItem Configuración;
    private javax.swing.JLabel LApellidos;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LTarjeta;
    private javax.swing.JLabel LTelefono;
    private javax.swing.JLabel LabelAyuda;
    private javax.swing.JMenuItem Multas;
    private javax.swing.JMenuItem Notificaciones;
    private javax.swing.JPanel PApellidos;
    private javax.swing.JPanel PEmail;
    private javax.swing.JPanel PNombre;
    private javax.swing.JPanel PTarjeta;
    private javax.swing.JPanel PTelefono;
    private javax.swing.JMenuItem SalirSesion;
    private javax.swing.JMenuItem VolverPrincipal;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopMenuPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void cambiarContra(String contra) {
        usu.setContrasena(contra);
    }

}
