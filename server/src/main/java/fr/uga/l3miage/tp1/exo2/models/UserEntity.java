package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@Entity
public class UserEntity {

    @Id
    private Long idUser;

    private Boolean SSO;

    private OffsetDateTime lastConnexion;

    @OneToOne(mappedBy = "user")
    private SessionEntity sessionEntity;
}
