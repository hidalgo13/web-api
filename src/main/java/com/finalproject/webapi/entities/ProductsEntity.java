package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="price")
    private double price;

    @Column(name="quantity")
    private int quantity;

    @Column(name="description")
    private String description;

    @Column(name="image")
    private String image;

    @ManyToOne
    @JoinColumn(name="category_id")
    private CategoriesEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name="supplier_id")
    private SupplierEntity supplierEntity;

    @OneToMany(mappedBy = "productEntity")
    private List<OrderItemsEntity> orderItemsEntities;

    @OneToMany(mappedBy = "productEntity")
    private List<ReviewsEntity> reviewsEntities;

}
