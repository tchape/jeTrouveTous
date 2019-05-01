package com.yannick.objet.jeTrouveTous.demo.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class StatusPiecesId implements Serializable {

    private int idStatus;
    private int idPiece;
}
