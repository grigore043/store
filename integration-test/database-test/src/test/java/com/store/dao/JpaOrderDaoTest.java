package com.store.dao;

import com.store.entities.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:test-database.xml"})
@Transactional
public class JpaOrderDaoTest {

    @Autowired
    private OrderDao orderDao;

    private Order order;

    @Before
    public void setUp() {
        order = new Order(10L, 1L);
        order.setId(Long.parseLong("1"));
    }

    @Test
    public void testItemPersist() {
        orderDao.persist(order);
        orderDao.flush();
        orderDao.clear();
        Order newOrder = orderDao.findById(order.getId());
        assertEquals(order.getCustomerId(), newOrder.getCustomerId());
        assertEquals(order.getOrderItemCount(), newOrder.getOrderItemCount());
    }
}
