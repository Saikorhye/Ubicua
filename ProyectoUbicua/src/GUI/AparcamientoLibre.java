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
public class AparcamientoLibre extends javax.swing.JPanel {

    /**
     * Creates new form AparcamientoLibre
     */
    
    private VInicial v;
    private Usuario usu;
    private Image image;
    private String lugar; 
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    
    public AparcamientoLibre(Usuario us, String lug) {
        initComponents();
        this.usu=us;
        this.lugar=lug;
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
        jBusqueda = new javax.swing.JTextField();
        jBotonSearch = new javax.swing.JButton();
        jButtonAparcar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPopMenuPrincipal.setBackground(new java.awt.Color(68, 217, 230));
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

        jBusqueda.setBackground(new java.awt.Color(216, 216, 216));
        jBusqueda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBusquedaActionPerformed(evt);
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Leyenda(2).png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 216, 216)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jButtonAparcar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBusqueda, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAparcar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
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

    private void jBotonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonMenuMouseClicked
        // TODO add your handling code here:
        jPopMenuPrincipal.show(this,jBotonMenu.getX(),jBotonMenu.getY()+ jBotonMenu.getHeight());
    }//GEN-LAST:event_jBotonMenuMouseClicked

    private void jBotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonMenuActionPerformed
        // TODO add your handling code here:
        // menuEmergente.show(this,evt.get .getX(),evt.getY());
    }//GEN-LAST:event_jBotonMenuActionPerformed

    private void jBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBusquedaActionPerformed

    private void jBotonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSearchActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        BuscarRuta vp = new BuscarRuta(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoBuscarRuta();
    }//GEN-LAST:event_jBotonSearchActionPerformed

    private void jButtonAparcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAparcarActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Aparcar vp = new Aparcar(this.usu, this.lugar);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_jButtonAparcarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAyuda;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JButton jBotonSearch;
    private javax.swing.JTextField jBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAparcar;
    private javax.swing.JMenuItem jConfiguracion;
    private javax.swing.JMenuItem jMultas;
    private javax.swing.JMenuItem jNotificaciones;
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
    
    
    public void setFondoMapaLibre() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/mapimage.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
    
    public void setFondoLeyenda() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/Leyenda.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
}
