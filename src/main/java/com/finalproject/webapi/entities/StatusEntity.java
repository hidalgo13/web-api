package com.finalproject.webapi.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="status")
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="entity_name")
    private String entity_name;

    @Column(name="status_name")
    private String status_name;

    /* START Constructor part */

    public StatusEntity(int id, String entity_name, String status_name) {
        this.id = id;
        this.entity_name = entity_name;
        this.status_name = status_name;
    }

    public StatusEntity(){}

    /* END Constructor part */

    /* START Getter Setter part */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    /* END Getter Setter part */

}
