package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Table(name = "brand_miage")
@Entity
public class BrandEntity {

    // pas de PK?
    // Mais une FK
    @Id
    @Column(name = "company_name")
    private String company_name;

    @Column(name = "siretNumber", length = 11)
    private String siretNumber;

    @Column(name = "type")
    private String type;

    //manque associ @OneToMany
    @ManyToOne
    private ProductEntity product;


}
