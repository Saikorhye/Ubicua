/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.GuardaDatos;
import Clases.Plaza;
import Clases.Usuario;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author evinha
 */
public class Ayuda extends javax.swing.JPanel {

    /**
     * Creates new form VPrincipal
     */
    private VInicial v;
    private Usuario usu;
    private ArrayList<Plaza> plazas;

    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }

    public Ayuda(Usuario us, ArrayList<Plaza> plaz) {
        initComponents();
        this.usu = us;
        this.VolverPrincipal.setText("Volver a Principal");
        this.plazas=plaz;
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
        Usuario = new javax.swing.JMenuItem();
        Multas = new javax.swing.JMenuItem();
        Configuración = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        SalirSesion = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        LabelAyuda = new javax.swing.JLabel();
        jBotonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPopMenuPrincipal.setBackground(new java.awt.Color(68, 217, 230));
        jPopMenuPrincipal.setForeground(new java.awt.Color(68, 217, 230));
        jPopMenuPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 217, 230)));

        VolverPrincipal.setBackground(new java.awt.Color(68, 217, 230));
        VolverPrincipal.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        VolverPrincipal.setText("Ayuda");
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

        Usuario.setBackground(new java.awt.Color(68, 217, 230));
        Usuario.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        Usuario.setText("Usuario");
        Usuario.setBorder(null);
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(Usuario);

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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPopMenuPrincipal.add(jSeparator1);

        SalirSesion.setBackground(new java.awt.Color(68, 217, 230));
        SalirSesion.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        SalirSesion.setText("Cerrar sesión");
        SalirSesion.setBorder(null);
        SalirSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSesionActionPerformed(evt);
            }
        });
        jPopMenuPrincipal.add(SalirSesion);

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(68, 217, 230));
        jPanel1.setForeground(new java.awt.Color(68, 217, 230));

        LabelAyuda.setBackground(new java.awt.Color(68, 217, 230));
        LabelAyuda.setFont(new java.awt.Font("Bitstream Vera Sans", 3, 24)); // NOI18N
        LabelAyuda.setForeground(new java.awt.Color(255, 255, 255));
        LabelAyuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelAyuda.setText("Ayuda");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBotonMenu)
                .addGap(70, 70, 70)
                .addComponent(LabelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelAyuda)
                    .addComponent(jBotonMenu))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel1.setText("Acceda al centro de ayuda de SFPark en");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 60, 190));
        jLabel2.setText("https://sfpark.com/ayuda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(387, Short.MAX_VALUE))
        );
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
        Notificaciones vp = new Notificaciones(this.usu, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_NotificacionesActionPerformed

    private void VolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverPrincipalActionPerformed
        this.v.getContentPane().setVisible(false);
        VPrincipal vp = new VPrincipal(this.usu, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_VolverPrincipalActionPerformed

    private void SalirSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirSesionActionPerformed
        //Serializamos los datos en un fichero
        GuardaDatos object = null;
        String filename = "listausuarios.txt";

        // Deserialization 
        try {
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            // Method for deserialization of object 
            object = (GuardaDatos) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException"
                    + " is caught");
        }

        this.v.getContentPane().setVisible(false);
        IniciarSesion vp = new IniciarSesion(object.getUsuario(), this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_SalirSesionActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        this.v.getContentPane().setVisible(false);
        VUsuario vp = new VUsuario(this.usu, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_UsuarioActionPerformed

    private void MultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultasActionPerformed
        this.v.getContentPane().setVisible(false);
        Multas vp = new Multas(this.usu, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_MultasActionPerformed

    private void ConfiguraciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfiguraciónActionPerformed
        this.v.getContentPane().setVisible(false);
        Configuracion vp = new Configuracion(this.usu, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_ConfiguraciónActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Configuración;
    private javax.swing.JLabel LabelAyuda;
    private javax.swing.JMenuItem Multas;
    private javax.swing.JMenuItem Notificaciones;
    private javax.swing.JMenuItem SalirSesion;
    private javax.swing.JMenuItem Usuario;
    private javax.swing.JMenuItem VolverPrincipal;
    private javax.swing.JButton jBotonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopMenuPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
