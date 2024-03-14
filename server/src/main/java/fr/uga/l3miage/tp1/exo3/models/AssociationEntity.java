package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "association")
public class AssociationEntity {
    @Id
    @Column
    private String name;
    @Column(nullable = false, name = "president_name")
    private String presidentName;
    @Column(nullable = false, name = "treasurer_name")
    private String treasurerName;
    @Column(name = "secretary_name")
    private String secretaryName;
    @Column(name = "association_type")
    @Enumerated(EnumType.ORDINAL)
    private AssociationType associationType;

    @ManyToMany
    private Set<FederationEntity> federations;

}
