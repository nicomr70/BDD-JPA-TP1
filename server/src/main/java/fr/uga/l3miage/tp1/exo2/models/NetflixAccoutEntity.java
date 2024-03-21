package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_account")
public class NetflixAccoutEntity {
    @Id
    @Column(name = "id")
    private BigInteger id ;
    @Column(name = "nb_devices")
    private int nombreDevices ;
    @Column(name = "typeAccount")
    private String typeAccount ;
    @Column(name = "uuid_user")
    private String uuid_user ;

}
