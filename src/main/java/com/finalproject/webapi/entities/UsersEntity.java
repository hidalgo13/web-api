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


}
