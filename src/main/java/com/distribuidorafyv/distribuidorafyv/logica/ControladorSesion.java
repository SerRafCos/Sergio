/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.logica;
import com.distribuidorafyv.distribuidorafyv.modelo.Usuario;
import com.distribuidorafyv.distribuidorafyv.modelo.UsuarioJpaController;
import javax.persistence.PersistenceException;

/**
 *
 * @author Sergio
 */
public class ControladorSesion {
    
     private UsuarioJpaController usuJpa = new UsuarioJpaController();

    public ControladorSesion() {
    }
     

    // Constructor con inyección de dependencias
    public ControladorSesion(UsuarioJpaController usuJpa) {       
        this.usuJpa = usuJpa;
    }
    
    
    public boolean iniciarSesion(String username, String password) {
        
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("El nombre de usuario no puede estar vacío");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía");
        }

        
        boolean autenticado = false;
         
        try {
            Usuario usuario = usuJpa.findUsuario(username);
            if (usuario != null && usuario.getContraseña().equals(password)) {
                autenticado = true; // Autenticación exitosa
            }
        } catch (PersistenceException e) {
            System.err.println("Error al buscar el usuario: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }        

        return autenticado;
    
    }
}
