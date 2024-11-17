package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import com.distribuidorafyv.distribuidorafyv.modelo.ProveedorJpaController;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.PersistenceException;

public class ControladorRegistrarProveedor {
    
    //Constructor
    public ControladorRegistrarProveedor() {       
    }
    
    private ProveedorJpaController provJpa = new ProveedorJpaController();

    // Constructor con inyección de dependencias
    public ControladorRegistrarProveedor(ProveedorJpaController prodJpa) {       
        this.provJpa = prodJpa;
    }
       
    //Métodos
    public void registrarProveedor(String nombre, String cuitStr, String telefonoStr, String localidad) throws Exception {       
        
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

        //Validaciones de negocio
        if (cuit < 0) {
            throw new Exception("El CUIT no puede ser negativo");
        }
        
        try {
            Proveedor prov = new Proveedor();
            prov.setCuit(cuit);
            prov.setNombre(nombre);
            prov.setTelefono(cuit);
            prov.setLocalidad(localidad);
            
            provJpa.create(prov);
            } catch (PersistenceException e) {
                System.err.println("Error de persistencia al registrar proveedor: " + e.getMessage());
                throw new Exception("Error al registrar el proveedor en la base de datos.", e);
        } catch (Exception e) {
                System.err.println("Error al registrar proveedor: " + e.getMessage());
                throw e;
        }     
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