/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladorRegistrarPedido;
import com.distribuidorafyv.distribuidorafyv.modelo.DetallePedido;
import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class VentanaRegistrarPedido extends javax.swing.JFrame {

    private ControladorRegistrarPedido gestor;
    private DefaultTableModel modeloTabla;
    private List<DetallePedido> detalles = new ArrayList<>();
    private double totalPedido = 0.0;
    private Producto productoSeleccionado;
     
    
    public VentanaRegistrarPedido() {
        initComponents();
        inicializarTabla();
        gestor = new ControladorRegistrarPedido();
  
        spnCantidad.setEnabled(false);
        btnAñadir.setEnabled(false);
        spnCantidad.setValue(1);
    }
    
    private void inicializarTabla() {
    String[] columnas = {"Producto", "Cantidad", "Precio Unit.", "Subtotal"};
    modeloTabla = new DefaultTableModel(columnas, 0);
    tblDetalles.setModel(modeloTabla);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDNICliente = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDetalles);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jButton1.setText("Quitar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        txtDNICliente.setText("12345678");
        txtDNICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIClienteActionPerformed(evt);
            }
        });

        lblNombreProducto.setText("Producto");

        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Total");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(48, 48, 48)
                        .addComponent(lblTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAñadir)
                            .addComponent(jButton1)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombreProducto)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(txtDNICliente))
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscarProducto)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblTotal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAñadir)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(btnRegistrar)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filaSeleccionada = tblDetalles.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        mostrarError("Debe seleccionar un producto para quitar");
        return;
    }
    
    if (JOptionPane.showConfirmDialog(null, "¿Está seguro de quitar este producto?") == 0) {
    quitarProducto(filaSeleccionada);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            String dniCliente = txtDNICliente.getText().trim();
            gestor.registrarPedido(dniCliente);
            mostrarMensaje("Pedido registrado exitosamente");
            limpiarFormulario();
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
          try {
            int cantidad = (Integer) spnCantidad.getValue();
            DetallePedido detalle = gestor.crearDetallePedido(productoSeleccionado, cantidad);
            agregarDetalleATabla(detalle);
            actualizarTotal(gestor.getTotalPedido());
            limpiarDatosProducto();
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
             try {
            String codigo = txtCodigoProducto.getText().trim();
            productoSeleccionado = gestor.buscarProducto(codigo);
            actualizarVistaProducto();
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
            limpiarDatosProducto();
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtDNIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIClienteActionPerformed

    private void actualizarVistaProducto() {
        if (productoSeleccionado != null) {
            lblNombreProducto.setText("Producto: " + productoSeleccionado.getNombre());
            spnCantidad.setEnabled(true);
            btnAñadir.setEnabled(true);
        }
    }
    
    private void agregarDetalleATabla(DetallePedido detalle) {
        Object[] fila = {
            detalle.getProducto().getNombre(),
            detalle.getCantidad(),
            detalle.getPrecioUnitario(),
            detalle.getCantidad() * detalle.getPrecioUnitario()
        };
        modeloTabla.addRow(fila);
    }
    
     private void actualizarTotal(double total) {
        lblTotal.setText("S/. " + String.format("%.2f", total));
    }
    
    private void limpiarDatosProducto() {
    lblNombreProducto.setText("Nombre: ");
    productoSeleccionado = null;
    spnCantidad.setEnabled(false);
    btnAñadir.setEnabled(false);
}
    
    private void mostrarError(String mensaje) {
    JOptionPane.showMessageDialog(
        this,
        mensaje,
        "Error",
        JOptionPane.ERROR_MESSAGE
    );
}
    
    private void limpiarFormulario() {
    // Limpiar campos de texto
    txtDNICliente.setText("");
    txtCodigoProducto.setText("");
    
    // Resetear producto seleccionado y sus componentes relacionados
    productoSeleccionado = null;
    lblNombreProducto.setText("Nombre: ");
    spnCantidad.setValue(1);
    spnCantidad.setEnabled(false);
    btnAñadir.setEnabled(false);
    
    // Limpiar tabla
    modeloTabla.setRowCount(0);
    
    // Resetear total
    lblTotal.setText("S/. 0.00");
    
    // Dar foco al primer campo
    txtDNICliente.requestFocus();
}
    
    private void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(
        this,
        mensaje,
        "Información",
        JOptionPane.INFORMATION_MESSAGE
    );
}
    
  private void quitarProducto(int fila) {
    try {
        // Quitar del controlador
        gestor.quitarDetalle(fila);
        
        // Quitar de la tabla
        modeloTabla.removeRow(fila);
        
        // Actualizar el total
        actualizarTotal(gestor.getTotalPedido());
        
        // Si no quedan productos, resetear el total
        if (modeloTabla.getRowCount() == 0) {
            lblTotal.setText("S/. 0.00");
        }
        
    } catch (Exception e) {
        mostrarError("Error al quitar el producto: " + e.getMessage());
    }
}  
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblDetalles;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDNICliente;
    // End of variables declaration//GEN-END:variables
}
