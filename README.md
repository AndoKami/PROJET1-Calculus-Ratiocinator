# Projet Calculus

Ce projet est une application Java qui implémente un service de calcul logique pour évaluer des affirmations. Il utilise Spring Boot et JUnit pour les tests unitaires.

## Structure du projet

- `src/main/java/com/example/projet1_Calculus/` : Contient le code source de l'application.
  - `Model/` : Contient les modèles de données.
  - `Service/` : Contient le service `Logique` pour évaluer les affirmations.
- `src/test/java/com/example/projet1_Calculus/` : Contient les tests unitaires pour le service `Logique`.

## Fonctionnalités

Le service `Logique` permet d'évaluer des affirmations logiques simples et complexes. Il prend en charge les opérateurs logiques `et`, `ou` et `donc`. Il peut également gérer les affirmations complexes avec des opérateurs logiques imbriqués.

## Prérequis

- Java 21
- Maven

## Installation

1. Clone le dépôt GitHub : https://github.com/AndoKami/PROJET1-Calculus-Ratiocinator
2. Accède au répertoire du projet : cd PROJET1-Calculus-Ratiocinator

## Utilisation

Une fois l'application lancée, tu peux utiliser un client HTTP comme Postman pour envoyer des requêtes POST à l'URL `http://localhost:8080/api/evaluate` avec les paramètres nécessaires pour évaluer les affirmations.

Exemple de corps de requête POST (format x-www-form-urlencoded) :
- `statement1`: "Lou est pauvre"
- `statement2`: "Lou est généreux"
- `operator`: "et"

## Tests

Le projet inclut des tests unitaires avec JUnit pour vérifier le bon fonctionnement du service `Logique`. Pour exécuter les tests, utilise la commande Maven suivante : nvm test
