package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
class ClassTestJPATwo {
    @Id
    private String myIdTest;

    @Column(unique = true)
    private String testName;

    @Column(precision = 1)
    private Double jpaSeed;

    @Column()
    private Date savedAt;
}
