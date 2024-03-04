### 1. En déclarant une classe comme ClassTestJPA
On observe qu'une table est créé dans la base de donnée et les propriétés de cette table ont leur nom en "snake_case".
### 2. les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo
* unique: défini la valeur de la colonne en mode unique
* precision: défini le nombre de chiffre après la virgule pour les nombres décimaux

### 3. Role des annotations @Column
cette annotation permet de mapper l'attribut qui la possède
Elle défini de façon spécifique les propriétés d'un attribut dans la base de données.