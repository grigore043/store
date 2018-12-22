package com.store.dao.impl;

import com.store.dao.AbstractDao;
import com.store.dao.ItemDao;
import com.store.entities.Item;

public class JpaItemDao extends AbstractDao<Item, Long> implements ItemDao {

    @Override
    public Item findById(Long id) {
        return findByClassId(Item.class, id);
    }

}
