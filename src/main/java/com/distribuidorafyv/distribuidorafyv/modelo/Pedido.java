package com.distribuidorafyv.distribuidorafyv.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int nroPedido;
    
    private LocalDateTime fecha;
    private double total;
    private int dni;
    private int activo;
        

   @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL) // Relación con DetallePedido
   private List<DetallePedido> detalles = new ArrayList<>();

   public Pedido() {
       this.activo = 1;
    }
   
    // Constructor
    public Pedido(int nroPedido, double total, int dni) {
        this.nroPedido = nroPedido;
        this.fecha = LocalDateTime.now();
        this.total = total;
        this.dni = dni;
        this.activo = 1;
    }

    // Métodos
    public void agregarDetalle(DetallePedido detalle) {
        detalle.setPedido(this); // Establecer la relación inversa
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

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
    
    
}