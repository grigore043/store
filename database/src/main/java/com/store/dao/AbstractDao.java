package com.store.dao;

import org.hibernate.SessionFactory;

import java.io.Serializable;

public abstract class AbstractDao<EntityType, IdType extends Serializable> implements EntityDao<EntityType, IdType> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void persist(EntityType entity) {
        sessionFactory.getCurrentSession().persist(entity);
    }

    @Override
    public EntityType findByClassId(Class<EntityType> template, IdType id) {
        return sessionFactory.getCurrentSession().get(template, id);
    }

    @Override
    public void flush() {
        sessionFactory.getCurrentSession().flush();
    }

    @Override
    public void clear() {
        sessionFactory.getCurrentSession().clear();
    }

}
