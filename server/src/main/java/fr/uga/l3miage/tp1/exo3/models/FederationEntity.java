package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
public class FederationEntity {

    @Id
    private String name;
    private Boolean isFageMembership;
    @ManyToOne
    private AssociationEntity associationEntity;
}
