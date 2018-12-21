package com.store.dao;

import com.store.entities.Item;

public interface ItemDao extends Dao {

    Item findById(Long id);

    void persist(Item item);

}
