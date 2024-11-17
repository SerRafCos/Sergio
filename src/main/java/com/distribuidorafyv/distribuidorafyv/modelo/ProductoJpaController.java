
package com.distribuidorafyv.distribuidorafyv.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;
import javax.persistence.Persistence;

public class ProductoJpaController implements ControladorBase<Producto>{
    private EntityManagerFactory emf;

    public ProductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ProductoJpaController () {
        emf = Persistence.createEntityManagerFactory("ProductoPU");
    }

    @Override
    public void create(Producto producto) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(producto);
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
    public Producto find(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Producto.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Producto> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void edit(Producto producto) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(producto);
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
            Producto producto = em.getReference(Producto.class, id);
            em.remove(producto);
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
            return ((Long) em.createQuery("SELECT COUNT(p) FROM Producto p").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Producto> obternerProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}