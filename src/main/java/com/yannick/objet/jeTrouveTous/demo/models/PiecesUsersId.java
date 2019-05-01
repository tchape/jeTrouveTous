package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PiecesUsersId implements Serializable {

    private int idUser;
    private int idPiece;
}
