package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "associations")
public class AssociationEntity {
    @Id
    String name;

    @Column(name = "president_name", nullable = false)
    String presidentName;

    @Column(name = "treasurer_name", nullable = false)
    String treasurerName;

    @Column(name = "secretary_name")
    String secretaryName;

    @Enumerated(EnumType.STRING)
    AssociationType associationType;

    @ManyToOne
    @JoinColumn(name="federation_id")
    private FederationEntity federation;
}
