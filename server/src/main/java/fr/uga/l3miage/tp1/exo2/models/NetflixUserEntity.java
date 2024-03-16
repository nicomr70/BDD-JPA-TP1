package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "netflix_user")
public class NetflixUserEntity {

    @Id
    @Column(
            name = "id"
    )
    private Long id;

    @Column(
            name = "uuid"
    )
    private String uuid;

    @Column(
            name = "lastname"
    )
    private String lastname;

    @Column(
            name = "firstname"
    )
    private String firstname;

    @Column(
            name = "sex",
            length = 2
    )
    private String sex;

    @Column(
            name = "birthDate"
    )
    private LocalDate birthDate;
}
