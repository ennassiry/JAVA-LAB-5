
package com.example.ex2;

// Classe principale du programme.
public class Main_exercice2 {

    // Point de départ de l'exécution du programme Java.
    public static void main(String[] args) {

        // ==================== 1. CRÉATION DU ZOO ====================

        // Crée un objet Zoo.
        // Le tableau interne peut initialement contenir 5 animaux.
        Zoo monZoo = new Zoo();


        // ==================== 2. AJOUT DE 6 ANIMAUX ====================

        // Ajoute un mammifère au zoo.
        // new Mammifere(...) crée un nouvel objet Mammifere.
        // Cet objet peut être ajouté car Mammifere hérite de Animal.
        monZoo.ajouterAnimal(
            new Mammifere("Lion", 5, "Dorée")
        );

        // Ajoute un oiseau au zoo.
        monZoo.ajouterAnimal(
            new Oiseau("Aigle", 3, 2.3)
        );

        // Ajoute un reptile au zoo.
        monZoo.ajouterAnimal(
            new Reptile("Crocodile", 12, "Épaisse")
        );

        // Ajoute un deuxième mammifère.
        monZoo.ajouterAnimal(
            new Mammifere("Girafe", 7, "Tachetée")
        );

        // Ajoute un deuxième oiseau.
        monZoo.ajouterAnimal(
            new Oiseau("Perroquet", 2, 0.4)
        );

        // Ajoute un deuxième reptile.
        // À ce moment, le zoo contient 6 animaux.
        // Le tableau initial ayant 5 cases, il a été agrandi
        // automatiquement lors de l'ajout du sixième animal.
        monZoo.ajouterAnimal(
            new Reptile("Serpent", 4, "Lisse")
        );


        // ==================== 3. AFFICHAGE DES ANIMAUX ====================

        // Affiche le nombre d'animaux et leurs informations.
        // La méthode toString() adaptée à chaque type réel
        // est appelée automatiquement.
        monZoo.afficherTous();

        // Affiche une ligne vide pour séparer les résultats.
        System.out.println();


        // ==================== 4. ACTION SPÉCIFIQUE : MAMMIFÈRE ====================

        // Déclare une référence de type Animal.
        // L'objet réellement créé est un Mammifere.
        Animal a1 = new Mammifere("Éléphant", 10, "Grise");

        // Ajoute l'éléphant au zoo.
        monZoo.ajouterAnimal(a1);

        // Casting : convertit la référence Animal en Mammifere.
        // Cela permet d'appeler la méthode allaiter(),
        // qui existe dans Mammifere mais pas dans Animal.
        ((Mammifere) a1).allaiter();


        // ==================== 5. ACTION SPÉCIFIQUE : OISEAU ====================

        // La référence est de type Animal,
        // mais l'objet réellement créé est un Oiseau.
        Animal a2 = new Oiseau("Autruche", 6, 1.8);

        // Ajoute l'autruche au zoo.
        monZoo.ajouterAnimal(a2);

        // Casting : convertit la référence Animal en Oiseau.
        // Cela permet d'appeler la méthode voler(),
        // qui est déclarée dans la classe Oiseau.
        ((Oiseau) a2).voler();
    }
}
