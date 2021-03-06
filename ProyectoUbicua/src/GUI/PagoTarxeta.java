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
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author evinha
 */
public class PagoTarxeta extends javax.swing.JPanel {

    /**
     * Creates new form PagoTarxeta
     */
    
    private VInicial v;
    private ArrayList<Usuario> usus;
    private Usuario us;
    private ArrayList<Plaza> plazas;
    
    public VInicial getV() {
        return v;
    }

    public void setV(VInicial v) {
        this.v = v;
    }
    
    
    public PagoTarxeta(ArrayList<Usuario> usuarios, Usuario usua, ArrayList<Plaza> plaz) {
        initComponents();
        this.usus=usuarios;
        this.us=usua;
        this.plazas=plaz;
        this.RadioButtonSelecR();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jPanelTarjeta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextCad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextTitular = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelPaypal = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jTextCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 217, 230));

        jPanel3.setBackground(new java.awt.Color(68, 217, 230));

        jLabel1.setBackground(new java.awt.Color(68, 217, 230));
        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de pago");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(null);

        jPanelTarjeta.setBackground(new java.awt.Color(235, 235, 235));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel2.setText("Número tarjeta");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("*");

        jTextNumero.setBackground(new java.awt.Color(216, 216, 216));
        jTextNumero.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jTextNumero.setBorder(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel3.setText("Caducidad");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*");

        jTextCad.setBackground(new java.awt.Color(216, 216, 216));
        jTextCad.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jTextCad.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel4.setText("Código de seguridad ");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        jTextCodigo.setBackground(new java.awt.Color(216, 216, 216));
        jTextCodigo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jTextCodigo.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel5.setText("Titular de la tarjeta");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jTextTitular.setBackground(new java.awt.Color(216, 216, 216));
        jTextTitular.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jTextTitular.setBorder(null);

        jButton1.setBackground(new java.awt.Color(68, 217, 230));
        jButton1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 15)); // NOI18N
        jLabel10.setText("Tarjeta de crédito");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTarjetaLayout = new javax.swing.GroupLayout(jPanelTarjeta);
        jPanelTarjeta.setLayout(jPanelTarjetaLayout);
        jPanelTarjetaLayout.setHorizontalGroup(
            jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9))
                        .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6))
                                .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7))
                                .addComponent(jTextCad))
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1))
        );
        jPanelTarjetaLayout.setVerticalGroup(
            jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTarjetaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Bitstream Vera Sans", 1, 15)); // NOI18N
        jLabel11.setText("Paypal");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel12.setText("Correo electrónico");

        jTextCorreo.setBackground(new java.awt.Color(216, 216, 216));
        jTextCorreo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        jLabel13.setText("Contraseña");

        jPassword.setBackground(new java.awt.Color(216, 216, 216));
        jPassword.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N

        jButton2.setBackground(new java.awt.Color(68, 217, 230));
        jButton2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        jButton2.setText("Iniciar sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPaypalLayout = new javax.swing.GroupLayout(jPanelPaypal);
        jPanelPaypal.setLayout(jPanelPaypalLayout);
        jPanelPaypalLayout.setHorizontalGroup(
            jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaypalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(96, 96, 96)
                .addComponent(jRadioButton2))
            .addGroup(jPanelPaypalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPaypalLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addGroup(jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addGroup(jPanelPaypalLayout.createSequentialGroup()
                            .addGroup(jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        jPanelPaypalLayout.setVerticalGroup(
            jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaypalLayout.createSequentialGroup()
                .addComponent(jRadioButton2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelPaypalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(10, 10, 10))
            .addGroup(jPanelPaypalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPaypalLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel13)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPaypal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelPaypal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Tarxeta tar = new Tarxeta(jTextNumero.getText(), jTextCad.getText(), jTextCodigo.getText(), jTextTitular.getText());
        this.us.addTarxeta(tar);
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
        VPrincipal vp = new VPrincipal(us, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
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
        VPrincipal vp = new VPrincipal(us, this.plazas);
        vp.setVisible(true);
        vp.setV(this.v);
        this.v.setContentPane(vp);
        vp.setFondoMapaPrincipal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jPanelPaypal.setBackground(Color.gray);
            jTextCorreo.setEditable(false);
            jPassword.setEnabled(false);
            //jButtonBuscarLibre.setBackground(Color.LIGHT_GRAY);
            jButton2.setEnabled(false);
            
            jPanelTarjeta.setBackground(Color.decode("#E6E6E6"));
            jTextNumero.setEditable(true);
            jTextCad.setEditable(true);
            jTextCodigo.setEditable(true);
            jTextTitular.setEnabled(true);
            jButton1.setBackground(Color.decode("#44d9e6"));
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            jPanelTarjeta.setBackground(Color.gray);
            jTextNumero.setEditable(false);
            jTextCad.setEditable(false);
            jTextCodigo.setEditable(false);
            jTextTitular.setEnabled(false);
            //jButtonBuscarLibre.setBackground(Color.LIGHT_GRAY);
            jButton1.setEnabled(false);
            
            jPanelPaypal.setBackground(Color.decode("#E6E6E6"));
            jTextCorreo.setEditable(true);
            jPassword.setEnabled(true);
            jButton2.setBackground(Color.decode("#44d9e6"));
            jButton2.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPaypal;
    private javax.swing.JPanel jPanelTarjeta;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCad;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextCorreo;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextTitular;
    // End of variables declaration//GEN-END:variables

     public void RadioButtonSelecR(){
        if(this.us.getMetodoPago().equals("Tarjeta de crédito")){
            jRadioButton1.setSelected(true);
        }
        else{
            jRadioButton2.setSelected(true);
        }
        if(jRadioButton1.isSelected()){
            jPanelPaypal.setBackground(Color.gray);
            jTextCorreo.setEditable(false);
            jPassword.setEnabled(false);
            //jButtonBuscarLibre.setBackground(Color.LIGHT_GRAY);
            jButton2.setEnabled(false);
            
            jPanelTarjeta.setBackground(Color.decode("#E6E6E6"));
            jTextNumero.setEditable(true);
            jTextCad.setEditable(true);
            jTextCodigo.setEditable(true);
            jTextTitular.setEnabled(true);
            jButton1.setBackground(Color.decode("#44d9e6"));
            jButton1.setEnabled(true);
        }
        else{
            jPanelTarjeta.setBackground(Color.gray);
            jTextNumero.setEditable(false);
            jTextCad.setEditable(false);
            jTextCodigo.setEditable(false);
            jTextTitular.setEnabled(false);
            //jButtonBuscarLibre.setBackground(Color.LIGHT_GRAY);
            jButton1.setEnabled(false);
            
            jPanelPaypal.setBackground(Color.decode("#E6E6E6"));
            jTextCorreo.setEditable(true);
            jPassword.setEnabled(true);
            jButton2.setBackground(Color.decode("#44d9e6"));
            jButton2.setEnabled(true);
        }
    }
}
