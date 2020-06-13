/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Usuario;
import Clases.Vehiculo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author evinha
 */
public class Aparcar extends javax.swing.JPanel {

    /**
     * Creates new form Aparcar
     */
    
    private Image image;
    private VInicial v;
    private Usuario usu;
    private String lugar;
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    
    public Aparcar(Usuario us, String lug, String plaza) {
        initComponents();
        this.usu=us;
        actualizarCombo();
        this.lugar=lug;
        jLabelLugar.setText(this.lugar);
        jLabelPlaza.setText("Plaza "+plaza);
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
        jNotificaciones = new javax.swing.JMenuItem();
        jUsuario = new javax.swing.JMenuItem();
        jMultas = new javax.swing.JMenuItem();
        jConfiguracion = new javax.swing.JMenuItem();
        jAyuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSalirSesion = new javax.swing.JMenuItem();
        jBotonMenu = new javax.swing.JButton();
        jBotonSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPagar = new javax.swing.JButton();
        jComboBoxVehiculo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelPrezo = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        jLabelFin = new javax.swing.JLabel();
        jLabelLugar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelPlaza = new javax.swing.JLabel();

        jPopMenuPrincipal.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jPopMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jPopMenuPrincipal.setBorder(null);
        jPopMenuPrincipal.setBorderPainted(false);

        jNotificaciones.setBackground(new java.awt.Color(68, 217, 230));
        jNotificaciones.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jNotificaciones.setText("Notificaciones");
        jNotificaciones.setBorder(null);
        jNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNotificacionesActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(jNotificaciones);

        jUsuario.setBackground(new java.awt.Color(68, 217, 230));
        jUsuario.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jUsuario.setText("Usuario");
        jUsuario.setBorder(null);
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(jUsuario);

        jMultas.setBackground(new java.awt.Color(68, 217, 230));
        jMultas.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jMultas.setText("Multas");
        jMultas.setBorder(null);
        jMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMultasActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(jMultas);

        jConfiguracion.setBackground(new java.awt.Color(68, 217, 230));
        jConfiguracion.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jConfiguracion.setText("Configuracion");
        jConfiguracion.setBorder(null);
        jConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfiguracionActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(jConfiguracion);

        jAyuda.setBackground(new java.awt.Color(68, 217, 230));
        jAyuda.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jAyuda.setText("Ayuda");
        jAyuda.setBorder(null);
        jAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAyudaActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(jAyuda);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPopMenuPrincipal.add(jSeparator1);

        jSalirSesion.setBackground(new java.awt.Color(68, 217, 230));
        jSalirSesion.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jSalirSesion.setText("Cerrar sesión");
        jSalirSesion.setBorder(null);
        jSalirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirSesionActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(jSalirSesion);

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jBotonMenu.setBackground(new java.awt.Color(68, 217, 230));
        jBotonMenu.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jBotonMenu.setForeground(new java.awt.Color(255, 255, 255));
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

        jBotonSearch.setBackground(new java.awt.Color(216, 215, 214));
        jBotonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/searchicon.png"))); // NOI18N
        jBotonSearch.setBorder(null);
        jBotonSearch.setEnabled(false);
        jBotonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel1.setText("Tempo a aparcar");

        jButtonPagar.setBackground(new java.awt.Color(68, 217, 230));
        jButtonPagar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButtonPagar.setText("Confirmar pago");
        jButtonPagar.setBorder(null);
        jButtonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagarActionPerformed(evt);
            }
        });

        jComboBoxVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVehiculoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione Vehículo");

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setForeground(new java.awt.Color(68, 217, 230));
        jSlider1.setMaximum(240);
        jSlider1.setMinimum(10);
        jSlider1.setValue(120);
        jSlider1.setBorder(null);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 10)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("4 horas");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 10)); // NOI18N
        jLabel4.setText("10 minutos");
        jLabel4.setBorder(null);

        jLabelPrezo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPrezo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabelPrezo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrezo.setText("2,10€");

        jLabelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jLabelInicio.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabelInicio.setText("Data inicio: 16/06/2020  15:40");
        jLabelInicio.setToolTipText("");
        jLabelInicio.setBorder(null);

        jLabelFin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFin.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabelFin.setText("Data fin: 16/06/2020 17:40");
        jLabelFin.setBorder(null);

        jLabelLugar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLugar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabelLugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLugar.setText("Rúa Goméz López");
        jLabelLugar.setBorder(null);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Zona ORA (1,05 €/hora)");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoX(1).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel5.setText("Estado: Libre");

        jLabelPlaza.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPlaza.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabelPlaza.setText("Plaza 1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(204, 204, 204)
                                            .addComponent(jLabel3))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabelInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelPrezo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSlider1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonPagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabelPlaza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabelPlaza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrezo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBotonMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonMenuMouseClicked
        // TODO add your handling code here:
        jPopMenuPrincipal.show(this,jBotonMenu.getX(),jBotonMenu.getY()+ jBotonMenu.getHeight());
    }//GEN-LAST:event_jBotonMenuMouseClicked

    private void jBotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonMenuActionPerformed
        // TODO add your handling code here:
        // menuEmergente.show(this,evt.get .getX(),evt.getY());
    }//GEN-LAST:event_jBotonMenuActionPerformed

    private void jBotonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSearchActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        BuscarRuta vp = new BuscarRuta(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoBuscarRuta();
    }//GEN-LAST:event_jBotonSearchActionPerformed

    private void jNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNotificacionesActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Notificaciones vp = new Notificaciones(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jNotificacionesActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        VUsuario vp = new VUsuario(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMultasActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Multas vp = new Multas(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jMultasActionPerformed

    private void jConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfiguracionActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Configuracion vp = new Configuracion(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jConfiguracionActionPerformed

    private void jAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAyudaActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Ayuda vp = new Ayuda(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jAyudaActionPerformed

    private void jSalirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirSesionActionPerformed

    private void jComboBoxVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxVehiculoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        VPrincipal vp = new VPrincipal(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        actualizarSlider();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButtonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagarActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        ResumenAparcar vp = new ResumenAparcar(this.usu, jLabelPlaza.getText(), jLabelLugar.getText(), jSlider1.getValue()/60, jLabelPrezo.getText(), jLabelFin.getText(), jComboBoxVehiculo.getSelectedItem().toString());
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jButtonPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAyuda;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JButton jBotonSearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonPagar;
    private javax.swing.JComboBox<String> jComboBoxVehiculo;
    private javax.swing.JMenuItem jConfiguracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFin;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelPlaza;
    private javax.swing.JLabel jLabelPrezo;
    private javax.swing.JMenuItem jMultas;
    private javax.swing.JMenuItem jNotificaciones;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopMenuPrincipal;
    private javax.swing.JMenuItem jSalirSesion;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JMenuItem jUsuario;
    // End of variables declaration//GEN-END:variables

    public void paintComponent(Graphics g){
        Dimension tam = this.getSize();
        g.drawImage(this.image, 0, 0, tam.width, tam.height, null);
        super.paintComponent(g);
    }
    
    
    public void setFondoMapaPrincipal() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/MapaInicioUbi.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
    
    public void setFondoMapaRuta() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/Imaxeruta.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
    
    public void setFondoMapaLibre() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/Imaxeubi.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
    
    public void actualizarCombo(){
        
        for(Vehiculo vehiculo : usu.getVehiculos()){
            System.out.println("Item: "+vehiculo.getMatricula()+"\n");
            jComboBoxVehiculo.addItem(vehiculo.getMatricula());
        }
    }
    
    public void actualizarSlider(){
        //Calcular prezo
        double valor= jSlider1.getValue()*1.75; //En centimos
        String prezo=""+valor/100+"€";
        jLabelPrezo.setText(prezo);
        
        //Calcular fecha
        java.util.Date fecha = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); //fecha actual es un Date;
        //Cmabiar fecha actual
        jLabelInicio.setText("Data inicio: "+calendar.get(Calendar.DATE)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR)+" "+calendar.get(Calendar.HOUR_OF_DAY)+":"+calendar.get(Calendar.MINUTE));
        int h=calendar.get(Calendar.HOUR_OF_DAY);
        //Calcular nova fecha
        int min=0;
        int horasS=0;
        if(jSlider1.getValue()>59){
            horasS=jSlider1.getValue()/60;
        }
        calendar.add(Calendar.MINUTE, jSlider1.getValue());//
        min=calendar.get(Calendar.MINUTE);//+jSlider1.getValue();
        calendar.add(Calendar.HOUR_OF_DAY, jSlider1.getValue()/60);
        int ho=calendar.get(Calendar.HOUR_OF_DAY);
        //int ho=horasS+h;
        jLabelFin.setText("Data fin: "+calendar.get(Calendar.DATE)+"/"+calendar.get(Calendar.MONTH)+"/"+calendar.get(Calendar.YEAR)+" "+ho+":"+min);
        ho=0;
        h=0;
        horasS=0;
    }
}
