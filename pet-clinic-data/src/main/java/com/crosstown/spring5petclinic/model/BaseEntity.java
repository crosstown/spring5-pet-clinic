package com.crosstown.spring5petclinic.model;

import java.io.Serializable;

/**
 * @author developer
 * @date 2018-11-29
 * @time 19:34
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
