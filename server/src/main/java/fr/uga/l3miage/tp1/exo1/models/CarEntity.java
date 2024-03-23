package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.WeightUnity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity // afin d'indiquer que cette classe correspond à une table dans la base de données.
@Table(name="car_porshe") // pour indiquer que l'entité que nous sommes en train de définir correspond à la table car_porshe en base de données.
public class CarEntity {
    @Id //permet de dire à JPA que l'attribut qui a cette annotation représente la clé primaire en BD.
    @Column(name="immat", length=8) // Membuat sebuah kolom dalam class CarEntity. Trus karakter dari nilai kolom immat nanti, engga boleh lebih dari 8.
    private String immatriculation; // Ici, nous précisons que l'attribut immatriculation de la classe CarEntity correspond à la colonne immat en base de données.

    @Column(name="cylinder_capacity")
    private Double cylinderCapacity;

    @Column(name="weight")
    private Integer weight;

    @Column(name="torque")
    private Integer torque;

    @Column(name="power")
    private Integer power;

    @Column(name="circulation_date")
    private LocalDate circulationDate;

    @Column(name="power_type")
    @Enumerated(EnumType.ORDINAL) // indique à JPA que l'attribut qui contient cette annotation est un type énuméré. EnumType.ORDINAL: donne l'indication de représenter l'enum par un entier (integer) dans la base de données
    private PowerType powerType;

    @Column(name="weight_unity")
    @Enumerated(EnumType.STRING)
    private WeightUnity weightUnity;
}
