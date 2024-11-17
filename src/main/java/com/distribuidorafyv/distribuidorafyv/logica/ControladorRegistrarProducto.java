package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.ProductoJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import javax.persistence.PersistenceException;

public class ControladorRegistrarProducto {
    
    private ProductoJpaController prodJpa = new ProductoJpaController();
    
    //Constructor
    public ControladorRegistrarProducto() {       
    }
    

    // Constructor con inyección de dependencias
    public ControladorRegistrarProducto(ProductoJpaController prodJpa) {       
        this.prodJpa = prodJpa;
    }
       
    //Métodos
    public void registrarProducto(String nombre, String stockStr, String precioStr, String proveedorStr) throws Exception {       
        
        //Validación de nombre
        if (nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        
        //Variables para conversión
        int stock;
        double precio; 
        int proveedor;
        
        //Conversión y validación de tipos
        try {
            stock = Integer.parseInt(stockStr);
            precio = Double.parseDouble(precioStr);
            proveedor = Integer.parseInt(proveedorStr);
        } catch (NumberFormatException e) {
            throw new Exception("Los valores numéricos son inválidos");
        }

        //Validaciones de negocio
        if (stock < 0) {
            throw new Exception("El stock no puede ser negativo");
        }
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor a cero");
        }
        
        try {
            Producto prod = new Producto();
            prod.setNombre(nombre);
            prod.setStock(stock);
            prod.setPrecio(precio);
            prod.setProveedor(proveedor);
            prodJpa.create(prod);
            

        } catch (PersistenceException e) {
            System.err.println("Error de persistencia al registrar producto: " + e.getMessage());
            throw new Exception("Error al registrar el producto en la base de datos.", e);
        } catch (Exception e) {
            System.err.println("Error al registrar producto: " + e.getMessage());
            throw e;
        }     
    }
    
    public Proveedor buscarProveedor(String cuitStr) throws IllegalArgumentException {
        try {
            int cuit = Integer.parseInt(cuitStr);
            ControladoraConsultarProveedor controladoraProv = new ControladoraConsultarProveedor();
            Proveedor proveedores = controladoraProv.obtenerProveedorIndividual(cuit);
            if (proveedores == null) {
                throw new IllegalArgumentException("Proveedor no encontrado");
            }
            return proveedores;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Cuit proveedor inválido");
        }
    }
    
  
}