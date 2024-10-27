package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;

public class ControladorRegistrarProducto {
    
    //Constructor
    public ControladorRegistrarProducto() {       
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
        
        //Registro del producto
        try {
            Producto prod = new Producto();
            prod.setNombre(nombre);
            prod.setStock(stock);
            prod.setPrecio(precio);
            prod.setProveedor(proveedor);
                                
        } catch (Exception e) {        
            System.err.println("Error al registrar producto: " + e.getMessage());
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