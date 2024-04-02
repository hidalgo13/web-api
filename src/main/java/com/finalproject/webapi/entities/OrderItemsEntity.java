package com.finalproject.webapi.entities;

import jakarta.persistence.*;

@Entity(name = "order_items")
public class OrderItemsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "total_amount")
    private double totalAmount;

    @ManyToOne
    @JoinColumn(name="order_id")
    private OrdersEntity ordersEntity;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductsEntity productEntity;
}
