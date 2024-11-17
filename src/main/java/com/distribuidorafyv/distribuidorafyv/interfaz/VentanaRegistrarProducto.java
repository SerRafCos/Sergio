
package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladorRegistrarProducto;
import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import javax.swing.JOptionPane;



public class VentanaRegistrarProducto extends javax.swing.JFrame {
    
    ControladorRegistrarProducto control;
    private Proveedor proveedorSeleccionado;

    public VentanaRegistrarProducto() {
        initComponents();
       this.control = new ControladorRegistrarProducto();
        txtNombreProducto.setEnabled(false);
        txtStock.setEnabled(false);
        txtPrecio.setEnabled(false);
        opcionRegistrarProducto.setEnabled(false);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblProveedor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        opcionRegistrarProducto = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblProveedor.setText("Proveedor");

        jLabel2.setText("Nombre");

        jLabel3.setText("Stock");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setText("NUEVO PRODUCTO");

        jLabel5.setText("Precio");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        opcionRegistrarProducto.setText("Registrar Producto");
        opcionRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionRegistrarProductoActionPerformed(evt);
            }
        });

        btnBuscarProveedor.setText("Buscar");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sergio\\Downloads\\frut.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblProveedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarProveedor))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(33, 33, 33)
                        .addComponent(opcionRegistrarProducto)
                        .addGap(27, 27, 27)))
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProveedor)
                            .addComponent(btnBuscarProveedor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcionRegistrarProducto)
                            .addComponent(btnLimpiar)))
                    .addComponent(jLabel6))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionRegistrarProductoActionPerformed
         
    try {
        String nombre = txtNombreProducto.getText();
        String stockStr = txtStock.getText();
        String precioStr = txtPrecio.getText(); 
        String proveedorStr = txtProveedor.getText();    
    
        control.registrarProducto(nombre, stockStr, precioStr, proveedorStr);
        mostrarMensaje("Producto registrado con éxito");
        limpiarCampos();
        
    } catch (Exception e) {
        mostrarMensaje("Error al registrar el producto: " + e.getMessage());
    }
    }//GEN-LAST:event_opcionRegistrarProductoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        try {
        String codigo = txtProveedor.getText().trim();
        if(codigo.isEmpty()) {
            mostrarError("Debe ingresar un código de proveedor");
            return;
        }
        
        proveedorSeleccionado = control.buscarProveedor(codigo);
        actualizarVistaProveedor();
    } catch (IllegalArgumentException e) {
        mostrarError(e.getMessage());
        limpiarCampos();
    }
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void actualizarVistaProveedor() {
    if (proveedorSeleccionado != null) {
        // Habilitar campos
        txtNombreProducto.setEnabled(true);
        txtStock.setEnabled(true);
        txtPrecio.setEnabled(true);
        opcionRegistrarProducto.setEnabled(true);
        
        // Actualizar label con el nombre del proveedor
        lblProveedor.setText("Proveedor: " + proveedorSeleccionado.getNombre());
    }
}
    
   public void limpiarCampos() {
        lblProveedor.setText("Proveedor");
        txtProveedor.setText("");
        txtNombreProducto.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
    }

    private void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(
        this,
        mensaje,
        "Información",
        JOptionPane.INFORMATION_MESSAGE
    );
}
    private void mostrarError(String mensaje) {
    JOptionPane.showMessageDialog(
        this,
        mensaje,
        "Error",
        JOptionPane.ERROR_MESSAGE
    );
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JButton opcionRegistrarProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
