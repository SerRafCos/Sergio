package com.distribuidorafyv.distribuidorafyv.modelo;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proveedor {
    
    @Id
    private int cuit;
    
    private String nombre;
    private int telefono;
    private String localidad;

   
    private static Map<Integer, Proveedor> proveedores = new HashMap<>();
    
    //Datos iniciales

    //Constructor
    public Proveedor() {
       
    }
    
    public Proveedor(int cuit, String nombre, int telefono, String localidad) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.localidad = localidad;
    }
    
    //Métodos
    public static Proveedor buscarPorCuit(int cuit) {
        return proveedores.get(cuit);
    }

    //Getters y Setters
    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static Map<Integer, Proveedor> getProveedores() {
        return proveedores;
    }

    public static void setProveedores(Map<Integer, Proveedor> proveedores) {
        Proveedor.proveedores = proveedores;
    }
    
     public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}