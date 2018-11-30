package com.crosstown.spring5petclinic.services;

import com.crosstown.spring5petclinic.model.Owner;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 19:10
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

   Owner findByI(Long id);

   Owner save(Owner owner);

   Set<Owner> findAll();

}
