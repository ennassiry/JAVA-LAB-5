
package com.example.ex2;

// La classe Mammifere hérite de la classe Animal.
// Animal est la classe mère et Mammifere est la classe fille.
public class Mammifere extends Animal {

    // ==================== 1. ATTRIBUT SPÉCIFIQUE ====================

    // Stocke la couleur de la fourrure du mammifère.
    // private signifie que cet attribut est accessible directement
    // uniquement à l'intérieur de la classe Mammifere.
    private String couleurFourrure;


    // ==================== 2. LE CONSTRUCTEUR ====================

    // Constructeur de la classe Mammifere.
    // Il reçoit le nom, l'âge et la couleur de la fourrure.
    public Mammifere(String nom, int age, String couleurFourrure) {

        // Appelle le constructeur de la classe mère Animal.
        // Initialise les attributs hérités : nom, age et id.
        // super(...) doit être la première instruction du constructeur.
        super(nom, age);

        // Initialise l'attribut spécifique au mammifère.
        // this.couleurFourrure désigne l'attribut de l'objet actuel.
        this.couleurFourrure = couleurFourrure;
    }


    // ==================== 3. LA MÉTHODE allaiter ====================

    // Méthode spécifique à la classe Mammifere.
    // Elle représente l'allaitement des petits.
    public void allaiter() {

        // nom est hérité de la classe Animal.
        // Il est accessible ici car il est déclaré protected.
        // Affiche le nom du mammifère suivi d'un message.
        System.out.println(nom + " allaite ses petits.");
    }


    // ==================== 4. REDÉFINITION DE toString ====================

    // @Override indique que cette méthode redéfinit
    // la méthode toString() héritée de la classe Animal.
    @Override
    public String toString() {

        // super.toString() récupère les informations générales
        // de l'animal : identifiant, nom et âge.
        // On ajoute ensuite la couleur de la fourrure.
        return super.toString() +
               " {Mammifere, fourrure=" + couleurFourrure + "}";
    }
}
