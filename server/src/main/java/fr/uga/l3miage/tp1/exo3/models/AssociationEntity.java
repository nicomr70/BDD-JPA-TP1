package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;

@Entity
@Table(name = "association")
public class AssociationEntity {
    @Id
    @Column(name = "name")
    private String name ;

    @Column(name = "president_name", nullable = false)
    private String presidentName ;

    @Column(name = "treasurer_name", nullable = false)
    private String treasurerName ;

    @Column(name = "secretary_name")
    private String secretaryName ;

    @Column(name = "association_type")
    @Enumerated(EnumType.STRING)
    private AssociationType associationType ;

    @ManyToOne
    @JoinColumn(name = "federation_name")
    private FederationEntity federation ;
}
