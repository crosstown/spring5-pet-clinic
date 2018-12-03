package com.crosstown.spring5petclinic.model;

import java.util.Set;

/**
 * @author developer
 * @date 2018-11-28
 * @time 10:38
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
