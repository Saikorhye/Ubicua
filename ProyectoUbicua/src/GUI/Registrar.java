/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.GuardaDatos;
import Clases.Usuario;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author evinha
 */
public class Registrar extends javax.swing.JPanel {

    /**
     * Creates new form Registrar
     */
    
    private VInicial v;
    ArrayList<Usuario> usus;
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    public Registrar(ArrayList<Usuario> usuarios) {
        initComponents();
        this.usus=usuarios;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jNombre = new javax.swing.JTextField();
        jCorreo = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jContrasena = new javax.swing.JPasswordField();
        jComboBoxPago = new javax.swing.JComboBox<>();
        jCheckBoxTerminos = new javax.swing.JCheckBox();
        jButtonRegistrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(350, 500));
        setMinimumSize(new java.awt.Dimension(350, 500));
        setPreferredSize(new java.awt.Dimension(350, 500));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre Completo");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Correo electrónico");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Teléfono");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contraseña");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Seleccione método de pago");

        jNombre.setBackground(new java.awt.Color(216, 216, 216));
        jNombre.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N

        jCorreo.setBackground(new java.awt.Color(216, 216, 216));
        jCorreo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N

        jTelefono.setBackground(new java.awt.Color(216, 216, 216));
        jTelefono.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N

        jContrasena.setBackground(new java.awt.Color(216, 216, 216));
        jContrasena.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N

        jComboBoxPago.setBackground(new java.awt.Color(216, 216, 216));
        jComboBoxPago.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jComboBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de crédito", "Paypal", "Bizum" }));

        jCheckBoxTerminos.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxTerminos.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 8)); // NOI18N
        jCheckBoxTerminos.setText("* He leído y acepto los términos y condiciones de uso");
        jCheckBoxTerminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxTerminosActionPerformed(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(68, 217, 230));
        jButtonRegistrar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButtonRegistrar.setText("Registrarse");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(68, 217, 230));
        jPanel1.setForeground(new java.awt.Color(68, 217, 230));

        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechaAzulPe.png"))); // NOI18N
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(68, 217, 230));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxTerminos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxTerminos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxTerminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxTerminosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxTerminosActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        if(jNombre.getText().equals("") || jCorreo.getText().equals("") || jContrasena.getPassword().equals("") || jTelefono.getText().equals("")){
            FaltanDatos vu=new FaltanDatos(v, false);
            vu.setVisible(true);
        }
        else{
            if(jCheckBoxTerminos.isSelected()){
            Usuario us = new Usuario(jNombre.getText(), jCorreo.getText(), new String(jContrasena.getPassword()), jComboBoxPago.getSelectedItem().toString(), jTelefono.getText());
            System.out.println("Metodo pago: "+jComboBoxPago.getSelectedItem().toString()+"\n");
            this.usus.add(us);
            
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
                    
            this.v.getContentPane().setVisible(false);
            VPrincipal vp = new VPrincipal(us);
            vp.setVisible(true);
            vp.setV(this.v);
            this.v.setContentPane(vp);
            vp.setFondoMapaPrincipal();
            }
            else{
                ErrorCheck vu=new ErrorCheck(v, false);
                vu.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        IniciarSesion vp = new IniciarSesion(this.usus);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
    }//GEN-LAST:event_jButtonAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JCheckBox jCheckBoxTerminos;
    private javax.swing.JComboBox<String> jComboBoxPago;
    private javax.swing.JPasswordField jContrasena;
    private javax.swing.JTextField jCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
}
