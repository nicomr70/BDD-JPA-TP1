package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class AssociationEntity {

    @Id
    private String name;
    @Column(nullable = false)
    private String presidentName;
    @Column(nullable = false)
    private String treasurerName;
    private String secretaryName;
    private AssociationType associationType;

    // Manque association
    @OneToMany(mappedBy = "association")
    private  FederationEntity federation;
}
