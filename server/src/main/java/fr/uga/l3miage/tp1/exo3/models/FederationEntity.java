package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.OneToOne;

@Entity
public class FederationEntity {
    @Id
    private String name;

    private boolean isFageMemberShip;

    //Manque asso voir meme ne pas en mettre
    @ManyToOne
    private AssociationEntity association;

}
