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
```mysql
spring.datasource.url=jdbc:mysql://obiwan.univ-brest.fr/zfm1-zjeanbon_2
spring.datasource.username=zjeanbon
spring.datasource.password=monMotDePasse
```

##### Exemple pour WAMP
```mysql
spring.datasource.url=jdbc:mysql://localhost:3306/maBase
spring.datasource.username=root
spring.datasource.password=
```
### II - Lancer l'application et l'utiliser
Il suffit de lancer l'application **App**

Ensuite, vous pouvez utiliser Postman afin de faire les commandes GET / POST / DELETE en localhost sur le port 8080
Exemples de GET :

[GET] - URL : http://localhost:8080/tconcerts

> Renvoie tout les concerts

[GET] - URL : http://localhost:8080/tconcerts/1

> Renvoie le concert de l'id 1

Exemple de POST :

[POST] - URL : http://localhost:8080/tconcerts
```
data :{
  "nom" : "Les Beatles"
  "date" : "12-05-2023"
  "heure" : "14:30:00"
  "duree" : "PT0.0000000044S"
  "groupeID" :{...}
  "soireeID" :{...}
}
```
> Renvoie le concert crée si le concert + son id à bien été ajouté, sinon une erreur

Exemple de DELETE :

[DELETE] - URL : http://localhost:8080/tconcerts/5

> Renvoie "True" à bien été supprimé, sinon une erreur
