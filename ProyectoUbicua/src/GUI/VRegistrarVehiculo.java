/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Vehiculo;
import java.util.ArrayList;

/**
 *
 * @author felix
 */
public class VRegistrarVehiculo extends javax.swing.JDialog {

    ArrayList<Vehiculo> lista;
    Vehiculos padre;
    
    /**
     * Creates new form VRegistrarVehiculo
     */
    public VRegistrarVehiculo(java.awt.Frame parent, boolean modal, ArrayList<Vehiculo> lista, Vehiculos padre) {
        super(parent, modal);
        initComponents();
        this.lista = lista;
        LError.setVisible(false);
        this.padre = padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LMatricula = new javax.swing.JLabel();
        LDescripcion = new javax.swing.JLabel();
        TMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TDescripcion = new javax.swing.JTextArea();
        BCancelar = new javax.swing.JButton();
        BRegistrar = new javax.swing.JButton();
        LError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LMatricula.setText("Matricula");

        LDescripcion.setText("Descripcion");

        TMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMatriculaActionPerformed(evt);
            }
        });

        TDescripcion.setColumns(20);
        TDescripcion.setRows(5);
        jScrollPane1.setViewportView(TDescripcion);

        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });

        BRegistrar.setText("Registrar");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });

        LError.setForeground(new java.awt.Color(255, 0, 0));
        LError.setText("Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LDescripcion)
                            .addComponent(LMatricula))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TMatricula)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(BCancelar)
                        .addGap(86, 86, 86)
                        .addComponent(BRegistrar)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(LError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LMatricula)
                    .addComponent(TMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDescripcion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCancelar)
                    .addComponent(BRegistrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TMatriculaActionPerformed

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        boolean existe = false;
        
        for (int i = 0; i < lista.size(); i++) {
            if (TMatricula.getText().equals(lista.get(i).getMatricula())) {
                existe = true;
                break;
            }
        }
        
        if (existe) {
            LError.setText("El vehiculo introducido ya esta registrado");
            LError.setVisible(true);
        } else if (TMatricula.getText() == null && TDescripcion.getText() == null) {
            LError.setText("Introduzca los datos requeridos");
            LError.setVisible(true);
        }else if (TMatricula.getText() == null) {
            LError.setText("Introduzca una matricula");
            LError.setVisible(true);
        } else if (TDescripcion.getText() == null) {
            LError.setText("Introduzca una descripcion");
            LError.setVisible(true);
        } else {
            this.dispose();
            padre.registrar(TMatricula.getText(), TDescripcion.getText());
        }
    }//GEN-LAST:event_BRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JLabel LDescripcion;
    private javax.swing.JLabel LError;
    private javax.swing.JLabel LMatricula;
    private javax.swing.JTextArea TDescripcion;
    private javax.swing.JTextField TMatricula;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}