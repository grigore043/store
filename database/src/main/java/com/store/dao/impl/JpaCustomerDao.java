package com.store.dao.impl;

import com.store.dao.AbstractDao;
import com.store.dao.CustomerDao;
import com.store.entities.Customer;

public class JpaCustomerDao extends AbstractDao<Customer, Long> implements CustomerDao {
    @Override
    public Customer findById(Long id) {
        return findByClassId(Customer.class, id);
    }
}
