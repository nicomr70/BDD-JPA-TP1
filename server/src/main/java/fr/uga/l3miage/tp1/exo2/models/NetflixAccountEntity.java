package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.enums.TypeAccount;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.UUID;

@Entity
class NetflixAccountEntity {
    @Id
    private BigInteger id;
    private Integer nbDevices;
    @Enumerated(EnumType.STRING)
    private TypeAccount typeAccount;
    @OneToOne(mappedBy = "account")
    private NetflixUserEntity user;
}
