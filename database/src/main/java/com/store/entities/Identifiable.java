package com.store.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Identifiable<I> {

    @Id
    private I id;

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }
    
}
