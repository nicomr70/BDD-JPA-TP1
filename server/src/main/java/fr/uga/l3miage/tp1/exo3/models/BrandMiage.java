package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "brand_miage")
public class BrandMiage {

    @Id
    @Column(name = "company_name")
    private String company_name;
    @Column(name = "siretNumber" ,length = 11)
    private String siret;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private BrandType type;

    @OneToMany(mappedBy = "brandMiage")
    private Set<ProductEntity> productEntities;
}
