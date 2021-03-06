/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author felix
 */
public class EliminarNoti extends javax.swing.JDialog {

    Notificaciones padre;
    
    /**
     * Creates new form ConfirmacionE
     */
    public EliminarNoti(java.awt.Frame parent, boolean modal, String titulo, String descripcion, Notificaciones padre) {
        super(parent, modal);
        initComponents();
        Titulo.setText(titulo);
        Texto.setText(descripcion);
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

        LInfo1 = new javax.swing.JLabel();
        LInfo2 = new javax.swing.JLabel();
        BCancelar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        Titulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LInfo1.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        LInfo1.setText("Esta acción eliminará la siguiente notificación:");
        getContentPane().add(LInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        LInfo2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        LInfo2.setText("¿Estas seguro?");
        getContentPane().add(LInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        BCancelar.setBackground(new java.awt.Color(190, 190, 190));
        BCancelar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        BCancelar.setText("Cancelar");
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 110, -1));

        BEliminar.setBackground(new java.awt.Color(190, 190, 190));
        BEliminar.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 15)); // NOI18N
        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 116, -1));

        Titulo.setEditable(false);
        Titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setBorder(null);
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 30));

        Texto.setEditable(false);
        Texto.setColumns(20);
        Texto.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 12)); // NOI18N
        Texto.setLineWrap(true);
        Texto.setRows(5);
        Texto.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 300, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BCancelarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        this.dispose();
        padre.eliminar();
    }//GEN-LAST:event_BEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JLabel LInfo1;
    private javax.swing.JLabel LInfo2;
    private javax.swing.JTextArea Texto;
    private javax.swing.JTextField Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
