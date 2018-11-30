package com.crosstown.spring5petclinic.services;

import com.crosstown.spring5petclinic.model.Pet;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 19:14
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
