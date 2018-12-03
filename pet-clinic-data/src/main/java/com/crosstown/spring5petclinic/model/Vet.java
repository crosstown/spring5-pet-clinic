package com.crosstown.spring5petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author developer
 * @date 2018-11-28
 * @time 10:37
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}


