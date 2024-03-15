package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity
class BrandMiage {
    @Id
    private String companyName;
    private String siretNumber;
    @Enumerated(EnumType.STRING)
    private BrandType type;
    @OneToMany
    private Set<ProductEntity> produits;
}
