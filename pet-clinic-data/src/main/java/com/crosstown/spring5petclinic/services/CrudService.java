package com.crosstown.spring5petclinic.services;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 19:47
 */
public interface CrudService<T, ID> {
    Set<T> findAll();

     T findById(ID id);

     T save(T object);

     void delete(T object);

     void deleteById(ID id);
}
