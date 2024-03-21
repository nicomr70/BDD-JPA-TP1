package fr.uga.l3miage.tp1.exo2.models;


import javax.persistence.*;
import java.util.UUID;

public class SessionEntity {
    //PK - FK
    @Id
    private UUID idSession;
    private String lastCommand;
    private String currentDir;
    private boolean lock;
    @OneToOne(mappedBy = "session")
    private UserEntity user;
}
