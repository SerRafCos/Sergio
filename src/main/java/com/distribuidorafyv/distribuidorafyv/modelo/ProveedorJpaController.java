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

public class ProveedorJpaController implements ControladorBase<Proveedor>{
    private EntityManagerFactory emf;

    public ProveedorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ProveedorJpaController () {
        emf = Persistence.createEntityManagerFactory("ProductoPU");
    }

    @Override
    public void create(Proveedor proveedor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(proveedor);
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
    public Proveedor find(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Proveedor.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Proveedor> findAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT prov FROM Proveedor prov", Proveedor.class).getResultList();
        } finally {
            em.close();
        }
    }

    @Override
    public void edit(Proveedor proveedor) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.merge(proveedor);
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
            Proveedor proveedor = em.getReference(Proveedor.class, id);
            em.remove(proveedor);
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
            return ((Long) em.createQuery("SELECT COUNT(prov) FROM Proveedor prov").getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Proveedor> obternerProveedor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}