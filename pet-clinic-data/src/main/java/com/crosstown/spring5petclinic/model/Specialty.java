package com.crosstown.spring5petclinic.model;

/**
 * @author developer
 * @date 2018-12-02
 * @time 23:15
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
