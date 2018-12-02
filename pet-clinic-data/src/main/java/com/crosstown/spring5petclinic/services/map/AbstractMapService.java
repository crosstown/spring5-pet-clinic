package com.crosstown.spring5petclinic.services.map;

import com.crosstown.spring5petclinic.model.BaseEntity;

import java.util.*;

/**
 * @author developer
 * @date 2018-11-29
 * @time 21:03
 */
public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(), object);

        } else {
            throw new RuntimeException("Object cannot be null");
        }


        return  object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));

    }

    private long getNextId() {
        Long nextId = null;

        try{
            nextId =  Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
