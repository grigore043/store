package com.store.dao.impl;

import com.store.dao.AbstractDao;
import com.store.dao.OrderDao;
import com.store.entities.Order;

public class JpaOrderDao extends AbstractDao<Order, Long> implements OrderDao {
    @Override
    public Order findById(Long id) {
        return findByClassId(Order.class, id);
    }
}
