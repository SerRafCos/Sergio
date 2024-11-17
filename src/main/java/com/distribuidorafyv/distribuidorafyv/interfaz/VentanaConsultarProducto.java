
package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladoraConsultarProducto;
import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaConsultarProducto extends javax.swing.JFrame {

    ControladoraConsultarProducto control;
    
    public VentanaConsultarProducto() {
        initComponents();
        this.control = new ControladoraConsultarProducto();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConsultaProductos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnEliminarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblConsultaProductos.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblConsultaProductos.setText("Consulta de Productos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setText("Modificar");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblConsultaProductos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblConsultaProductos)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (tablaProductos.getRowCount() > 0) {
        
            if (tablaProductos.getSelectedRow() != -1) {
            
                int idProducto = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));
                
                control.eliminarProducto(idProducto);
                
                mostrarMensaje("Producto eliminado");
                
                cargarTabla();
                
            } else {
                 mostrarError("No se selecciono ningun registro para eliminar");
            }
            
            
        
        } else {
        
        mostrarError("No existen productos para eliminar");
        
        }
        
        
        
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        if (tablaProductos.getRowCount() > 0) {

            if (tablaProductos.getSelectedRow() != -1) {

                int idProducto = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));

                VentanaModificarProducto modificar = new VentanaModificarProducto(idProducto);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);

                this.dispose();

            } else {
                mostrarError("No se selecciono ningun registro para modificar");
            }

        } else {

            mostrarError("No existen productos para modificar");

        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaProductos;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        
        ControladoraConsultarProducto controladora = new ControladoraConsultarProducto();
        
        //tabla no editable
        DefaultTableModel modeloTabla = new DefaultTableModel()
                {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    
                    }
                };
        
        String titulos[] = {"Id", "Nombre", "Stock", "Precio", "Proveedor"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer productos desde la base
        List <Producto> listaProductos = control.obtenerProductos();
        
        
        if (listaProductos != null) {
             
            for (Producto prod : listaProductos) {
            
                Object[] object = {prod.getIdProducto(), prod.getNombre(),  prod.getStock(), prod.getPrecio(), prod.getProveedor()} ;
                
                modeloTabla.addRow(object);
            
            }
            
        }
        
        tablaProductos.setModel(modeloTabla);
        
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
}
