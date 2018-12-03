package com.crosstown.spring5petclinic.model;

import java.time.LocalDate;

/**
 * @author developer
 * @date 2018-12-02
 * @time 23:06
 */
public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
