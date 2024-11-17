package com.distribuidorafyv.distribuidorafyv.logica;


import com.distribuidorafyv.distribuidorafyv.modelo.Usuario;
import com.distribuidorafyv.distribuidorafyv.modelo.UsuarioJpaController;
import javax.persistence.PersistenceException;

public class ControladorRegistrarUsuario {
    
    //Constructor
    public ControladorRegistrarUsuario() {       
    }
    
    private UsuarioJpaController usuJpa = new UsuarioJpaController();

    // Constructor con inyección de dependencias
    public ControladorRegistrarUsuario(UsuarioJpaController prodJpa) {       
        this.usuJpa = usuJpa;
    }
       
    //Métodos
    public void registrarUsuario(String nombre, String contraseña) throws Exception {       
        
        //Validación de nombre
        if (nombre.isEmpty()) {
            throw new Exception("El nombre no puede estar vacío");
        }
        
        if (contraseña.isEmpty()) {
            throw new Exception("La contraseña no puede estar vacía");
        }

        try {
            Usuario usu = new Usuario();
            usu.setNombreUsuario(nombre);
            usu.setContraseña(contraseña);
            usuJpa.create(usu);
        } catch (PersistenceException e) {
            System.err.println("Error de persistencia al registrar usuario: " + e.getMessage());
            throw new Exception("Error al registrar el usuario en la base de datos.", e);
        } catch (Exception e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
            throw e;
        }     
    }
    

    
  
}