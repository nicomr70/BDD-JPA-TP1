package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "session")
public class Session {
    @Id
    @Column(name = "idSession")
    private UUID idSession;

    @Column(name = "lastCommand")
    private String lastCommand;
    @Column(name = "currentDir")
    private String currentDir;
    @Column(name = "lock")
    private boolean lock;

    @OneToOne(mappedBy = "session")
    private User user;
}