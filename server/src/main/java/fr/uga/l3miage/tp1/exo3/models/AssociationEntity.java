package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class AssociationEntity {
    @Id
    private String name;
    @NotNull
    private String presidentName;
    @NotNull
    private String treasureName;
    private String secretaryName;
    @Enumerated(EnumType.STRING)
    private AssociationType associationType;

    @ManyToOne
    private FederationEntity federationEntity;
}
