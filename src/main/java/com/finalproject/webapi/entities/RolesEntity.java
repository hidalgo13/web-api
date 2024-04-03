package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="roles")
public class RolesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "rolesEntity")
    private List<UsersEntity> users;

/* START Constructor part */

    public RolesEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public RolesEntity(int id, String name, List<UsersEntity> users) {
        this.id = id;
        this.name = name;
        this.users = users;
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

    public List<UsersEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UsersEntity> users) {
        this.users = users;
    }

    /* END Getter Setter part */

}
