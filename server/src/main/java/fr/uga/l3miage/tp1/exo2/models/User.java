package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.OffsetDateTime;

@Entity
class User {
    @Id
    private Long idUser;
    private Boolean SSO;
    private OffsetDateTime lastConnexion;
    @OneToOne(mappedBy = "user")
    private Session session;
}
