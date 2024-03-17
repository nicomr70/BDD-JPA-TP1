package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.ShifterType;
import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class BikeEntity {
    @Id
    @Column(name="immatriculation")
    private String immatriculation;

    @Column(name="capacity")
    private Integer capacity;

    @Column(name="cylinder_number")
    private CylinderNumber cylinderNumber;

    @Column(name="automatic")
    private Boolean automatic;

    @Column(name="shifter")
    private Boolean shifter;

    @Column(name="shifter_type")
    private ShifterType shifterType;

    @Column(name="circulation_date")
    private LocalDate circulationDate;

}
