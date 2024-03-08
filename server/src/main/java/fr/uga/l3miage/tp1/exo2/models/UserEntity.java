package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Table(name = "user_entity")
@Entity
public class UserEntity {

    @Id
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "SSO")
    private boolean sso;

    @Column(name = "lastConnexion")
    private OffsetDateTime lastConnexion;

    @OneToOne(mappedBy = "userEntityId")
    private SessionEntity idSession;
}
