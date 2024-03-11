package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.accountType;

import javax.persistence.*;


@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int nbDevices;

    @Enumerated(EnumType.STRING)
    private accountType typeAccount;

    @OneToOne(mappedBy = "netflixAccountEntity")
    private NetflixUserEntity user;

}