package fr.uga.l3miage.tp1.exo1.models;

@Entity
public class ClassTestJPA {
    @Id
    private String myIdTest;

    private Double jpaSeed;

    private LocalDate savedAt;

    private PowerType powerType;
}
