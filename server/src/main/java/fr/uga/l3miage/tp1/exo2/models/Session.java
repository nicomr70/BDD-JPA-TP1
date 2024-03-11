package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="session_entity")
public class Session {
    @Id
    UUID idSession;

    String lastCommand;

    String currentDir;

    boolean lock;

    @OneToOne()
    @JoinColumn(name="user_id", referencedColumnName = "idUser")
    User user;

}
