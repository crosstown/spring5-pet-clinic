package com.crosstown.spring5petclinic.services.map;

import com.crosstown.spring5petclinic.model.Vet;
import com.crosstown.spring5petclinic.services.VetService;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 21:32
 */

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
