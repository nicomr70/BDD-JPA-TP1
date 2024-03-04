package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bike_entity")
public class BikeEntity {
    @Id
    @Column(length = 8)
    private String immatriculation;

    @Column
    private Integer capacity;

    @Column
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    @Column
    private Boolean automatic;

    @Column
    private Boolean shifter;

    @Column
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    @Column
    private LocalDate circulationDate;


}
