package com.store.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_order")
@AttributeOverride(name = "id", column = @Column(name = "order_id"))
public class Order extends Identifiable<Long> {

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "order_item_count")
    private Long orderItemCount;

    public Order(Long orderItemCount, Long customerId) {
        this.orderItemCount = orderItemCount;
        this.customerId = customerId;
    }

    private Order() {}

    public Long getCustomerId() {
        return customerId;
    }

    public Long getOrderItemCount() {
        return orderItemCount;
    }
}
