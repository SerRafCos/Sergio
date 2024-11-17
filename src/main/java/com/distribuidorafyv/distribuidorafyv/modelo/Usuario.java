package com.distribuidorafyv.distribuidorafyv.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Usuario {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String nombreUsuario;
    private String contraseña;
    private int activo;

    //Constructor 

    public Usuario() {
        this.activo = 1;
    }
    
    
    
    public Usuario(int id, String nombreUsuario, String contraseña) {
       
        this.id = id;
        
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.activo = 1;
    }

    //Setters y getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int estado) {
        this.activo = estado;
    }
       
}