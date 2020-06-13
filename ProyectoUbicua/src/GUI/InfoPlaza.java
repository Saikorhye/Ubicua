/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Usuario;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author evinha
 */
public class InfoPlaza extends javax.swing.JPanel {

    /**
     * Creates new form InfoPlaza
     */
    
    private Image image;
    private VInicial v;
    private Usuario usu;
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    
    public InfoPlaza(Usuario usus, String calle, String plaza, String estado, String tipo, String coste, String max) {
        initComponents();
        this.usu=usus;
        jLabel2.setText("Calle: "+calle);
        jLabel3.setText("Plaza: "+plaza);
        jLabel4.setText("Estado: "+estado);
        jLabel5.setText("Tipo: : "+tipo);
        jLabel6.setText("Coste: "+coste);
        jLabel7.setText("Tiempo máximo: "+max);
        if(estado.equals("ocupada")){
            jLabel8.setText("Plaza libre a las 17:17 el 14/06/2020");
        }
        else{
            jLabel8.setText("");
        }
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
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonAparcar = new javax.swing.JButton();

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

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoX(1).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Información de la plaza");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel2.setText("Calle: ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel3.setText("Plaza: ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel4.setText("Estado: ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel5.setText("Tipo: ");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel6.setText("Coste: ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel7.setText("Tiempo máximo:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel8.setText("Plaza libre a las  ");

        jButtonAparcar.setBackground(new java.awt.Color(68, 217, 230));
        jButtonAparcar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButtonAparcar.setText("Aparcar aquí");
        jButtonAparcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAparcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAparcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(50, 50, 50)
                .addComponent(jButtonAparcar)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonMenu)
                    .addComponent(jBotonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void jBotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonMenuActionPerformed
        // TODO add your handling code here:
        // menuEmergente.show(this,evt.get .getX(),evt.getY());
    }//GEN-LAST:event_jBotonMenuActionPerformed

    private void jBotonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonMenuMouseClicked
        // TODO add your handling code here:
        jPopMenuPrincipal.show(this,jBotonMenu.getX(),jBotonMenu.getY()+ jBotonMenu.getHeight());
    }//GEN-LAST:event_jBotonMenuMouseClicked

    private void jButtonAparcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAparcarActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Aparcar vp = new Aparcar(this.usu, jLabel2.getText(), jLabel3.getText());
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_jButtonAparcarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        VPrincipal vp = new VPrincipal(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBotonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSearchActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        BuscarRuta vp = new BuscarRuta(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoBuscarRuta();
    }//GEN-LAST:event_jBotonSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAyuda;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JButton jBotonSearch;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAparcar;
    private javax.swing.JMenuItem jConfiguracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMultas;
    private javax.swing.JMenuItem jNotificaciones;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopMenuPrincipal;
    private javax.swing.JMenuItem jSalirSesion;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jUsuario;
    // End of variables declaration//GEN-END:variables

   public void paintComponent(Graphics g){
        Dimension tam = this.getSize();
        g.drawImage(this.image, 0, 0, tam.width, tam.height, null);
        super.paintComponent(g);
    }
    
    
    public void setFondoMapaPrincipalI() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/MapaInicioUbi.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
}
