
package com.distribuidorafyv.distribuidorafyv.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import javax.persistence.Persistence;

public class PedidoJpaController implements ControladorBase<Pedido> {
    private EntityManagerFactory emf;

    public PedidoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public PedidoJpaController () {
        emf = Persistence.createEntityManagerFactory("ProductoPU");
    }

    @Override
    public void create(Pedido pedido) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(pedido);
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
    public Pedido find(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Pedido.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Pedido> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
        } finally {
            em.close();
        }
    }
    
 
    public Pedido findPedidoInhabilitacion(int idPedido) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Pedido p WHERE p.nroPedido = :id", Pedido.class)
                 .setParameter("id", idPedido)
                 .getSingleResult();
        } finally {
            em.close();
        }
    }

    @Override
    public void edit(Pedido pedido) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(pedido);
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
            Pedido pedido = em.getReference(Pedido.class, id);
            em.remove(pedido);
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
            return ((Long) em.createQuery("SELECT COUNT(p) FROM Pedido p").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Pedido> obternerPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}