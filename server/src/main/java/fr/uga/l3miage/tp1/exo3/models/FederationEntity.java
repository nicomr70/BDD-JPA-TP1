package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
public class FederationEntity {
    @Id
    private String name;
    private Boolean isFageMembership;
    @OneToMany(mappedBy = "federationEntity")
    private Set<AssociationEntity> associations;
}
