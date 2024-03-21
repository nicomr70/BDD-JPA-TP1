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

    @Column
    private Double cylinderCapacity;

    @Column
    private Integer weight;

    @Column
    @Enumerated(EnumType.STRING)
    private WeightUnity weightUnity;

    @Column
    private Integer torque;

    @Column
    private Integer power;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private PowerType powerType;

    @Column
    private LocalDate circulationDate;


}