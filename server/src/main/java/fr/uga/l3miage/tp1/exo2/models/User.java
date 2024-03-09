package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    Long idUser;

    boolean SSO;

    @Column(name = "last_connexion")
    OffsetDateTime lastConnexion;

    @OneToOne(mappedBy = "user")
    Session session;
}
