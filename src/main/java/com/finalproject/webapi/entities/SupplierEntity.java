package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="suppliers")
public class SupplierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "supplierEntity")
    private List<ProductsEntity> productEntities;

/* START Constructor part */

    public SupplierEntity(int id, String name, List<ProductsEntity> productEntities) {
        this.id = id;
        this.name = name;
        this.productEntities = productEntities;
    }

    public SupplierEntity(int id, String name) {
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

    public List<ProductsEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductsEntity> productEntities) {
        this.productEntities = productEntities;
    }

    /* END Getter Setter part */
}
