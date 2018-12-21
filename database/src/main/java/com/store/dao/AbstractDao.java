package com.store.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractDao<EntityType, EntityId> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void persist(EntityType entity) {
        sessionFactory.getCurrentSession().persist(entity);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void flush() {
        getCurrentSession().flush();
    }

    public void clear() {
        getCurrentSession().clear();
    }

}
