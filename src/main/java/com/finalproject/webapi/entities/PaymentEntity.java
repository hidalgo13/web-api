package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="payments")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "ordersEntity")
    private List<OrdersEntity> orders;


    /* START Constructor part */

    public PaymentEntity(int id, String name, List<OrdersEntity> orders) {
        this.id = id;
        this.name = name;
        this.orders = orders;
    }

    public PaymentEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* END Constructor part */


    /* START Getter Setter part */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrdersEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersEntity> orders) {
        this.orders = orders;
    }

    /* END Getter Setter part */
}
