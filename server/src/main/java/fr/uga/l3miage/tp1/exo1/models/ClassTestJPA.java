package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.PowerType;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class ClassTestJPA {
    @Id
    private String myIdTest;

    private Double jpaSeed;

    private LocalDate savedAt;

    private PowerType powerType;
}
