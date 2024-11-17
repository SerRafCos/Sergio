
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Cliente;
import com.distribuidorafyv.distribuidorafyv.modelo.ClienteJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.Usuario;
import com.distribuidorafyv.distribuidorafyv.modelo.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraConsultarCliente {
    
    private ClienteJpaController cliJpa = new ClienteJpaController();

    public ControladoraConsultarCliente() {
    }

    public ControladoraConsultarCliente(ClienteJpaController cliJpa) {
        this.cliJpa = cliJpa;
    }

    public List<Cliente> obtenerCliente() {
        return cliJpa.findAll();
    }   
    
    public Cliente obtenerClienteIndividual(int id) {
        return cliJpa.find(id);
    }        
   
    
     public void eliminarLogicamenteCliente(int dni) {
        if (dni <= 0) {
            throw new IllegalArgumentException("El DNI debe ser un número positivo.");
        } else {
            Cliente cliente = cliJpa.findClienteInhabilitacion(dni);
        if (cliente != null) {
            cliente.setActivo(0); // Marcar como inactivo
            try {
                cliJpa.edit(cliente); // Guardar los cambios
            } catch (Exception ex) {
                Logger.getLogger(ControladoraConsultarCliente.class.getName()).log(Level.SEVERE, "Error al inhabilitar el cliente: " + dni, ex);
            }
        } else {
            Logger.getLogger(ControladoraConsultarCliente.class.getName()).log(Level.INFO, "Cliente no encontrado para inhabilitar: " + dni);
        }
        
        }
        
    }
}
