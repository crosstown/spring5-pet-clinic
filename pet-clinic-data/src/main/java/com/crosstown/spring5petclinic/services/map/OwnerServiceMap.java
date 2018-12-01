package com.crosstown.spring5petclinic.services.map;

import com.crosstown.spring5petclinic.model.Owner;
import com.crosstown.spring5petclinic.services.OwnerService;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 21:18
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
