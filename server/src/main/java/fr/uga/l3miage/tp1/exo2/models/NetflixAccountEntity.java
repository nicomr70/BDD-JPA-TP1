package fr.uga.l3miage.tp1.exo2.models;

//import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.EnumType;
import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

public class NetflixAccountEntity {
    // FK uuid_user
    // == mappedBy = "nomAttributDansLautreClasse"

    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "nb_devices")
    private int nb_devices;
    @Enumerated(EnumType.STRING)
    @Column(name = "typeAccount")
    private TypeAccount typeAccount;
    @Column(name = "uuid_user")
    private String uuid_user;

    @OneToOne(mappedBy = "netflixAccount")
    private NetflixUserEntity netflixUser;

}
