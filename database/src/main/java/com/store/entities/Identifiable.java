package com.store.entities;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
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
