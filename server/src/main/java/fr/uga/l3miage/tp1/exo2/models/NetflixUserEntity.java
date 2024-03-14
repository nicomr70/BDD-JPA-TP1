package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;


@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "lastname")
    private String firstname;
    @Column(name = "sex", length = 2)
    @Enumerated(EnumType.ORDINAL)
    private Sex sex;
    @Column(name = "birthDate")
    private LocalDate birthDate;

    @OneToOne
    private NetflixAccountEntity netflix_account;


}
