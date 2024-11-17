/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import com.distribuidorafyv.distribuidorafyv.modelo.ProveedorJpaController;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;




public class ControladoraModificarProveedor {
    
    private ProveedorJpaController provJpa = new ProveedorJpaController();

    public ControladoraModificarProveedor(ProveedorJpaController prodJpa) {
        this.provJpa = provJpa;
    }
    
    public ControladoraModificarProveedor() {
    }
    
    public void modificarProveedor(Proveedor prov, String nombre, String cuitStr, String telefonoStr, String localidad) throws Exception {       
        
        //Validación de nombre
        if (nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        
        //Variables para conversión
        int cuit;
        int telefono;
        
        //Conversión y validación de tipos
        try {
            cuit = Integer.parseInt(cuitStr);
            telefono = Integer.parseInt(telefonoStr);
        } catch (NumberFormatException e) {
            throw new Exception("Los valores numéricos son inválidos");
        }

        
        //Modificacion del proveedor
        try {
           
            prov.setNombre(nombre);
            prov.setCuit(cuit);
            prov.setTelefono(telefono);
            prov.setLocalidad(localidad);
            
            
            provJpa.edit(prov);
                                
        } catch (PersistenceException e) {
            Logger.getLogger(ControladoraModificarProducto.class.getName()).log(Level.SEVERE, "Error de persistencia al modificar proveedor: " + e.getMessage(), e);
            throw new Exception("Error al modificar el proveedor en la base de datos.");
        } catch (Exception e) {        
            Logger.getLogger(ControladoraModificarProducto.class.getName()).log(Level.SEVERE, "Error al modificar proveedor: " + e.getMessage(), e);
            throw e;
        }       
    }
    
    public Proveedor obtenerProveedor(int cuitProveedor) {
        return provJpa.find(cuitProveedor);
    } 
    
    public Proveedor buscarProveedor(String cuit) throws IllegalArgumentException {
        try {
            int cuitProveedor = Integer.parseInt(cuit);
            Proveedor proveedores = Proveedor.buscarPorCuit(cuitProveedor);
            if (proveedores == null) {
                throw new IllegalArgumentException("Proveedor no encontrado");
            }
            return proveedores;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Cuit proveedor inválido");
        }
    }
            
}
