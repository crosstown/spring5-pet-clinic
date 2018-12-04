package com.crosstown.spring5petclinic.repositories;

import com.crosstown.spring5petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author developer
 * @date 2018-12-03
 * @time 20:24
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
