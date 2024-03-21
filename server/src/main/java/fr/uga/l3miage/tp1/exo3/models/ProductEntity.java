package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number", length = 15)
    private char bar_code_number;
    @Column
    private String name;
    @Column
    private boolean consumable;
    @OneToMany
    private Set<BrandEntity> brands;


}
