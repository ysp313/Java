# CHECKPOINT 2

Le checkpoint est un moyen de t'autoévaluer, de te montrer de quoi tu es capable.

**Conseils :**

* ne reste pas bloqué, passe au point suivant, ou demande à ton formateur !
* la limite de temps existe, mais tu peux continuer à travailler plus tard si tu veux reprendre des choses à tête reposée
* terminé ou non, pense à tout commiter et pousser

## I. Récupération et initialisation du projet

### 1. Dépôt local

Clone le contenu de ce dépôt en local. **Ne fait pas de Fork !**

Dans ton dépôt local, crée une branche ayant le format suivant : la ville de ton cursus en minuscule, ton prénom et nom sans accents ni espaces, séparés par des tirets, avec le nom en majuscule. Exemple : pour **Éloïse Durant**, crée une branche **lyon-eloise-DURANT**.

**Passe sur cette branche pour la suite du *checkpoint* !**

> Conseil : ajoute et envoie tes modifications en local après chaque exercice, pour éviter les mauvaises surprises

## II. Quiz

Tu trouveras un fichier `Quiz.java` à la racine de ton dépôt local : compile et exécute le.

Réponds aux questions, cela va générer un fichier `quiz.txt`.

Tu peux ensuite éditer le fichier manuellement pour corriger tes réponses.

> Merci de répondre honnêtement, sans t'aider d'Internet !

## III. Algorithmes

Tu trouveras un package `src/main/java/algo` dans la racine de ton dépôt local, tu pourras y réaliser les algorithmes suivants :

### 1. Les chaînes de caractères

Dans la classe `StringTraining` :

#### Reverse string

Crée une méthode statique `reverseWord` qui renverse une chaîne passée en argument.

#### Censor

Il est des mots que l'on ne doit pas dire...

Crée une méthode statique nommée `censor`, qui prends en paramètre deux chaînes de caractères et qui en renvoie une troisième : la copie du premier paramètre où toutes les occurrences du second paramètre ont été remplacées par des caractères '*', à l'exception du premier caractère.

Exemples :
* censor("Voldemort is back","voldemort") 
    * => "V******** is back"

* censor("En variant le ton, – par exemple, tenez : Agressif : « Moi, monsieur, si j’avais un tel nez, il faudrait sur-le-champ que je me l’amputasse ! »","nez") 
    * => "En variant le ton, – par exemple, ten** : Agressif : « Moi, monsieur, si j’avais un tel n**, il faudrait sur-le-champ que je me l’amputasse ! »"

#### Pour tester

``` bash
./tester.sh StringTraining
```

### 2. Les tableaux

Dans la classe `ArrayTraining` :

#### Reverse first and last

Crée une méthode statique `reverseFirstAndLast` qui inverse la première et la dernière valeur d'un tableau passé en argument.

#### Count by interval

On cherche à répartir des collégiens par groupes de niveaux, en fonction de leurs notes.

On construit 4 groupes :

* Groupe 0 : ceux ayant moins de 7
* Groupe 1 : ceux ayant entre 7 (inclu) et 10 (exclu)
* Groupe 2 : ceux ayant entre 10 (inclu) et 13 (exclu)
* Groupe 3 : ceux ayant entre 13 (inclu) et 20 (inclu)

Crée une méthode statique `countByInterval`, qui prend en paramètre un tableau de notes comprises entre 0 (inclus) et 20 (inclus) et qui renvoie un tableau de 4 entiers contenant dans les cases 0, 1, 2 et 3 les effectifs des groupes 0, 1, 2 et 3.

#### Pour tester

``` bash
./tester.sh ArrayTraining
```

### 3. Les objets

Compléter les classes `Person` et `Article` en suivant les commentaires contenus dans les fichiers.

#### Pour tester

``` bash
./tester.sh Article
```

## IV. Modélisation
     
Effectue un MCD **sur papier** en suivant l'énoncé ci-dessous :

Tu dois modéliser la base de données d'un site de vente de livres audio : ces derniers sont caractérisés par un auteur, un titre, une durée et un prix. Un auteur a un nom et une biographie et il peut avoir écrit plusieurs livres. Un livre audio peut être acheté par plusieurs utilisateurs. Un utilisateur possède une adresse email et un mot de passe et peut acheter un ou plusieurs livres audios : la date d'achat doit être enregistrée.

Prend le MCD en photo et dépose l'image sous le nom `audiobook.jpg` dans le dossier `database`.

## V. Requêtes SQL

Importe dans MySQL le contenu du fichier `database/wizards_n_potions.sql`.

![EER Diagram](https://image.noelshack.com/fichiers/2019/45/3/1573030901-wizardsnpotions.png)

Ensuite, modifie la classe `src/checkpoint/SQLTraining.java` afin d'y ajouter les requêtes suivantes :

1. Sélectionner le titre de toutes les catégories
2. Sélectionner le nom et la puissance des potions dont la puissance est égale à 4
3. Sélectionner le nom des ingrédients dont le nom commence par "Angel"
4. Sélectionner le nom et la puissance des potions dont le nom contient le mot "Elixir" et la puissance est inférieure ou égale à 6
5. Sélectionner la valeur maximale de puissance d'une potion, que tu nommeras maxPower
6. Sélectionner les nom des potions de la catégorie dont le titre est "Illusion"
7. Sélectionner le nom de la potion et le titre de sa catégorie pour les potions dont la puissance est supérieure à 7
8. Sélectionner le nom des ingrédients (sans doublons) étant en quantité égale à 10 dans au moins une potion
9. Sélectionner le nom des ingrédients n'étant dans aucune potion
10. Sélectionner le nom des potions et de leurs ingrédients, pour toutes les potions de la catégorie "Alteration"

Tu peux tester que tout fonctionne avec la commande :
```bash
./tester.sh SQLTraining
```

## VI. Spring Boot

Dans le package `src/main/java/spring`, tu vas devoir créer une application *Spring Boot* qui effectue le traitement suivant :

* sur la page d'accueil du site, un formulaire (*GET* vers la route `/student`) va demander le nom, prénom et l'âge de l'étudiant.
* sur la route `/student`, les nom, prénom et âge de l'étudiant vont apparaître.

Les *templates* sont déjà présent ici : `src/main/resources/templates` : tu n'as donc qu'à créer la route qui reçoit les données du formulaire de `index.html` et qui les transmets au template `student.html` (que tu devras modifier en conséquence). 

## VII. Finalisation

Envoie les modifications de ta branche locale et pousse ces modifications sur le dépôt distant.

Dans GitHub, vérifie que la branche existe et que tes modifications sont bien présentes.

Tu peux revenir dans Odyssey et partager le lien vers ta branche sur GitHub.