package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;

@Entity
@Table(name = "netflix_account")
public class NetflixAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @Column(name = "nb_devices")
    Integer nbDevices;

    @Enumerated(EnumType.STRING)
    TypeAccount typeAccount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uuid_user", referencedColumnName = "uuid")
    NetflixUserEntity netflixUserEntity;
}
