/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Usuario;

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
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    public VUsuario(Usuario us) {
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
        Notificaciones = new javax.swing.JMenuItem();
        Usuario = new javax.swing.JMenuItem();
        Multas = new javax.swing.JMenuItem();
        Configuración = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SalirSesion = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jBotonMenu = new javax.swing.JButton();
        LabelAyuda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        Notificaciones.setText("Notificaciones");
        Notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificacionesActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Notificaciones);
        Notificaciones.getAccessibleContext().setAccessibleName("JMenuItem1");

        Usuario.setText("Usuario");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Usuario);

        Multas.setText("Multas");
        Multas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultasActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Multas);

        Configuración.setText("Configuración");
        Configuración.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfiguraciónActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Configuración);

        Ayuda.setText("Ayuda");
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Ayuda);
        jPopMenuPrincipal.add(jSeparator1);

        SalirSesion.setText("Salir de sesión");
        SalirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSesionActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(SalirSesion);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(68, 217, 230));
        jPanel1.setForeground(new java.awt.Color(68, 217, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jBotonMenu.setBackground(new java.awt.Color(68, 217, 230));
        jBotonMenu.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jBotonMenu.setText("Menu");
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

        LabelAyuda.setBackground(new java.awt.Color(255, 255, 255));
        LabelAyuda.setFont(new java.awt.Font("Bitstream Vera Sans", 3, 24)); // NOI18N
        LabelAyuda.setForeground(new java.awt.Color(68, 217, 230));
        LabelAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelAyuda.setText("Ayuda");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 119, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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
      
    }//GEN-LAST:event_SalirSesionActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
         this.v.getContentPane().setVisible(false);
        VUsuario vp = new VUsuario(this.usu);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_UsuarioActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem Configuración;
    private javax.swing.JLabel LabelAyuda;
    private javax.swing.JMenuItem Multas;
    private javax.swing.JMenuItem Notificaciones;
    private javax.swing.JMenuItem SalirSesion;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopMenuPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
