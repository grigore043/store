package com.store.dao;

public interface EntityDao<EntityType, IdType> {

    void flush();

    void clear();

    void persist(EntityType item);

    EntityType findByClassId(Class<EntityType> template, IdType id);

}
