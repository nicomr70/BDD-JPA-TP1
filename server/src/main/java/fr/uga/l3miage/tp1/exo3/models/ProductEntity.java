package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Table(name = "product_entity")
@Entity
public class ProductEntity {
    // Pk
    @Id
    @Column(name = "bar_code_number", length = 15)
    private String bar_code_number;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private boolean consumable;


    @OneToMany(mappedBy = "product")
    private Set<BrandEntity> brands;

}
