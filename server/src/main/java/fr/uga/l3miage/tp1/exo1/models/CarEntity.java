package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.WeightUnity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="car_porshe")
public class CarEntity {
    @Id
    @Column(name="immat", length = 8)
    private String immatriculation;

    private Double cylinderCapacity;

    private Integer weight;

    @Enumerated(EnumType.STRING)
    private WeightUnity weightUnity;

    private Integer torque;

    private Integer power;

    @Enumerated(EnumType.ORDINAL)
    private PowerType powerType;

    private LocalDate circulationDate;


}