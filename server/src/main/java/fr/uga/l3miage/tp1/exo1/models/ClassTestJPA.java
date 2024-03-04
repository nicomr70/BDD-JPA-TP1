package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.*;
import java.time.LocalDate;
import fr.uga.l3miage.tp1.exo1.enums.PowerType;

@Entity
public class ClassTestJPA {
    @Id
    private String myIdTest;

    private Double jpaSeed;

    private LocalDate savedAt;

    private PowerType powerType;
}