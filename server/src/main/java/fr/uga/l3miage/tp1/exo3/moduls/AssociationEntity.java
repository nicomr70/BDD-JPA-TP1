package fr.uga.l3miage.tp1.exo3.moduls;

import javax.persistence.*;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

@Entity
@Table(name = "association")
public class AssociationEntity {

    @Id
    private Long id;

    private String name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;

    private String secretaryName;

    @Enumerated(EnumType.STRING)
    private AssociationType associationType;

    @ManyToOne
    @JoinColumn(name = "federation_id")
    private FederationEntity federation;
}
