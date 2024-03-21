package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table
public class UserEntity {
    @Id
    private Long idUser ;
    @Column(updatable = false)
    private boolean SSO ;
    private OffsetDateTime lastConnexion ;
    @OneToOne
    private SessionEntity session ;

}
