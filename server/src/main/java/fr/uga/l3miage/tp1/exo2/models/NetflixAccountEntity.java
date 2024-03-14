package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {

    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "nb_devices")
    private Integer nb_devices;

    @Column(name = "typeAccount")
    private TypeAccount typeAccount;

    @OneToOne
    private NetflixUserEntity netflixUserEntity;
}
