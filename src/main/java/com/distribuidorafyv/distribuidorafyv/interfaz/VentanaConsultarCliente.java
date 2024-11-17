
package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladoraConsultarCliente;
import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaConsultarCliente extends javax.swing.JFrame {

     ControladoraConsultarCliente control;
       
    public VentanaConsultarCliente() {
        initComponents();
        this.control = new ControladoraConsultarCliente();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnEliminarCliente = new javax.swing.JButton();
        btnModificarCliente = new javax.swing.JButton();
        lblConsultaProductos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnModificarCliente.setText("Modificar");
        btnModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClienteActionPerformed(evt);
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
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblConsultaProductos.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblConsultaProductos.setText("Consulta de Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblConsultaProductos)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblConsultaProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (tablaCliente.getRowCount() > 0) {

            if (tablaCliente.getSelectedRow() != -1) {

                int dni = Integer.parseInt(String.valueOf(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0)));

                control.eliminarLogicamenteCliente(dni);

                mostrarMensaje("Proveedor eliminado");

                cargarTabla();

            } else {
                mostrarError("No se selecciono ningun registro para eliminar");
            }

        } else {

            mostrarError("No existen proveedores para eliminar");

        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClienteActionPerformed
        if (tablaCliente.getRowCount() > 0) {

            if (tablaCliente.getSelectedRow() != -1) {

                int dni = Integer.parseInt(String.valueOf(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0)));

                VentanaModificarCliente modificar = new VentanaModificarCliente(dni);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);

                this.dispose();

            } else {
                mostrarError("No se selecciono ningun cliente para modificar");
            }

        } else {

            mostrarError("No existen clientes para modificar");

        }
    }//GEN-LAST:event_btnModificarClienteActionPerformed

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
        
        String titulos[] = {"DNI", "Nombre", "Telefono", "Email", "Localidad", "Activo"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer proveedores desde la base
        List <Cliente> listaClientes = control.obtenerCliente();
        
        
        if (listaClientes != null) {
             
            for (Cliente cli : listaClientes) {
            
                Object[] object = {cli.getDni(), cli.getNombre(), cli.getTelefono(), cli.getEmail(), cli.getLocalidad(), cli.getActivo()} ;
                
                modeloTabla.addRow(object);
            
            }
            
        }
        
        tablaCliente.setModel(modeloTabla);
        
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
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnModificarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConsultaProductos;
    private javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
}
