package com.crosstown.spring5petclinic.repositories;

import com.crosstown.spring5petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-03
 * @time 20:19
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
