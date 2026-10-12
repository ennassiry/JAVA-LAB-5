
package com.example.ex2;

// Déclaration de la classe Zoo.
// Cette classe permet de stocker et d'afficher plusieurs animaux.
public class Zoo {

    // ==================== 1. LES ATTRIBUTS ====================

    // Tableau qui stocke les références vers les animaux du zoo.
    // Animal est la classe mère : le tableau peut donc contenir
    // des objets Animal, Reptile, Oiseau ou Mammifere.
    private Animal[] animaux;

    // Nombre d'animaux réellement enregistrés dans le tableau.
    // Il ne représente pas la capacité totale du tableau.
    private int nbAnimaux;


    // ==================== 2. LE CONSTRUCTEUR ====================

    // Constructeur appelé lorsqu'on crée un nouveau zoo.
    public Zoo() {

        // Crée un tableau pouvant contenir initialement 5 animaux.
        this.animaux = new Animal[5];

        // Au départ, le zoo ne contient aucun animal.
        this.nbAnimaux = 0;
    }


    // ==================== 3. AJOUTER UN ANIMAL ====================

    // Ajoute un animal au zoo.
    // Le paramètre a peut référencer un Animal ou un objet
    // d'une classe fille, comme Oiseau ou Mammifere.
    public void ajouterAnimal(Animal a) {

        // Vérifie si le tableau est plein.
        if (nbAnimaux == animaux.length) {

            // Crée un tableau temporaire deux fois plus grand.
            // Exemple : capacité de 5 à 10 animaux.
            Animal[] tmp = new Animal[animaux.length * 2];

            // Copie les références des animaux dans le nouveau tableau.
            // animaux : tableau source.
            // 0 : indice de départ dans la source.
            // tmp : tableau de destination.
            // 0 : indice de départ dans la destination.
            // animaux.length : nombre de cases à copier.
            System.arraycopy(animaux, 0, tmp, 0, animaux.length);

            // Remplace l'ancien tableau par le nouveau.
            animaux = tmp;
        }

        // Enregistre l'animal dans la première case disponible.
        // nbAnimaux++ augmente ensuite le nombre d'animaux de 1.
        animaux[nbAnimaux++] = a;
    }


    // ==================== 4. AFFICHER TOUS LES ANIMAUX ====================

    // Affiche le nombre d'animaux et les informations de chacun.
    public void afficherTous() {

        // Affiche le nombre d'animaux enregistrés dans le zoo.
        System.out.println(
            "Le zoo contient " + nbAnimaux + " animaux :"
        );

        // Parcourt uniquement les cases contenant des animaux.
        // i commence à 0 et s'arrête avant nbAnimaux.
        for (int i = 0; i < nbAnimaux; i++) {

            // Affiche l'animal à la position i.
            // Java appelle automatiquement sa méthode toString().
            // Si l'objet est un Reptile, un Oiseau ou un Mammifere,
            // sa version redéfinie de toString() sera exécutée.
            System.out.println("  - " + animaux[i]);
        }
    }
}
