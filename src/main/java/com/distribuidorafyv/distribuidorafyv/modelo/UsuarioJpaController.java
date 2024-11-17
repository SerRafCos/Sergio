/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import javax.persistence.Persistence;

public class UsuarioJpaController implements ControladorBase<Usuario>{
    private EntityManagerFactory emf;

    public UsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public UsuarioJpaController () {
        emf = Persistence.createEntityManagerFactory("ProductoPU");
    }

    @Override
    public void create(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(usuario);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            em.close();
        }
    }

    public Usuario findUsuario(String nombreUsuario) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario", Usuario.class)
                 .setParameter("nombreUsuario", nombreUsuario)
                 .getSingleResult();
        } finally {
            em.close();
        }
    }
    
    public Usuario findUsuarioInhabilitacion(int idUsuario) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT u FROM Usuario u WHERE u.id = :idUsuario", Usuario.class)
                 .setParameter("idUsuario", idUsuario)
                 .getSingleResult();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Usuario> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT usu FROM Usuario usu", Usuario.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void edit(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(usuario);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            em.close();
        }
    }

    @Override
    public void destroy(Integer id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            Usuario usuario = em.getReference(Usuario.class, id);
            em.remove(usuario);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            em.close();
        }
    }
       
    @Override
    public int getCount() {
        EntityManager em = emf.createEntityManager();
        try {
            return ((Long) em.createQuery("SELECT COUNT(usu) FROM Usuario usu").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Usuario> obternerUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}