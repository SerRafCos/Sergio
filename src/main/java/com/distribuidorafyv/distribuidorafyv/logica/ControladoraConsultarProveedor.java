/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import com.distribuidorafyv.distribuidorafyv.modelo.ProveedorJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class ControladoraConsultarProveedor {
    
    private ProveedorJpaController provJpa = new ProveedorJpaController();

    public ControladoraConsultarProveedor() {
    }

    public ControladoraConsultarProveedor(ProveedorJpaController prodJpa) {
        this.provJpa = prodJpa;
    }

    public List<Proveedor> obtenerProveedor() {
        return provJpa.findAll();
    }   
    
    public Proveedor obtenerProveedorIndividual(int id) {
        return provJpa.find(id);
    }

    public void eliminarProveedor(int cuitProveedor) {
        try {
            provJpa.destroy(cuitProveedor);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraConsultarProveedor.class.getName()).log(Level.SEVERE, "Error al eliminar el proveedor con CUIT: " + cuitProveedor, ex);
        }
        
    }
}
