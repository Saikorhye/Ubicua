/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Usuario;
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
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    public VUsuario(Usuario us) {
        this.usu=us;
        initComponents();
        this.VolverPrincipal.setText("Volver a Principal");
        this.BContra.setVisible(false);
        this.BCambios.setVisible(false);
        TNombreUsu = new javax.swing.JTextField();
        TApellidosUsu = new javax.swing.JTextField();
        TTelefonoUsu = new javax.swing.JTextField();
        TEmailUsu = new javax.swing.JTextField();
        TTarjetaUsu = new javax.swing.JTextField();
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
        LNombreUsu = new javax.swing.JLabel();
        PApellidos = new javax.swing.JPanel();
        LApellidosUsu = new javax.swing.JLabel();
        PTelefono = new javax.swing.JPanel();
        LTelefonoUsu = new javax.swing.JLabel();
        PEmail = new javax.swing.JPanel();
        LEmailUsu = new javax.swing.JLabel();
        PTarjeta = new javax.swing.JPanel();
        LTarjetaUsu = new javax.swing.JLabel();

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

        BEditar.setText("Editar");
        BEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditarActionPerformed(evt);
            }
        });

        BVehiculos.setText("Vehiculos");
        BVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVehiculosActionPerformed(evt);
            }
        });

        LNombre.setText("Nombre");

        LApellidos.setText("Apellidos");

        LTelefono.setText("Telefono");

        LEmail.setText("Email");

        LTarjeta.setText("Tarjeta");

        BContra.setText("Cambiar contraseña");
        BContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BContraActionPerformed(evt);
            }
        });

        BCambios.setText("Guardar cambios");
        BCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCambiosActionPerformed(evt);
            }
        });

        LNombreUsu.setText(usu.getNombre().split(" ")[0]);

        javax.swing.GroupLayout PNombreLayout = new javax.swing.GroupLayout(PNombre);
        PNombre.setLayout(PNombreLayout);
        PNombreLayout.setHorizontalGroup(
            PNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LNombreUsu)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        PNombreLayout.setVerticalGroup(
            PNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNombreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LNombreUsu)
                .addContainerGap())
        );

        String[] nombreComp = usu.getNombre().split(" ");
        String apellidos = null;
        if (nombreComp.length == 2) {
            apellidos = nombreComp[1];
        } else {
            apellidos = nombreComp[1] + " " + nombreComp[2];
        }
        LApellidosUsu.setText(apellidos);

        javax.swing.GroupLayout PApellidosLayout = new javax.swing.GroupLayout(PApellidos);
        PApellidos.setLayout(PApellidosLayout);
        PApellidosLayout.setHorizontalGroup(
            PApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PApellidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LApellidosUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PApellidosLayout.setVerticalGroup(
            PApellidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PApellidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LApellidosUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LTelefonoUsu.setText(usu.getTelefono());

        javax.swing.GroupLayout PTelefonoLayout = new javax.swing.GroupLayout(PTelefono);
        PTelefono.setLayout(PTelefonoLayout);
        PTelefonoLayout.setHorizontalGroup(
            PTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTelefonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTelefonoUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PTelefonoLayout.setVerticalGroup(
            PTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTelefonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTelefonoUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LEmailUsu.setText(usu.getCorreo());

        javax.swing.GroupLayout PEmailLayout = new javax.swing.GroupLayout(PEmail);
        PEmail.setLayout(PEmailLayout);
        PEmailLayout.setHorizontalGroup(
            PEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LEmailUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PEmailLayout.setVerticalGroup(
            PEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LEmailUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LTarjetaUsu.setText(usu.getMetodoPago());

        javax.swing.GroupLayout PTarjetaLayout = new javax.swing.GroupLayout(PTarjeta);
        PTarjeta.setLayout(PTarjetaLayout);
        PTarjetaLayout.setHorizontalGroup(
            PTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTarjetaUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PTarjetaLayout.setVerticalGroup(
            PTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTarjetaUsu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(BCambios)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(BEditar)
                        .addGap(88, 88, 88)
                        .addComponent(BVehiculos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNombre)
                            .addComponent(LTarjeta)
                            .addComponent(LEmail)
                            .addComponent(LTelefono)
                            .addComponent(LApellidos))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BEditar)
                            .addComponent(BVehiculos))
                        .addGap(43, 43, 43)
                        .addComponent(LNombre)
                        .addGap(18, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(PApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(LApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LTelefono)
                        .addGap(28, 28, 28)
                        .addComponent(LEmail)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(PTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LTarjeta)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BContra)
                    .addComponent(BCambios))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonMenuActionPerformed
        // TODO add your handling code here:
       // menuEmergente.show(this,evt.get .getX(),evt.getY());
    }//GEN-LAST:event_jBotonMenuActionPerformed

    private void jBotonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonMenuMouseClicked
        // TODO add your handling code here:
        jPopMenuPrincipal.show(this,jBotonMenu.getX(),jBotonMenu.getY()+ jBotonMenu.getHeight());
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
        TNombreUsu.setText(LNombreUsu.getText());
        PNombre.remove(LNombreUsu);
        PNombre.add(TNombreUsu);
        TApellidosUsu.setText(LApellidosUsu.getText());
        PApellidos.remove(LApellidosUsu);
        PApellidos.add(TApellidosUsu);
        TTelefonoUsu.setText(LTelefonoUsu.getText());
        PTelefono.remove(LTelefonoUsu);
        PTelefono.add(TTelefonoUsu);
        TEmailUsu.setText(LEmailUsu.getText());
        PEmail.remove(LEmailUsu);
        PEmail.add(TEmailUsu);
        TTarjetaUsu.setText(LTarjetaUsu.getText());
        PTarjeta.remove(LTarjetaUsu);
        PTarjeta.add(TTarjetaUsu);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_BEditarActionPerformed

    private void BContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BContraActionPerformed
        CambiarContra vc = new CambiarContra(this.usu);
        vc.setVisible(true);
    }//GEN-LAST:event_BContraActionPerformed

    private void BCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCambiosActionPerformed
        BContra.setVisible(false);
        BCambios.setVisible(false);
        BVehiculos.setVisible(true);
        BEditar.setVisible(true);
        LNombreUsu.setText(TNombreUsu.getText());
        PNombre.remove(TNombreUsu);
        PNombre.add(LNombreUsu);
        LApellidosUsu.setText(TApellidosUsu.getText());
        PApellidos.remove(TApellidosUsu);
        PApellidos.add(LApellidosUsu);
        LTelefonoUsu.setText(TTelefonoUsu.getText());
        PTelefono.remove(TTelefonoUsu);
        PTelefono.add(LTelefonoUsu);
        LEmailUsu.setText(TEmailUsu.getText());
        PEmail.remove(TEmailUsu);
        PEmail.add(LEmailUsu);
        LTarjetaUsu.setText(TTarjetaUsu.getText());
        PTarjeta.remove(TTarjetaUsu);
        PTarjeta.add(LTarjetaUsu);
        
        revalidate();
        repaint();
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
    private javax.swing.JLabel LApellidosUsu;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEmailUsu;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LNombreUsu;
    private javax.swing.JLabel LTarjeta;
    private javax.swing.JLabel LTarjetaUsu;
    private javax.swing.JLabel LTelefono;
    private javax.swing.JLabel LTelefonoUsu;
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
