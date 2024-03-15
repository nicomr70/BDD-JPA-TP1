package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
public class SessionEntity {
    @Id
    private UUID idSession;
    private String lasCommand;
    private String currentDir;
    private Boolean lock;

    @OneToOne
    private UserEntity user;
}
