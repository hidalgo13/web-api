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

    /* START Constructor part */

    public ProductsEntity(int id, String name, double price, int quantity, String description, String image, CategoriesEntity categoryEntity, SupplierEntity supplierEntity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.categoryEntity = categoryEntity;
        this.supplierEntity = supplierEntity;
    }

    public ProductsEntity(int id, String name, double price, int quantity, String description, String image, CategoriesEntity categoryEntity, SupplierEntity supplierEntity, List<OrderItemsEntity> orderItemsEntities, List<ReviewsEntity> reviewsEntities) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.image = image;
        this.categoryEntity = categoryEntity;
        this.supplierEntity = supplierEntity;
        this.orderItemsEntities = orderItemsEntities;
        this.reviewsEntities = reviewsEntities;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public CategoriesEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoriesEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public SupplierEntity getSupplierEntity() {
        return supplierEntity;
    }

    public void setSupplierEntity(SupplierEntity supplierEntity) {
        this.supplierEntity = supplierEntity;
    }

    public List<OrderItemsEntity> getOrderItemsEntities() {
        return orderItemsEntities;
    }

    public void setOrderItemsEntities(List<OrderItemsEntity> orderItemsEntities) {
        this.orderItemsEntities = orderItemsEntities;
    }

    public List<ReviewsEntity> getReviewsEntities() {
        return reviewsEntities;
    }

    public void setReviewsEntities(List<ReviewsEntity> reviewsEntities) {
        this.reviewsEntities = reviewsEntities;
    }
    /* END Getter Setter part */
}
