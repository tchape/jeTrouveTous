package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.util.Objects;

@Entity
@Embeddable
@EntityListeners(value = EntityListeners.class)
public class Pieces implements Serializable {

    @Id
    @GeneratedValue
    private int idPiece;

    @ManyToOne
    private TypePieces typePieces;

    @ManyToOne
    private Users users;

    private String nomPersonne;
    private String descriptionPrenom;
    private LocalDateTime   dateTrouve;
    private LocalDateTime   dateDeclare;
    private LocalDateTime   dateEnregistre;
    private String urlImage;

    public Pieces() {
    }

    public Pieces(int id, TypePieces typePieces, Users users, String nomPersonne, String descriptionPrenom, LocalDateTime dateTrouve, LocalDateTime dateDeclare, LocalDateTime dateEnregistre, String urlImage) {
        this.idPiece = id;
        this.typePieces = typePieces;
        this.users = users;
        this.nomPersonne = nomPersonne;
        this.descriptionPrenom = descriptionPrenom;
        this.dateTrouve = dateTrouve;
        this.dateDeclare = dateDeclare;
        this.dateEnregistre = dateEnregistre;
        this.urlImage = urlImage;
    }

    public int getId() {
        return idPiece;
    }

    public void setId(int id) {
        this.idPiece = id;
    }

    public TypePieces getTypePieces() {
        return typePieces;
    }

    public void setTypePieces(TypePieces typePieces) {
        this.typePieces = typePieces;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getDescriptionPrenom() {
        return descriptionPrenom;
    }

    public void setDescriptionPrenom(String descriptionPrenom) {
        this.descriptionPrenom = descriptionPrenom;
    }

    public LocalDateTime getDateTrouve() {
        return dateTrouve;
    }

    public void setDateTrouve(LocalDateTime dateTrouve) {
        this.dateTrouve = dateTrouve;
    }

    public LocalDateTime getDateDeclare() {
        return dateDeclare;
    }

    public void setDateDeclare(LocalDateTime dateDeclare) {
        this.dateDeclare = dateDeclare;
    }

    public LocalDateTime getDateEnregistre() {
        return dateEnregistre;
    }

    public void setDateEnregistre(LocalDateTime dateEnregistre) {
        this.dateEnregistre = dateEnregistre;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieces pieces = (Pieces) o;
        return idPiece == pieces.idPiece &&
                Objects.equals(typePieces, pieces.typePieces) &&
                Objects.equals(users, pieces.users) &&
                Objects.equals(nomPersonne, pieces.nomPersonne) &&
                Objects.equals(descriptionPrenom, pieces.descriptionPrenom) &&
                Objects.equals(dateTrouve, pieces.dateTrouve) &&
                Objects.equals(dateDeclare, pieces.dateDeclare) &&
                Objects.equals(dateEnregistre, pieces.dateEnregistre) &&
                Objects.equals(urlImage, pieces.urlImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPiece, typePieces, users, nomPersonne, descriptionPrenom, dateTrouve, dateDeclare, dateEnregistre, urlImage);
    }
}
