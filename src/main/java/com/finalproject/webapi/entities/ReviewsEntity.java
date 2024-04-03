package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="reviews")
public class ReviewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="rating")
    private double rating;

    @Column(name="comment")
    private String comment;

    @Column(name="review_date")
    private String reviewDate;

    @ManyToOne
    @JoinColumn(name="product_id")
    private ProductsEntity productEntity;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private UsersEntity usersEntity;

    /* START Constructor part */

    public ReviewsEntity(int id, double rating, String comment, String reviewDate, ProductsEntity productEntity, UsersEntity usersEntity) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
        this.productEntity = productEntity;
        this.usersEntity = usersEntity;
    }

    /* END Constructor part */

    /* START Getter Setter part */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(String reviewDate) {
        this.reviewDate = reviewDate;
    }

    public ProductsEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductsEntity productEntity) {
        this.productEntity = productEntity;
    }

    public UsersEntity getUsersEntity() {
        return usersEntity;
    }

    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    /* END Getter Setter part */

}
