Question 1 : 
    Au même titre que les 2 premieres classes (BikeEntity et CarEntity), la classe ClassTestJPA bien qu'elle n'a pas l'annotation "@Table" pour donner son nom, a quand même été crée avec le nom de classe en snake_case.
Question 2 : Les propriétés ajoutées dans les @Column de la classe ClassTestJPATwo ont pour effet:
    -precision : donne le nombre de chiffres à prendre après la virgule, dans notre cas 1 chiffre après la virgule.
    -unique : (= true) indique que la valeur de la colonne doit être unique pour chaque enregristrement.
Question 3 : L'utilité de l'annotation @Column depend du mode dans lequel l'on est:
    - En mode validate : il est obligatoire en terme de documentation et de lisibilité.
    - En mode create : il n'est necessaire que si l'on souhaite ajouter des particularité à la classe.
    
    