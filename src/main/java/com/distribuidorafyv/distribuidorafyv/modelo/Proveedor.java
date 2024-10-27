package com.distribuidorafyv.distribuidorafyv.modelo;

import java.util.HashMap;
import java.util.Map;

public class Proveedor {
    
    //Atributos
    private int cuit;
    private String nombre;
    private int telefono;
    private static Map<Integer, Proveedor> proveedores = new HashMap<>();
    
    //Datos iniciales
    static {
        new Proveedor(12345678, "Juan Pérez", 5551234);
        new Proveedor(87654321, "María López",5555678);
        new Proveedor(45678912, "Carlos Rodríguez",559012);
    }
    
    //Constructor
    public Proveedor(int cuit, String nombre, int telefono) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.telefono = telefono;
        proveedores.put(cuit, this);
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
}