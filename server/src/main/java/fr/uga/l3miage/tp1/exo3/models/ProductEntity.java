package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number", length = 15)
    private String barCodeNumber ;

    @Column(name = "name")
    private String name ;

    @Column(name = "consumable")
    private boolean consumable ;

    @OneToMany(mappedBy = "productEntity")
    @Column(name = "brand_miage")
    private Set<BrandEntity> brands ;
}
