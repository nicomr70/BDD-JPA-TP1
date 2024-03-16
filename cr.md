compte-rendu

Différence entre mode validate et mode create : 
                            validate              create
ddl-auto                    validate            create-drop
annotation @Table              yes                  no
              

@OneToOne undirectionnel => écrire l'annotation @OneToOne dans l'un des deux classes
@OneToOne bidirectionnel => écrire l'annotation @OneToOne dans les deux classes, et ajouter un attribut mappedBy="nom_de_la_classe_il_est_écrit" dans l'un des deux classes où on va écrire un variable qui a du type de l'autre.
