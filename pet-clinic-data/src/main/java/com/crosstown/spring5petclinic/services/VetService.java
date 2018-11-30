package com.crosstown.spring5petclinic.services;

import com.crosstown.spring5petclinic.model.Vet;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-29
 * @time 19:19
 */
public interface VetService {
    Vet findByI(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
