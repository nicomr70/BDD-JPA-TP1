package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
class ProductEntity {
    @Id
    private String barCodeNumber;
    private String name;
    private Boolean consumable;
    @ManyToOne
    private BrandMiage marque;
}
