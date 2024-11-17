/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.interfaz;

import com.distribuidorafyv.distribuidorafyv.logica.ControladoraConsultarPedido;
import com.distribuidorafyv.distribuidorafyv.modelo.DetallePedido;
import com.distribuidorafyv.distribuidorafyv.modelo.Pedido;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio
 */
public class VentanaDetallePedido extends javax.swing.JFrame {

    ControladoraConsultarPedido controladora;
    
    private int idPedido;
    
    public VentanaDetallePedido(int idPedido) {
        initComponents();
        this.controladora = new ControladoraConsultarPedido();
        this.idPedido = idPedido;
        lblDetallePedido.setText("Detalle Pedido N°" + idPedido);

    }

 
    
    private void cargarTabla() {
       
        
        //tabla no editable
        DefaultTableModel modeloTabla = new DefaultTableModel()
                {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    
                    }
                };
        
        String titulos[] = {"Producto", "Precio", "Cantidad"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer productos desde la base
        List <DetallePedido> listaDetalle = controladora.obtenerDetallePedido(idPedido);
        
        
        if (listaDetalle != null) {
             
            for (DetallePedido detalle : listaDetalle) {
            
                Object[] object = {detalle.getProducto().getNombre(), detalle.getPrecioUnitario(), detalle.getCantidad()} ;
                
                modeloTabla.addRow(object);
            
            }
            
        }
        
        tablaDetallePedido.setModel(modeloTabla);
        
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDetallePedido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetallePedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        lblDetallePedido.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblDetallePedido.setText("Detalle Pedido");

        tablaDetallePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDetallePedido);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblDetallePedido))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblDetallePedido)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         cargarTabla();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDetallePedido;
    private javax.swing.JTable tablaDetallePedido;
    // End of variables declaration//GEN-END:variables
}
