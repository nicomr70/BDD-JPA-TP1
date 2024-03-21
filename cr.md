Fait en trinôme avec :
	- Badzi Mohamed
	- Alsabr Ibrahim
	- Grasia Angelica

Par rapport à ClassTestJPATwo, ClassTestJPA ne présente qu'une contrainte PK, tandis que JPATwo présente deux contraintes : une PK et une contrainte d'unicité pour testName, ajoutée grâce à l'annotation @Column avec l'attribut unique=true. Ainsi, il est nécessaire d'utiliser les annotations @Column lorsque l'on veut spécifier à JPA une construction spécifique de la colonne correspondant à l'attribut en question. Grâce à l'annotation @Column, on peut spécifier le nom de la colonne, le trait d'unicité, la taille maximale, etc.
