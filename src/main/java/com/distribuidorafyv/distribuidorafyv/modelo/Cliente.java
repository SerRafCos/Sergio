package com.distribuidorafyv.distribuidorafyv.modelo;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    
    //Atributos
    private int dni;
    private String nombre;
    private String email;
    private int telefono;
    private static Map<Integer, Cliente> clientes = new HashMap<>();
    
    //Datos iniciales
    static {
        new Cliente(12345678, "Juan Pérez", "Av. Principal 123", 5551234);
        new Cliente(87654321, "María López", "Calle 456", 5555678);
        new Cliente(45678912, "Carlos Rodríguez", "Jr. Lima 789", 559012);
    }

    //Constructor
    public Cliente(int dni, String nombre, String direccion, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        clientes.put(dni, this);
    }
    
    //Métodos
    public static Cliente buscarPorDni(int dni) {
        return clientes.get(dni);
    }

    //Getters y Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public static Map<Integer, Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(Map<Integer, Cliente> clientes) {
        Cliente.clientes = clientes;
    }
}