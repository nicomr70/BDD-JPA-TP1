package fr.uga.l3miage.tp1.exo1.models;


import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;
import fr.uga.l3miage.tp1.exo1.enums.WeightUnity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="bike_VTT")
public class BikeEntity {
    @Id
    @Column(length = 8)
    private String immatriculation;

    private Integer capacity;


    @Enumerated(EnumType.STRING)
    private CylinderNumber cylinderNumber;


    private boolean automatic;

    private boolean shifter;

    @Column(name="shifter_type")
    @Enumerated(EnumType.ORDINAL)
    private ShifterType shifterType;

    @Column(name="ciculation_date")
    private LocalDate circulationDate;

}
