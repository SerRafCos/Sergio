/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.ProductoJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.Proveedor;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;




public class ControladoraModificarProducto {
    
    private ProductoJpaController prodJpa = new ProductoJpaController();
    


    public ControladoraModificarProducto(ProductoJpaController prodJpa) {
        this.prodJpa = prodJpa;

    }
    
    public ControladoraModificarProducto() {
    }
    
    public void modificarProducto(Producto prod, String nombre, String stockStr, String precioStr, String proveedorStr) throws Exception {       
        
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
            prod.setNombre(nombre);
            prod.setStock(stock);
            prod.setPrecio(precio);
            prod.setProveedor(proveedor);
            
            prodJpa.edit(prod);
                                
        }  catch (PersistenceException e) {
            Logger.getLogger(ControladoraModificarProducto.class.getName()).log(Level.SEVERE, "Error de persistencia al modificar producto: " + e.getMessage(), e);
            throw new Exception("Error al modificar el producto en la base de datos.");
        } catch (Exception e) {        
            Logger.getLogger(ControladoraModificarProducto.class.getName()).log(Level.SEVERE, "Error al modificar producto: " + e.getMessage(), e);
            throw e;
        }   
    }
    
    public Producto obtenerProductos(int idProducto) {
        return prodJpa.find(idProducto);
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
