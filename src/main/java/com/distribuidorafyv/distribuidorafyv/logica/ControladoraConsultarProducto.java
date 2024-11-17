
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Producto;
import com.distribuidorafyv.distribuidorafyv.modelo.ProductoJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraConsultarProducto {
    
    private ProductoJpaController prodJpa = new ProductoJpaController();

    public ControladoraConsultarProducto() {
    }

    public ControladoraConsultarProducto(ProductoJpaController prodJpa) {
        this.prodJpa = prodJpa;
    }

    public List<Producto> obtenerProductos() {
        return prodJpa.findAll();
    }   
    
    public Producto obtenerProductoIndividual(int id) {
        return prodJpa.find(id);
    }

    public void eliminarProducto(int idProducto) {
        if (idProducto <= 0) {
            throw new IllegalArgumentException("El ID del producto debe ser un número positivo.");
        }
        try {
            prodJpa.destroy(idProducto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraConsultarProducto.class.getName()).log(Level.SEVERE, "Error al eliminar el producto con ID: " + idProducto, ex);
        }
        
    }
}
