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

    /* START Constructor part */

    public OrdersEntity(int id, UsersEntity customer_id, String order_date, PaymentEntity paymentEntity, String total_amount, String expected_deliver_date, String shipping_cost, String deliver_date, String deliver_address, StatusEntity statusEntity, List<OrderItemsEntity> orderItemsEntities) {
        this.id = id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.paymentEntity = paymentEntity;
        this.total_amount = total_amount;
        this.expected_deliver_date = expected_deliver_date;
        this.shipping_cost = shipping_cost;
        this.deliver_date = deliver_date;
        this.deliver_address = deliver_address;
        this.statusEntity = statusEntity;
        this.orderItemsEntities = orderItemsEntities;
    }

    /* END Constructor part */


    /* START Getter Setter part */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UsersEntity getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(UsersEntity customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public PaymentEntity getPaymentEntity() {
        return paymentEntity;
    }

    public void setPaymentEntity(PaymentEntity paymentEntity) {
        this.paymentEntity = paymentEntity;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getExpected_deliver_date() {
        return expected_deliver_date;
    }

    public void setExpected_deliver_date(String expected_deliver_date) {
        this.expected_deliver_date = expected_deliver_date;
    }

    public String getShipping_cost() {
        return shipping_cost;
    }

    public void setShipping_cost(String shipping_cost) {
        this.shipping_cost = shipping_cost;
    }

    public String getDeliver_date() {
        return deliver_date;
    }

    public void setDeliver_date(String deliver_date) {
        this.deliver_date = deliver_date;
    }

    public String getDeliver_address() {
        return deliver_address;
    }

    public void setDeliver_address(String deliver_address) {
        this.deliver_address = deliver_address;
    }

    public StatusEntity getStatusEntity() {
        return statusEntity;
    }

    public void setStatusEntity(StatusEntity statusEntity) {
        this.statusEntity = statusEntity;
    }

    public List<OrderItemsEntity> getOrderItemsEntities() {
        return orderItemsEntities;
    }

    public void setOrderItemsEntities(List<OrderItemsEntity> orderItemsEntities) {
        this.orderItemsEntities = orderItemsEntities;
    }
    /* END Getter Setter part */
}
