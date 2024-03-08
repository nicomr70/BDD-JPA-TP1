package fr.uga.l3miage.tp1.exo2.models;


import javax.persistence.*;
import java.util.UUID;

@Table(name = "Session")
@Entity
public class SessionEntity {

    @Id
    @Column(name = "idSession")
    private UUID idSession;


    @Column(name = "lastCommand")
    private String lastCommand;

    @Column(name = "currentDir")
    private String currentDir;

    @Column(name = "lock")
    private boolean lock;

    @OneToOne
    private UserEntity userEntityId;
}
