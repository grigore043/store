package com.store.dao;

import java.io.Serializable;

public interface EntityDao<EntityType, IdType extends Serializable> {

    void flush();

    void clear();

    void persist(EntityType item);

    EntityType findById(IdType id);

}
