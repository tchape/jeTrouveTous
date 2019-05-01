package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Embeddable
public class Status implements Serializable {

    @Id
    @GeneratedValue
    private int idStatus;
    private String description;

    public Status() {
    }

    public Status(int id, String description) {
        this.idStatus = id;
        this.description = description;
    }

    public int getId() {
        return idStatus;
    }

    public void setId(int id) {
        this.idStatus = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id=" + idStatus +
                ", description='" + description + '\'' +
                '}';
    }
}
