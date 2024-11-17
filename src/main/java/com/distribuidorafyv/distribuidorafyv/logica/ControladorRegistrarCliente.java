package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
import com.distribuidorafyv.distribuidorafyv.modelo.ClienteJpaController;
import java.util.HashSet;
import java.util.Set;

public class ControladorRegistrarCliente {
    
    //Constructor
    public ControladorRegistrarCliente() {       
    }
    
    private ClienteJpaController cliJpa = new ClienteJpaController();

    // Constructor con inyección de dependencias
    public ControladorRegistrarCliente(ClienteJpaController cliJpa) {       
        this.cliJpa = cliJpa;
    }
       
    //Métodos
    public void registrarCliente(String dniStr, String nombre, String telefonoStr, String email, String localidad) throws Exception {       
        
        //Validación de nombre
        if (nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        
        //Variables para conversión
        int dni;
        int telefono;
        
        //Conversión y validación de tipos
        try {
            dni = Integer.parseInt(dniStr);
            telefono = Integer.parseInt(telefonoStr);
        } catch (NumberFormatException e) {
            throw new Exception("Los valores numéricos son inválidos");
        }

        
        //Registro del cliente
        try {
            Cliente cli = new Cliente();
            cli.setDni(dni);
            cli.setNombre(nombre);
            cli.setTelefono(telefono);
            cli.setEmail(email);
            cli.setLocalidad(localidad);
            
            
            
            cliJpa.create(cli);
                                
        } catch (Exception e) {        
            System.err.println("Error al registrar cliente: " + e.getMessage());
            throw e;
        }        
    }
    

    
  
}