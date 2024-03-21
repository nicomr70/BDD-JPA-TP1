package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "brand_miage")
public class BrandMiage {
    @Id
    @Column(name = "company_name")
    String companyName;

    @Column(length = 11)
    String siretNumber;

    @Enumerated(EnumType.STRING)
    BrandType type;

    @OneToMany(mappedBy="brand", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<ProductEntity> products;
}
