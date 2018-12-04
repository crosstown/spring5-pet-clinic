package com.crosstown.spring5petclinic.repositories;

import com.crosstown.spring5petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-03
 * @time 20:23
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
