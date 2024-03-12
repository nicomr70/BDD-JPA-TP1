package fr.uga.l3miage.tp1.exo3.moduls;

import javax.persistence.*;

import fr.uga.l3miage.tp1.exo3.enums.brandType;

import java.util.Set;

@Entity
@Table(name="brand_miage")
public class BrandEntity {
    @Id
    private String companyName;

    @Column(length = 11)
    private String siretNumber;

    @Enumerated(EnumType.STRING)
    private brandType type;

    @OneToMany(mappedBy = "brandEntity")
    private Set<ProductEntity> products;

}
