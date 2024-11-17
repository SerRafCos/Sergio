/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.distribuidorafyv.distribuidorafyv.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Sergio
 */
public class DetallePedidoJpaController implements Serializable, ControladorBase<DetallePedido> {
    private EntityManagerFactory emf;

    public DetallePedidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DetallePedidoJpaController () {
        emf = Persistence.createEntityManagerFactory("ProductoPU");
    }

    @Override
    public void create(DetallePedido detalle) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(detalle);
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
    public DetallePedido find(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(DetallePedido.class, id);
        } finally {
            em.close();
        }
    }


    public List<DetallePedido> findDetallePedidoEntities(int idPedido) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT dp FROM DetallePedido dp where dp.pedido = (SELECT p FROM Pedido p WHERE p.nroPedido =  " + idPedido + ")" , DetallePedido.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void edit(DetallePedido detalle) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(detalle);
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
            DetallePedido detalle = em.getReference(DetallePedido.class, id);
            em.remove(detalle);
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
            return ((Long) em.createQuery("SELECT COUNT(dp) FROM DetallePedido dp").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<DetallePedido> obternerDetallePedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetallePedido> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
