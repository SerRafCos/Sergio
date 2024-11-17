
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.ClienteJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;




public class ControladoraModificarCliente {
    
    private ClienteJpaController cliJpa = new ClienteJpaController();

    public ControladoraModificarCliente(ClienteJpaController cliJpa) {
        this.cliJpa = cliJpa;
    }
    
    public ControladoraModificarCliente() {
    }
    
    public void modificarCliente(Cliente cli, String dniStr, String nombre, String telefonoStr, String email, String localidad) throws Exception {       
        
        //Validación de nombre
        if (nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        
        if (email == null || !email.contains("@")) {
            throw new Exception("El email es inválido");
        }
        if (localidad.isEmpty()) {
            throw new Exception("La localidad no puede estar vacía");
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

        //Modificacion del cliente
        try {
            cli.setDni(dni);
            cli.setNombre(nombre);
            cli.setTelefono(telefono);
            cli.setEmail(email);
            cli.setLocalidad(localidad);
                        
            cliJpa.edit(cli);
                                
        } catch (PersistenceException e) {
            Logger.getLogger(ControladoraModificarCliente.class.getName()).log(Level.SEVERE, "Error de persistencia al modificar cliente: " + e.getMessage(), e);
            throw new Exception("Error al modificar el cliente en la base de datos.");
        } catch (Exception e) {        
            Logger.getLogger(ControladoraModificarCliente.class.getName()).log(Level.SEVERE, "Error al modificar cliente: " + e.getMessage(), e);
            throw e;
        }   
    }
    
    public Cliente obtenerCliente(int dni) {
        return cliJpa.find(dni);
    } 
                
}
