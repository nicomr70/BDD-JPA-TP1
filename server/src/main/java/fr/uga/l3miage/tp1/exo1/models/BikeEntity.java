package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.Enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.Enums.ShifterType;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BikeEntity")
public class BikeEntity {
    @Id
    @Column(name = "Immatriculation")
    private String imma;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "cylinder_number")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber;

    @Column(name="automatic")
    private Boolean automatic;

    @Column(name = "shifter")
    private Boolean shifter;

    @Column(name = "shifter_type")
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType;

    @Column(name= "circulation_date")
    private LocalDate circulationDate;

    //Types Enums

}
