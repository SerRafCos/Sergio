
package com.distribuidorafyv.distribuidorafyv.interfaz;


public class Usuario extends javax.swing.JFrame {


    public Usuario() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevoUsuario = new javax.swing.JButton();
        btnConsultarUsuario = new javax.swing.JButton();
        btnVolverProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("USUARIOS");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio\\Downloads\\frut.png")); // NOI18N

        btnNuevoUsuario.setText("Nuevo");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnConsultarUsuario.setText("Consultar");
        btnConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuarioActionPerformed(evt);
            }
        });

        btnVolverProductos.setText("Volver");
        btnVolverProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolverProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnNuevoUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolverProductos))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        VentanaRegistrarUsuario alta = new VentanaRegistrarUsuario();
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuarioActionPerformed
        VentanaConsultarUsuario consulta = new VentanaConsultarUsuario();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConsultarUsuarioActionPerformed

    private void btnVolverProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverProductosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverProductosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarUsuario;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnVolverProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
