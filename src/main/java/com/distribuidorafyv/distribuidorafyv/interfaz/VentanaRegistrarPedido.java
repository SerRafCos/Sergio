package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladorRegistrarPedido;
import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
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
    private Cliente clienteSeleccionado;
     
    
    public VentanaRegistrarPedido() {
        initComponents();
        inicializarTabla();
        gestor = new ControladorRegistrarPedido();
  
        txtCodigoProducto.setEnabled(false);
        btnBuscarProducto.setEnabled(false);
        spnCantidad.setEnabled(false);
        btnAñadir.setEnabled(false);
        btnQuitar.setEnabled(false);
        spnCantidad.setValue(1);
        verificarEstadoBotones();
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
        btnQuitar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        lblDNI = new javax.swing.JLabel();
        txtDNICliente = new javax.swing.JTextField();
        lblNombreProducto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        txtCodigoProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        lblDNI.setText("DNI");

        txtDNICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIClienteActionPerformed(evt);
            }
        });

        lblNombreProducto.setText("Producto");

        jLabel3.setText("Cantidad");

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

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreProducto)
                    .addComponent(lblDNI)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txtDNICliente))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarProducto)
                    .addComponent(btnBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDNI)
                    .addComponent(txtDNICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreProducto)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
      int filaSeleccionada = tblDetalles.getSelectedRow();
    
    if (filaSeleccionada == -1) {
        mostrarError("Debe seleccionar un producto para quitar");
        return;
    } else {
    // Quitar de la lista en memoria
        detalles.remove(filaSeleccionada);
        
        // Quitar de la tabla
        modeloTabla.removeRow(filaSeleccionada);
        
        verificarEstadoBotones();
        
        // Si no quedan productos, resetear el total
        if (modeloTabla.getRowCount() == 0) {
            lblTotal.setText("S/. 0.00");
        }
    }
    
    actualizarTotalInterfaz();
           
    
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (modeloTabla.getRowCount() == 0) {
        mostrarError("No hay productos ingresados.");
        return; 
        }  
        
        try {
        String dniCliente = txtDNICliente.getText().trim();
        if (!validarDNI(dniCliente)) {
            throw new IllegalArgumentException("El DNI del cliente no es válido.");
        }
        
        // Registrar el pedido en la base de datos
        gestor.registrarPedido(dniCliente, detalles); // Asegúrate de que este método acepte la lista de detalles
        
        mostrarMensaje("Pedido registrado exitosamente");
        limpiarFormulario();
        verificarEstadoBotones();
    } catch (IllegalArgumentException e) {
        mostrarError(e.getMessage());
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
         try {
        int cantidad = (Integer) spnCantidad.getValue();
        
        if (cantidad > productoSeleccionado.getStock()) {
            mostrarError("La cantidad solicitada excede el stock disponible para el producto: " + productoSeleccionado.getNombre());
            return; 
        }
        
        DetallePedido detalle = gestor.crearDetallePedido(productoSeleccionado, cantidad);
        
        // Agregar el detalle a la lista en memoria
        detalles.add(detalle);

        // Verificar si el producto ya está en la tabla
        int filaExistente = buscarProductoEnTabla(detalle.getProducto().getNombre());
        if (filaExistente != -1) {
            // Actualizar la cantidad y el subtotal
            int cantidadActual = (Integer) modeloTabla.getValueAt(filaExistente, 1);
            double precioUnitario = detalle.getPrecioUnitario();
            cantidadActual += cantidad; // Sumar la nueva cantidad
            modeloTabla.setValueAt(cantidadActual, filaExistente, 1);
            modeloTabla.setValueAt(cantidadActual * precioUnitario, filaExistente, 3); // Actualizar subtotal
            
        } else {
            // Agregar nuevo detalle a la tabla
            agregarDetalleATabla(detalle);
        }

        // Actualizar el total en la interfaz
        actualizarTotalInterfaz();
        verificarEstadoBotones();
        limpiarDatosProducto();
    } catch (IllegalArgumentException e) {
        mostrarError(e.getMessage());
    }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void actualizarTotalInterfaz() {
    double total = 0.0;
    for (DetallePedido detalle : detalles) {
        total += detalle.getCantidad() * detalle.getPrecioUnitario();
    }
    lblTotal.setText("S/. " + String.format("%.2f", total));
}
    
    private boolean validarDNI(String dni) {
    if (dni.length() != 8) {
        return false;
    }
    try {
        Integer.parseInt(dni);
    } catch (NumberFormatException e) {
        return false;
    }
    return true;
}
    
private int buscarProductoEnTabla(String nombreProducto) {
    for (int i = 0; i < modeloTabla.getRowCount(); i++) {
        if (modeloTabla.getValueAt(i, 0).equals(nombreProducto)) {
            return i; // 
        }
    }
    return -1;
}
    
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

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            String dni = txtDNICliente.getText().trim();
            clienteSeleccionado = gestor.buscarCliente(dni);
            actualizarVistaCliente();
        } catch (IllegalArgumentException e) {
            mostrarError(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void actualizarVistaProducto() {
        if (productoSeleccionado != null) {
            lblNombreProducto.setText("Producto: " + productoSeleccionado.getNombre());
            spnCantidad.setEnabled(true);
            btnAñadir.setEnabled(true);
        }
    }
    
     private void actualizarVistaCliente() {
        if (clienteSeleccionado != null) {
            txtDNICliente.setEnabled(false);
            lblDNI.setText("Cliente: " + clienteSeleccionado.getNombre());
            btnBuscarProducto.setEnabled(true);
            txtCodigoProducto.setEnabled(true);
            spnCantidad.setEnabled(true);
         
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
    lblNombreProducto.setText("Producto: ");
    txtCodigoProducto.setText("");
    productoSeleccionado = null;
    spnCantidad.setEnabled(false);
    btnAñadir.setEnabled(false);
    btnBuscarCliente.setEnabled(false);
    spnCantidad.setValue(1);
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
    txtDNICliente.setEnabled(true);
    lblDNI.setText("DNI");
    btnBuscarCliente.setEnabled(true);
}
    
    private void mostrarMensaje(String mensaje) {
    JOptionPane.showMessageDialog(
        this,
        mensaje,
        "Información",
        JOptionPane.INFORMATION_MESSAGE
    );
}
    
  
private void verificarEstadoBotones() {
    // Deshabilitar los botones si no hay items en la tabla
    boolean hayItems = modeloTabla.getRowCount() > 0;
    btnQuitar.setEnabled(hayItems); // Habilitar si hay items
    btnRegistrar.setEnabled(hayItems); // Habilitar si hay items
}
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblDetalles;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDNICliente;
    // End of variables declaration//GEN-END:variables
}
