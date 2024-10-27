package com.distribuidorafyv.distribuidorafyv.modelo;

public class DetallePedido {
    
    //Atributos
    private Producto producto;
    private int cantidad; 
    private double precioUnitario;
    
    //Constructor
    public DetallePedido(Producto producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    //Métodos
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    //Getters y Setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}