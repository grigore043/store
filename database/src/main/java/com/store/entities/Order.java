package com.store.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_order")
@AttributeOverride(name = "id", column = @Column(name = "id"))
public class Order extends Identifiable<Long> {

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "item_count")
    private Long itemCount;

    @Column(name = "item_id")
    private Long itemId;

    public Order(Long itemCount, Long customerId, Long itemId) {
        this.itemCount = itemCount;
        this.customerId = customerId;
        this.itemId = itemId;
    }

    private Order() {}

    public Long getCustomerId() {
        return customerId;
    }

    public Long getItemCount() {
        return itemCount;
    }

    public Long getItemId() {
        return itemId;
    }
}
