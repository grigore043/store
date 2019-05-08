package com.store.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_item")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Item extends Identifiable<Long> {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    private Item() {}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
