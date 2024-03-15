package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
class FederationEntity {
    @Id
    private String name;
    private Boolean isFageMembership;
    @OneToMany(mappedBy = "federation")
    private Set<AssociationEntity> associations;
}
