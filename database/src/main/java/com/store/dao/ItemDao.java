package com.store.dao;

import com.store.entities.Item;

public interface ItemDao extends EntityDao<Item, Long> {
    Item findById(Long id);
}
