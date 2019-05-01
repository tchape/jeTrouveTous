package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class StatusPieces implements Serializable {

    @EmbeddedId
    private StatusPiecesId statusPiecesId;

    @OneToOne
    private Pieces pieces;
    @OneToOne
    private Status status;
    private LocalDateTime dateStatusPiece;

    public StatusPieces() {
    }

    public StatusPieces(Pieces pieces, Status status, LocalDateTime dateStatusPiece) {
        this.pieces = pieces;
        this.status = status;
        this.dateStatusPiece = dateStatusPiece;
    }

    public Pieces getPieces() {
        return pieces;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDateStatusPiece() {
        return dateStatusPiece;
    }

    public void setDateStatusPiece(LocalDateTime dateStatusPiece) {
        this.dateStatusPiece = dateStatusPiece;
    }

    @Override
    public String toString() {
        return "StatusPieces{" +
                "pieces=" + pieces +
                ", status=" + status +
                ", dateStatusPiece=" + dateStatusPiece +
                '}';
    }
}
