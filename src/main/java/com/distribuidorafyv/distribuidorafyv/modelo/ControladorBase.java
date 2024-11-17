
package com.distribuidorafyv.distribuidorafyv.modelo;

import java.util.List;

public interface ControladorBase<T> {
    void create(T entity);
    T find(Integer id);
    void edit(T entity);
    void destroy(Integer id);
    List<T> findAll();
    int getCount();
}
