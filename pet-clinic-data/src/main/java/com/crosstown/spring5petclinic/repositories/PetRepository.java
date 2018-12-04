package com.crosstown.spring5petclinic.repositories;

import com.crosstown.spring5petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-03
 * @time 20:18
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
