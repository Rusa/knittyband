package com.rusamaha.knittyband.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by rusamaha on 4/7/17.
 */
@Entity
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sizeName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
}
