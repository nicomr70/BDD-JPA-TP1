package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "company_name")
    private BrandEntity brand ;
}
