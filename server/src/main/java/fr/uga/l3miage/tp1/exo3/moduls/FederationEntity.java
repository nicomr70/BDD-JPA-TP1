package fr.uga.l3miage.tp1.exo3.moduls;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "federation")
public class FederationEntity {

    @Id
    private Long id;

    private String name;

    private boolean isFageMembership;

    @OneToMany(mappedBy = "federation")
    private List<AssociationEntity> associations;

}
