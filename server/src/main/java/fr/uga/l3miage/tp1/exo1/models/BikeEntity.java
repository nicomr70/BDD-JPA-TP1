package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumber;
import fr.uga.l3miage.tp1.exo1.enums.ShifterType;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class BikeEntity {
    @Id
    @Column(name = "immat")
    private String immatriculation ;
    @Column(name = "capacity")
    private Integer capacity ;
    @Column(name = "cylinderNumber")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumber cylinderNumber ;
    @Column(name = "automatic")
    private Boolean automatic ;
    @Column(name = "shifter")
    private Boolean shifter ;
    @Column(name = "shifterType")
    @Enumerated(EnumType.STRING)
    private ShifterType shifterType ;

    @Column(name = "circulationDate")
    private LocalDate circulationDate ;

}
