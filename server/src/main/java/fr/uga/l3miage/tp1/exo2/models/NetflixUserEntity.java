package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {
    @Id
    private BigInteger id;
    private String uuid;
    private String lastname;
    private String firstname;

    @Enumerated(EnumType.STRING)
    private Sex sex;
    private LocalDate birthDate;

    @OneToOne
    private NetflixAccountEntity netflix_account_entity;
}
