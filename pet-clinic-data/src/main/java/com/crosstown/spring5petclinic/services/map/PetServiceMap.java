package com.crosstown.spring5petclinic.services.map;

import com.crosstown.spring5petclinic.model.Pet;
import com.crosstown.spring5petclinic.services.CrudService;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 21:42
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
