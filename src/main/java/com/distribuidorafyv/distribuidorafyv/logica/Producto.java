package com.distribuidorafyv.distribuidorafyv.logica;

public class Producto {
    
    private int idProducto;
    private String nombre;
    private int stock;
    private double precio; 
    private int proveedor;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int stock, double precio, int proveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.proveedor = proveedor;
    }
    
    public void registrarProducto(){
        System.out.println("Producto registrado: " + nombre + ", Stock: " + stock + ", Precio: " + precio + ", Proveedor CUIL: " + proveedor);  
    }
    
    
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
