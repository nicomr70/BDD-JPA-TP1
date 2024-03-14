package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "idUser")
    private long idUser;
    @Column(name = "SSO")
    private String SSO;
    @Column(name = "lastConnection")
    private OffsetDateTime lastConnection;
    @OneToOne
    private Session session;

}
