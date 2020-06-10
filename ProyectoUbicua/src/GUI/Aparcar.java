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
public class Aparcar extends javax.swing.JPanel {

    /**
     * Creates new form Aparcar
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
    
    
    public Aparcar(Usuario us) {
        initComponents();
        this.usu=us;
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jComboBoxVehiculo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();

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

        jBusqueda.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jEditorPane1.setEditable(false);
        jEditorPane1.setBackground(new java.awt.Color(255, 255, 255));
        jEditorPane1.setBorder(null);
        jEditorPane1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jScrollPane2.setViewportView(jEditorPane1);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel1.setText("Tempo a aparcar");

        jProgressBar1.setBackground(new java.awt.Color(68, 217, 230));
        jProgressBar1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jProgressBar1.setMaximum(240);
        jProgressBar1.setMinimum(10);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton2.setText("Confirmar pago");

        jComboBoxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVehiculoActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane2);

        jLabel2.setText("Seleccione Vehículo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jComboBoxVehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBotonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBusqueda, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBotonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAyuda;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JButton jBotonSearch;
    private javax.swing.JTextField jBusqueda;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxVehiculo;
    private javax.swing.JMenuItem jConfiguracion;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMultas;
    private javax.swing.JMenuItem jNotificaciones;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopMenuPrincipal;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JMenuItem jSalirSesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jUsuario;
    // End of variables declaration//GEN-END:variables

    public void paintComponent(Graphics g){
        Dimension tam = this.getSize();
        g.drawImage(this.image, 0, 0, tam.width, tam.height, null);
        super.paintComponent(g);
    }
    
    
    public void setFondoMapaPrincipal() {
	// Construimos la imagen y se la asignamos al atributo background.
        URL url = getClass().getResource("/Imagenes/mapimage.png");
	this.setOpaque(false);
	this.image = new ImageIcon(url).getImage();
	repaint();
    }
}
