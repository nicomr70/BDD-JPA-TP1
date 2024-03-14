package fr.uga.l3miage.tp1.exo1.models;

@Entity
public class ClassTestJPATwo {
    @Id
    private String myIdTest;

    @Column(unique)
    private String testName;

    @Column(precision = 1)
    private Double jpaSeed;

    @Column()
    private Date savedAt;
}
