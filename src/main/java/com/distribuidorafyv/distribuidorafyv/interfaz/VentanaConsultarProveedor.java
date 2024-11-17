
package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladoraConsultarProducto;
import com.distribuidorafyv.distribuidorafyv.logica.ControladoraConsultarProveedor;
import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaConsultarProveedor extends javax.swing.JFrame {
    
    ControladoraConsultarProveedor control;

    public VentanaConsultarProveedor() {
        initComponents();
        this.control = new ControladoraConsultarProveedor();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedor = new javax.swing.JTable();
        btnEliminarProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        lblConsultaProductos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProveedor);

        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        btnModificarProveedor.setText("Modificar");
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
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
                    .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblConsultaProductos.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblConsultaProductos.setText("Consulta de Proveedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblConsultaProductos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblConsultaProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if (tablaProveedor.getRowCount() > 0) {

            if (tablaProveedor.getSelectedRow() != -1) {

                int cuitProveedor = Integer.parseInt(String.valueOf(tablaProveedor.getValueAt(tablaProveedor.getSelectedRow(), 0)));

                control.eliminarProveedor(cuitProveedor);

                mostrarMensaje("Proveedor eliminado");

                cargarTabla();

            } else {
                mostrarError("No se selecciono ningun registro para eliminar");
            }

        } else {

            mostrarError("No existen proveedores para eliminar");

        }

    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
       if (tablaProveedor.getRowCount() > 0) {

            if (tablaProveedor.getSelectedRow() != -1) {

                int cuitProveedor = Integer.parseInt(String.valueOf(tablaProveedor.getValueAt(tablaProveedor.getSelectedRow(), 0)));

                VentanaModificarProveedor modificar = new VentanaModificarProveedor(cuitProveedor);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);

                this.dispose();

            } else {
                mostrarError("No se selecciono ningun registro para modificar");
            }

        } else {

            mostrarError("No existen productos para modificar");

        }
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void cargarTabla() {
        
        
        //tabla no editable
        DefaultTableModel modeloTabla = new DefaultTableModel()
                {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    
                    }
                };
        
        String titulos[] = {"Cuit", "Nombre", "Telefono", "Localidad"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer proveedores desde la base
        List <Proveedor> listaProveedores = control.obtenerProveedor();
        
        
        if (listaProveedores != null) {
             
            for (Proveedor prov : listaProveedores) {
            
                Object[] object = {prov.getCuit(), prov.getNombre(), prov.getTelefono(), prov.getLocalidad()} ;
                
                modeloTabla.addRow(object);
            
            }
            
        }
        
        tablaProveedor.setModel(modeloTabla);
        
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
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaProductos;
    private javax.swing.JTable tablaProveedor;
    // End of variables declaration//GEN-END:variables
}
