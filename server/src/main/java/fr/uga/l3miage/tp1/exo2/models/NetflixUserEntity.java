package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String uuid;

    String lastname;

    String firstname;

    @Enumerated(EnumType.STRING)
    Sex sex;

    @Column(name = "birth_date")
    LocalDate birthDate;

    @OneToOne(mappedBy = "netflixUserEntity")
    NetflixAccountEntity netflixAccountEntity;
}
