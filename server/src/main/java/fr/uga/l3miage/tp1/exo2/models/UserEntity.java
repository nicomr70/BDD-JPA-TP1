package fr.uga.l3miage.tp1.exo2.models;
import fr.uga.l3miage.tp1.exo2.enums.Sex;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
public class UserEntity {
    // PK Only
    @Id
    private Long idUser;
    private boolean SSO;
    private OffsetDateTime lastConnexion;
    @OneToOne
    private SessionEntity session;

}

