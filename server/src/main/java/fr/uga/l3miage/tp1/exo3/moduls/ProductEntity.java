package fr.uga.l3miage.tp1.exo3.moduls;

import javax.persistence.*;

@Entity
public class ProductEntity {
    @Id
    @Column(length = 15)
    private String barCodeNumber;

    private String name;

    private Boolean consumable;

    @ManyToOne
    @JoinColumn(name = "brand")
    private BrandEntity brandEntity;
}
