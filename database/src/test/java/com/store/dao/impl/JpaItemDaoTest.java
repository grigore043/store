package com.store.dao.impl;

import com.store.dao.ItemDao;
import com.store.entities.Item;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:database.xml")
@Transactional
public class JpaItemDaoTest {

    @Autowired
    private ItemDao itemDao;

    private Item item;

    @Before
    public void setUp() {
        item = new Item("Test", "Test description");
        item.setId(Long.parseLong("1"));
    }

    @Test
    public void testItemPersist() {
        itemDao.persist(item);
        itemDao.flush();
        itemDao.clear();
        Item newItem = itemDao.findById(item.getId());
        assertEquals(item.getItemName(), newItem.getItemName());
        assertEquals(item.getItemDescription(), newItem.getItemDescription());
    }
}
