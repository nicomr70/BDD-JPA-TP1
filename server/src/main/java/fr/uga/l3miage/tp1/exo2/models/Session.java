package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "sessions")
public class Session {
    @Id
    @Column(name = "id")
    UUID idSession;

    @Column(name = "last_command")
    String lastCommand;

    @Column(name = "current_dir")
    String currentDir;

    boolean lock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;
}
