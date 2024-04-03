package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name="account")
    private String account;

    @Column(name="password")
    private String password;

    @Column(name="address")
    private String address;

    @Column(name="phone")
    private String phone;

    @ManyToOne
    @JoinColumn(name="role_id")
    private RolesEntity rolesEntity;


    @ManyToOne
    @JoinColumn(name = "status_id")
    private StatusEntity statusEntity;

    @OneToMany(mappedBy = "customer_id", cascade = CascadeType.ALL)
    private List<OrdersEntity> orders;

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL)
    private List<ReviewsEntity> reviewsEntities;

/* START Constructor part */

    public UsersEntity(int id, String name, String email, String account, String password, String address, String phone, RolesEntity rolesEntity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.account = account;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.rolesEntity = rolesEntity;
    }
    /* END Constructor part */

// START Getter Setter part
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RolesEntity getRolesEntity() {
        return rolesEntity;
    }

    public void setRolesEntity(RolesEntity rolesEntity) {
        this.rolesEntity = rolesEntity;
    }

    public StatusEntity getStatusEntity() {
        return statusEntity;
    }

    public void setStatusEntity(StatusEntity statusEntity) {
        this.statusEntity = statusEntity;
    }

    public List<OrdersEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersEntity> orders) {
        this.orders = orders;
    }

    public List<ReviewsEntity> getReviewsEntities() {
        return reviewsEntities;
    }

    public void setReviewsEntities(List<ReviewsEntity> reviewsEntities) {
        this.reviewsEntities = reviewsEntities;
    }

// END Getter Setter par
}
