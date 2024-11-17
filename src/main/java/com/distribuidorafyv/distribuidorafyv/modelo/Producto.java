package com.distribuidorafyv.distribuidorafyv.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto  {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String nombre;
    private int stock;
    private double precio; 
    private int proveedor;

    
    
    //Constructores
    public Producto() {
    }

    public Producto(int id, String nombre, int stock, double precio, int proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.proveedor = proveedor;       
    }
    

    
    //Getters y Setters
    public int getIdProducto() {
        return id;
    }

    public void setIdProducto(int idProducto) {
        this.id = idProducto;
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