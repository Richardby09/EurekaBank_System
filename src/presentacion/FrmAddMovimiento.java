
package presentacion;

import javax.swing.JOptionPane;
import logica.MovimientoBL;

/**
 *
 * @author R000R
 */
public class FrmAddMovimiento extends javax.swing.JFrame {

    /**
     * Creates new form FrmAddMovimiento
     */
    public FrmAddMovimiento() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDireccionM = new javax.swing.JLabel();
        txtEstadoM = new javax.swing.JTextField();
        lblCodigoM = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        lblNombreM = new javax.swing.JLabel();
        txtDescripcionM = new javax.swing.JTextField();
        lblCiudadM = new javax.swing.JLabel();
        txtAccionM = new javax.swing.JTextField();
        btnNuevoM = new javax.swing.JButton();
        btnRegistrarM = new javax.swing.JButton();
        btnSalirM = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblDireccionM.setText("Estado:");

        txtEstadoM.setEnabled(false);

        lblCodigoM.setText("Código:");

        txtCodigoM.setEnabled(false);

        lblNombreM.setText("Descripcion:");

        txtDescripcionM.setEnabled(false);

        lblCiudadM.setText("Accion:");

        txtAccionM.setEnabled(false);

        btnNuevoM.setMnemonic('N');
        btnNuevoM.setText("Nuevo");
        btnNuevoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoMActionPerformed(evt);
            }
        });

        btnRegistrarM.setMnemonic('R');
        btnRegistrarM.setText("Registrar");
        btnRegistrarM.setEnabled(false);
        btnRegistrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMActionPerformed(evt);
            }
        });

        btnSalirM.setMnemonic('S');
        btnSalirM.setText("Salir");
        btnSalirM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDireccionM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCiudadM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionM)
                    .addComponent(txtAccionM, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstadoM, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSalirM, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDescripcionM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCiudadM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAccionM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDireccionM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEstadoM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoMActionPerformed
        limpiarTextos();
        activar(true);
        txtCodigoM.requestFocus();
    }//GEN-LAST:event_btnNuevoMActionPerformed

    
     private void activar(boolean estado) {
        txtCodigoM.setEnabled(estado);
        txtDescripcionM.setEnabled(estado);
        txtAccionM.setEnabled(estado);
        txtEstadoM.setEnabled(estado);    
        btnNuevoM.setEnabled(!estado);
        btnRegistrarM.setEnabled(estado);
    }
    private void limpiarTextos(){
        txtCodigoM.setText(null);
        txtDescripcionM.setText(null);
        txtAccionM.setText(null);
        txtEstadoM.setText(null);
      
    }
    
    
    
    
    private void btnRegistrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMActionPerformed
        codigo = txtCodigoM.getText();
        descripcion = txtDescripcionM.getText();
        accion = txtAccionM.getText();
        estado = txtEstadoM.getText();
        mensaje = MovimientoBL.insertarMovimiento(codigo, descripcion, accion, estado);
        if(mensaje.compareTo("Registro insertado")==0)
        JOptionPane.showMessageDialog(this, mensaje, "Resultado", 1);
        else JOptionPane.showMessageDialog(this, mensaje, "Error", 0);
        limpiarTextos();
        activar(false);
        btnNuevoM.requestFocus();
    }//GEN-LAST:event_btnRegistrarMActionPerformed

    private void btnSalirMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirMActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirMActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddMovimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoM;
    private javax.swing.JButton btnRegistrarM;
    private javax.swing.JButton btnSalirM;
    private javax.swing.JLabel lblCiudadM;
    private javax.swing.JLabel lblCodigoM;
    private javax.swing.JLabel lblDireccionM;
    private javax.swing.JLabel lblNombreM;
    private javax.swing.JTextField txtAccionM;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtDescripcionM;
    private javax.swing.JTextField txtEstadoM;
    // End of variables declaration//GEN-END:variables

    String codigo,descripcion,accion,estado,mensaje;

}
