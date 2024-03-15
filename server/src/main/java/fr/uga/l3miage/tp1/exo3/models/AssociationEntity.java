package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;

@Entity
class AssociationEntity {
    @Id
    private String name;
    private String presidentName;
    private String treasurerName;
    private String secretaryName;
    @Enumerated(EnumType.STRING)
    private AssociationType associationType;
    @ManyToOne
    private FederationEntity federation;
}
