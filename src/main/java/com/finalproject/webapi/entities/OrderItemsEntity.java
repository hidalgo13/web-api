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

    /* START Constructor part */

    public OrderItemsEntity(int id, int quantity, double unitPrice, double totalAmount, OrdersEntity ordersEntity, ProductsEntity productEntity) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = totalAmount;
        this.ordersEntity = ordersEntity;
        this.productEntity = productEntity;
    }

    /* END Constructor part */

    /* START Getter Setter part */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrdersEntity getOrdersEntity() {
        return ordersEntity;
    }

    public void setOrdersEntity(OrdersEntity ordersEntity) {
        this.ordersEntity = ordersEntity;
    }

    public ProductsEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductsEntity productEntity) {
        this.productEntity = productEntity;
    }

    /* END Getter Setter part */
}
