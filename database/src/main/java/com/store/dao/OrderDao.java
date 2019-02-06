package com.store.dao;

import com.store.entities.Order;

public interface OrderDao extends EntityDao<Order, Long> {

    Order findById(Long id);

}
