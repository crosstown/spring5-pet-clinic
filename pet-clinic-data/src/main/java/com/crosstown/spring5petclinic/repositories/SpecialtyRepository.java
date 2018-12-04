package com.crosstown.spring5petclinic.repositories;

import com.crosstown.spring5petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-03
 * @time 20:20
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
