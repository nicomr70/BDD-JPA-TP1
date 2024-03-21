Compte Rendu 

Auteurs : ABDRAMAN Abakar 
          et 
          KHALIL Ibrahim Goukouni 
          et
          TRAN Thi Van Anh 


Exercice 1 : Définition d'une entity avec une table déjà existante

1 - Décrivez ce que vous observez en base de données lorsque l'on déclare une classe comme ClassTestJPA ?

Réponse : On observe que les attributs dans la base de données sont en camel case parce qu'on a pas mis le @Column et donc par défaut ils sont automatiquement en snake case 

2 - Quels sont les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo ? 

Réponse : Les noms des attributs qui seront dans la base de données seront ceux qu'on a donné dans le @Column 

À votre avis, dans quels cas est-il nécessaire de mettre les annotations @Column ?

Réponse : il est nécessaire quand on veut donner des noms propres à nous aux attributs d'une table. 