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

public class ClienteJpaController implements ControladorBase<Cliente>{
    private EntityManagerFactory emf;

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ClienteJpaController () {
        emf = Persistence.createEntityManagerFactory("ProductoPU");
    }

    @Override
    public void create(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(cliente);
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
    public Cliente find(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }
    
    public Cliente findClienteInhabilitacion(int idCliente) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM Cliente c WHERE c.dni = :idCliente", Cliente.class)
                 .setParameter("idCliente", idCliente)
                 .getSingleResult();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Cliente> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void edit(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(cliente);
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
            Cliente cliente = em.getReference(Cliente.class, id);
            em.remove(cliente);
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

    public int getCount() {
        EntityManager em = emf.createEntityManager();
        try {
            return ((Long) em.createQuery("SELECT COUNT(cli) FROM Cliente cli").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    
    public List<Usuario> obternerCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}