/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.GuardaDatos;
import Clases.Plaza;
import Clases.Tarxeta;
import Clases.Usuario;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class IniciarSesion extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    private VInicial v;
    private ArrayList<Usuario> usus;
    private ArrayList<Plaza> plazas;

    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }

    public IniciarSesion(ArrayList<Usuario> Usuarios, ArrayList<Plaza> plaza) {
        initComponents();
        this.usus = Usuarios;
        this.plazas=plaza;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonImagen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jContrasena = new javax.swing.JPasswordField();
        jButtonAcceder = new javax.swing.JButton();
        jButtonRegistrarte = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setPreferredSize(new java.awt.Dimension(350, 500));

        jButtonImagen.setBackground(new java.awt.Color(255, 255, 255));
        jButtonImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SCParkMediana.png"))); // NOI18N
        jButtonImagen.setBorderPainted(false);
        jButtonImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagenActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Correo electrónico");

        JCorreo.setBackground(new java.awt.Color(216, 216, 216));
        JCorreo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        JCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCorreoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");

        jContrasena.setBackground(new java.awt.Color(216, 216, 216));
        jContrasena.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jContrasena.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jContrasenaKeyPressed(evt);
            }
        });

        jButtonAcceder.setBackground(new java.awt.Color(68, 217, 230));
        jButtonAcceder.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButtonAcceder.setText("Acceder");
        jButtonAcceder.setBorder(null);
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        jButtonAcceder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAccederKeyPressed(evt);
            }
        });

        jButtonRegistrarte.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarte.setFont(new java.awt.Font("Cantarell", 3, 15)); // NOI18N
        jButtonRegistrarte.setForeground(new java.awt.Color(68, 217, 230));
        jButtonRegistrarte.setText("Registrate");
        jButtonRegistrarte.setBorder(null);
        jButtonRegistrarte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegistrarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarteActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿No tienes cuenta?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButtonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonRegistrarte, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jContrasena)
                                .addComponent(JCorreo)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRegistrarte)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonImagenActionPerformed

    private void JCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCorreoActionPerformed

    private void jButtonRegistrarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarteActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Registrar vp = new Registrar(this.usus, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jButtonRegistrarteActionPerformed

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
        acceso();
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jButtonAccederKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAccederKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            acceso();
        }
    }//GEN-LAST:event_jButtonAccederKeyPressed

    private void jContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            acceso();
        }
    }//GEN-LAST:event_jContrasenaKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JCorreo;
    private javax.swing.JButton jButtonAcceder;
    private javax.swing.JButton jButtonImagen;
    private javax.swing.JButton jButtonRegistrarte;
    private javax.swing.JPasswordField jContrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void acceso() {
        // TODO add your handling code here:
        int cont = 0;
        String correo = JCorreo.getText();
        String contrasena = new String(jContrasena.getPassword());
        for (Usuario usuario : usus) {
            if (usuario.getCorreo().equals(correo)) {
                if (usuario.getContrasena().equals(contrasena)) {
                    cont = 1;
                    
                    //Serializamos los datos en un fichero
                    GuardaDatos object = new GuardaDatos(this.usus);
                    String filename = "listausuarios.txt";

                    // Serialization  
                    try {
                        //Saving of object in a file 
                        FileOutputStream file = new FileOutputStream(filename);
                        ObjectOutputStream out = new ObjectOutputStream(file);

                        // Method for serialization of object 
                        out.writeObject(object);

                        out.close();
                        file.close();

                        System.out.println("Object has been serialized");

                    } catch (IOException ex) {
                        ex.printStackTrace();
                        System.out.println(" /nIOException is caught");
                    }
                    
                    //Credenciales correctas, pasase a seguinte ventana
                    this.v.getContentPane().setVisible(false);
                    VPrincipal vp = new VPrincipal(usuario, this.plazas);
                    vp.setVisible(true);
                    vp.setV(this.v);
                    this.v.setContentPane(vp);
                    vp.setFondoMapaPrincipal();
                }
            }
        }
        //Non esta correcta a contrasena ou o correo, salta alerta
        if (cont == 0) {
            JCorreo.setText(null);
            jContrasena.setText(null);
            ErrorCredenciales vu = new ErrorCredenciales(v, false);
            vu.setVisible(true);
        }
    }
    
    private File crearArchivo(){
         //Fichero de datos
        String ruta = "/home/celia/Documentos/Universidade/Cuarto_2019-2020/Ubicua/Ubicua/ProyectoUbicua/datosusuarios.txt";
        File archivo = new File(ruta);
        if (!archivo.exists()) {
             // El fichero no existe y hay que crearlo
            try {
                // A partir del objeto File creamos el fichero físicamente
                if (archivo.createNewFile()) {
                    System.out.println("El fichero se ha creado correctamente");
                } else {
                    System.out.println("No ha podido ser creado el fichero");
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return archivo;
    }

}
