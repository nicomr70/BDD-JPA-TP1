package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Entity
@Table(name="user_entity")
public class User {

    @Id
    Long idUser;

    boolean SSO;

    OffsetDateTime lastConnection;

    @OneToOne(mappedBy = "user")
    Session session;
}
