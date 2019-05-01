package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
public class PiecesUsers implements Serializable {

    @EmbeddedId
    private PiecesUsersId piecesUsersId;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Pieces pieces;

    private LocalDateTime dateRrecuperation;

    public PiecesUsers() {
    }

    public PiecesUsers(Users user, Pieces pieces, LocalDateTime dateRrecuperation) {
        this.user = user;
        this.pieces = pieces;
        this.dateRrecuperation = dateRrecuperation;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public LocalDateTime getDateRrecuperation() {
        return dateRrecuperation;
    }

    public void setDateRrecuperation(LocalDateTime dateRrecuperation) {
        this.dateRrecuperation = dateRrecuperation;
    }

    @Override
    public String toString() {
        return "PiecesUsers{" +
                "user=" + user +
                ", pieces=" + pieces +
                ", dateRrecuperation=" + dateRrecuperation +
                '}';
    }
}
