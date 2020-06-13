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
public class Ruta extends javax.swing.JPanel {

    /**
     * Creates new form Ruta
     */
    
    private VInicial v;
    private Usuario usu;
    private Image image;
    private String origen;
    private String destino;
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    public Ruta(Usuario us, String ori, String des) {
        initComponents();
        this.usu=us;
        this.destino=des;
        this.origen=ori;
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
        jButtonAparcar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jPopMenuPrincipal.setBackground(new java.awt.Color(68, 217, 230));
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
        jSalirSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jBotonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSearchActionPerformed(evt);
            }
        });

        jButtonAparcar.setBackground(new java.awt.Color(68, 217, 230));
        jButtonAparcar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButtonAparcar.setText("Aparca aquí");
        jButtonAparcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAparcarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 216, 216)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jLabel1.setText("Zona de carga o descarga");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jLabel2.setText("Zona ORA");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jLabel3.setText("Zona reservada a residentes");

        jPanel2.setBackground(new java.awt.Color(255, 250, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 98, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(74, 177, 9));
        jPanel4.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(165, 164, 150));
        jPanel5.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(158, 67, 37));
        jPanel6.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jLabel4.setText("Zona libre");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jLabel5.setText("Zona de plazas especiales");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PParking.jpg"))); // NOI18N
        jButton3.setBorder(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jLabel6.setText("Parquimetro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAparcar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBotonMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAparcar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void jButtonAparcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAparcarActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Aparcar vp = new Aparcar(this.usu, this.destino, "12");
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaRuta();
    }//GEN-LAST:event_jButtonAparcarActionPerformed


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
    private javax.swing.JMenuItem jMultas;
    private javax.swing.JMenuItem jNotificaciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
    
    
    public void setFondoMapaRuta() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/Imaxeruta2.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
}
