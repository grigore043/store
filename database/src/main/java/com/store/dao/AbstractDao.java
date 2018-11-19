package com.store.dao;

import org.hibernate.SessionFactory;

public abstract class AbstractDao<E> {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void persist(E entity) {
        sessionFactory.getCurrentSession().persist(entity);
    }

}
