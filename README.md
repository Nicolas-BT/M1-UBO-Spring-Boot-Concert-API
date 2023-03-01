# M1 ILIADE Projet Spring, Concert - API

## Groupe
BERNICOT Nicolas, BIDEAU Mona, BEAUFORT Pierre-André

## Ressources
url : https://traveling-seaplane-72f.notion.site/TP-API-M1-INFORMATIQUE-SPRING-BOOT-5b267fc667374ad3a5f5a528e7b2ff1c

## Installation
### I - Lier à sa base de données
Dans le fichier **application.propertites**, modifier les identifiants et url du serveur mysql
En utilisant les votres donc celui de l'université ou WAMP tel que :

##### Exemple pour université:
```
spring.datasource.url=jdbc:mysql://obiwan.univ-brest.fr/zfm1-zjeanbon_2
spring.datasource.username=zjeanbon
spring.datasource.password=monMotDePasse
```

##### Exemple pour WAMP
```
spring.datasource.url=jdbc:mysql://localhost:3306/maBase
spring.datasource.username=root
spring.datasource.password=
```
### II - Lancer l'application et l'utiliser
Il suffit de lancer l'application **App**

### Erreur possible lors du premier lancement 
Il est possible que lors du premier lancement des erreurs s'affiche, cela peux etre 2 erreurs:
-la première : vous n'avez pas modifier application.properties ( et le serveur n'arrive pas à ce connecter)
-la seconde : mettre en commentaires les @Mappings dans tous les mapper, relancer, arreter et enlever les commentaires des @Mapping et lancer ! 

Ensuite, vous pouvez utiliser Postman afin de faire les commandes GET / POST / DELETE en localhost sur le port 8080
Exemples de GET :


[GET] - URL : http://localhost:8080/tconcerts

> Renvoie tout les concerts

[GET] - URL : http://localhost:8080/tconcerts/1

> Renvoie le concert de l'id 1

Exemple de POST :

[POST] - URL : http://localhost:8080/tconcerts
```
data :
    {
        "nom": "Concert de rock",
        "date": "2023-03-15",
        "heure": "22:30:00",
        "duree": "01:00:00",
        "groupe": {
            "grp_id": 1,
            "grp_nom": "Les Beatles",
            "prenom": "John",
            "pseudo": "Lennon",
            "ville": "Liverpool",
            "age": "30",
            "nb": "4"
        },
        "soiree": {
            "soi_id": 1,
            "nom": "Concert des Beatles",
            "salleconcert": {
                "sac_id": 1,
                "nom": "Le Zénith",
                "adresse": "211 Avenue Jean Jaurès, 75019 Paris",
                "capacite": 6000,
                "ges_nom": "Live Nation",
                "ges_association": "Association pour la gestion de la salle de concerts"
            }
        }
    }
```
> Renvoie le concert crée si le concert + son id à bien été ajouté, sinon une erreur

Exemple de DELETE :

[DELETE] - URL : http://localhost:8080/tconcerts/5

> Renvoie "True" à bien été supprimé, sinon une erreur
