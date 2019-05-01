package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
public class TypePieces implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String description;

    @OneToMany(targetEntity = Pieces.class)
    private List pieceList;

    public TypePieces() {
    }

    public TypePieces(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TypePieces{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
