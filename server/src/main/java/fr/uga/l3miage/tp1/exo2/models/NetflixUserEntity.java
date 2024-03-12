package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.LocalDate;

import fr.uga.l3miage.tp1.exo2.enums.sexType;

@Entity
@Table(name="netflix_user")
public class NetflixUserEntity {
    @Id
    private int id;

    private String uuid;
    private String lastname;
    private String firstname;

    @Enumerated(EnumType.ORDINAL)
    private sexType sex;

    private LocalDate birthDate;

    @OneToOne()
    @JoinColumn(name = "netflix_account_id")
    private NetflixAccountEntity netflixAccount;


}