package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.WeightRange;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="car_porshe")
public class CarEntity {
    @Id
    @Column(name = "immat", length = 8)
    private String immatriculation;

    @Column(name = "cylinder_capacity")
    private Double cylinderCapacity;

    @Column(name = "weight")
    private Integer weight;

    @Column(name= "weight_unity")
    @Enumerated(EnumType.STRING)
    private WeightRange weightUnity;

    @Column(name = "torque")
    private Integer torque;

    @Column(name ="power")
    private Integer power;

    @Column(name = "power_type")
    @Enumerated(EnumType.ORDINAL)
    private PowerType powerType;

    @Column(name= "circulation_date")
    private LocalDate circulationDate;

}
