package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name = "bar_code_number", length = 15)
    String barCodeNumber;

    String name;

    boolean consumable;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="brand_id", nullable = false)
    private BrandMiage brand;
}
