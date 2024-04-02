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

}
