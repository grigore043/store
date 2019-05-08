package com.store.dao;

import com.store.entities.Customer;

public interface CustomerDao extends EntityDao<Customer, Long> {

    Customer findById(Long id);
    
}
