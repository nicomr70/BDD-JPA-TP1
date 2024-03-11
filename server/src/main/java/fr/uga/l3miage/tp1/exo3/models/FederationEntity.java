package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "federations")
public class FederationEntity {
    @Id
    String name;

    @Column(name = "is_fage_membership")
    boolean isFageMembership;

    @OneToMany(mappedBy = "federation")
    Set<AssociationEntity> associations;

    @ManyToOne
    @JoinColumn(name="association_id")
    private AssociationEntity association;
}
