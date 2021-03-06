package com.crosstown.spring5petclinic.services;

import com.crosstown.spring5petclinic.model.Owner;

import java.util.List;

/**
 * @author developer
 * @date 2018-11-29
 * @time 19:10
 */
public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

   /*
   Owner findById(Long id);

   Owner save(Owner owner);

   Set<Owner> findAll();           already implemented by the framework */

}
