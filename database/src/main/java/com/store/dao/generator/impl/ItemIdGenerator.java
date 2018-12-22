package com.store.dao.generator.impl;

import com.store.dao.generator.IdTypeGenerator;
import org.hibernate.SessionFactory;

public class ItemIdGenerator implements IdTypeGenerator<Long> {

    private SessionFactory sessionFactory;

    public ItemIdGenerator(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Long getNext() {
        return null;
    }
}
