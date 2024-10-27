package com.distribuidorafyv.distribuidorafyv.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    //Atributos
    private int nroPedido;
    private LocalDateTime fecha;
    private double total;
    private int dni;
    private List<DetallePedido> detalles;

    //Constructor
    public Pedido(int nroPedido, double total, int dni) {
        this.nroPedido = nroPedido;
        this.fecha = LocalDateTime.now();
        this.total = total;
        this.dni = dni;
        this.detalles = new ArrayList<>();
    }

    //Métodos
    public void agregarDetalle(DetallePedido detalle) {
        detalles.add(detalle);
    }
    
    //Getters y Setters
    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }
}