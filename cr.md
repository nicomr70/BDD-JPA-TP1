`Q1:` Quand on declare une classe comme ClassTestJPA avec l'annotation @Entity, le JPA crée une table correspondante dans la base de données. Le nom de la table sera, par défaut, le nom de la classe. Chaque champ de la classe deviendra une colonne dans la table. Le champ myIdTest étant annoté avec @Id, il sera la clé primaire de la table.  <br/> <br/>
`Q2:` @Column(unique) sur la colonne testName indique que chaque valeur dans cette colonne doit être unique.
<br/> @Column(precision = 1) sur la colonne jpaSeed indique que les valeurs dans cette colonne doivent avoir une précision décimale de 1. Cela signifie que les valeurs seront arrondies au premier chiffre décimal.
<br/> @Column() sur la colonne savedAt n'a aucun effet spécial, car aucun attribut supplémentaire n'a été spécifié.<br/>
`Q3:` L'annotation @Column est utile quand on veut personnaliser le mappage standard entre les champs d'entité et les colonnes de base de données.
