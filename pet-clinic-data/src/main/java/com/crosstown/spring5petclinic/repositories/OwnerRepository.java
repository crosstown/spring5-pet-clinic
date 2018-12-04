package com.crosstown.spring5petclinic.repositories;

import com.crosstown.spring5petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-03
 * @time 20:17
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);

}
