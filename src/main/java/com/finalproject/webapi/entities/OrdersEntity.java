package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private UsersEntity customer_id;

    @Column(name="order_date")
    private String order_date;

    @ManyToOne
    @JoinColumn(name="payment_id")
    private PaymentEntity paymentEntity;

    @Column(name="total_amount")
    private String total_amount;

    @Column(name="expected_deliver_date")
    private String expected_deliver_date;

    @Column(name="shipping_cost")
    private String shipping_cost;

    @Column(name="deliver_date")
    private String deliver_date;

    @Column(name="deliver_address")
    private String deliver_address;

    @ManyToOne
    @JoinColumn(name="order_status")
    private StatusEntity statusEntity;

    @OneToMany(mappedBy = "ordersEntity")
    private List<OrderItemsEntity> orderItemsEntities;


}
