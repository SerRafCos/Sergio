package com.distribuidorafyv.distribuidorafyv.modelo;

import java.util.HashMap;
import java.util.Map;

public class Producto {
    
    //Atributos
    private int idProducto;
    private String nombre;
    private int stock;
    private double precio; 
    private int proveedor;
    private static Map<Integer, Producto> productos = new HashMap<>();
    
    //Datos iniciales
    static {
        new Producto(1, "Manzanas", 2, 100,12);
        new Producto(2, "Naranjas", 1, 150,12);
        new Producto(3, "Plátanos", 1, 200,12);
        new Producto(4, "Peras", 2, 80,12);
        new Producto(5, "Uvas", 3, 90,12);
    }
    
    //Constructores
    public Producto() {
    }

    public Producto(int idProducto, String nombre, int stock, double precio, int proveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.proveedor = proveedor;
        productos.put(idProducto, this);
    }
    
    //Métodos
    public static Producto buscarPorCodigo(int id) {
        return productos.get(id);
    }
    
    //Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }
}