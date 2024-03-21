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
    private int nb_divices;
    @Column(name = "type_account")
    @Enumerated(EnumType.ORDINAL)
    private TypeAccount typeAccount;

    @OneToOne(mappedBy = "uuid")
    private NetflixUserEntity uuid_user;





}