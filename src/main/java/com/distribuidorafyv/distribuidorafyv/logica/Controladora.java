/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.logica;

import java.util.HashSet;



public class Controladora {
    
 

    public Controladora() {       
    }
       

    public void opcionRegistrarProducto(String nombre, int stock, double precio, int proveedor) {
        
        try {
            ConsultarProveedor cons = new ConsultarProveedor();
            if (cons.ejecutarCUConsultarProveedor(proveedor)){
                
                Producto prod = new Producto();
            
                prod.setNombre(nombre);
                prod.setStock(stock);
                prod.setPrecio(precio);
                prod.setProveedor(proveedor);
                
                prod.registrarProducto();
            } else {
                 
            }
            
            
        
        } catch {
        
        
        }
         
        
    }
    
    class ConsultarProveedor {
        public boolean ejecutarCUConsultarProveedor(int cuilProveedor) {
        // Aquí se simula que el proveedor existe.
        return true; // Simulación: se asume que siempre se encuentra el proveedor.
        }
    }

    
}
