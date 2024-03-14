package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "federation")
public class FederationEntity {
    @Id
    @Column(name = "name")
    private String name ;

    @Column(name = "is_fage_membership")
    private boolean isFageMembership ;

    @ManyToMany
    private Set<AssociationEntity> associations ;
}
