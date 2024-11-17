/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.logica;

import com.distribuidorafyv.distribuidorafyv.modelo.Usuario;
import com.distribuidorafyv.distribuidorafyv.modelo.UsuarioJpaController;
import com.distribuidorafyv.distribuidorafyv.modelo.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sergio
 */
public class ControladoraConsultarUsuario {
    
    private UsuarioJpaController usuJpa = new UsuarioJpaController();

    public ControladoraConsultarUsuario() {
    }

    public ControladoraConsultarUsuario(UsuarioJpaController prodJpa) {
        this.usuJpa = usuJpa;
    }

    public List<Usuario> obtenerUsuario() {
        return usuJpa.findAll();
    }   
    
    public Usuario obtenerUsuarioIndividual(String usuario) {
        return usuJpa.findUsuario(usuario);
    }

    public void eliminarLogicamenteUsuario(int idUsuario) {
        
        Usuario usuario = usuJpa.findUsuarioInhabilitacion(idUsuario);
        if (usuario != null) {
            usuario.setActivo(0); // Marcar como inactivo
            try {
                 usuJpa.edit(usuario); // Guardar los cambios

            }  catch (Exception ex) {
                Logger.getLogger(ControladoraConsultarPedido.class.getName()).log(Level.SEVERE, "Error al inhabilitar el usuario: " + idUsuario, ex);
            }           
        } else {
            Logger.getLogger(ControladoraConsultarPedido.class.getName()).log(Level.INFO, "Usuario no encontrado para inhabilitar: " + idUsuario);
        }
       
    }
}
