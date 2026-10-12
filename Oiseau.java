
package com.example.ex2;

// extends Animal signifie que Oiseau hérite de la classe Animal.
// Animal est la classe mère et Oiseau est la classe fille.
public class Oiseau extends Animal {

    // ==================== 1. ATTRIBUT SPÉCIFIQUE ====================

    // Représente l'envergure des ailes de l'oiseau, en mètres.
    // private signifie que cet attribut est accessible directement
    // uniquement à l'intérieur de la classe Oiseau.
    private double envergure;


    // ==================== 2. LE CONSTRUCTEUR ====================

    // Constructeur de la classe Oiseau.
    // Il reçoit le nom, l'âge et l'envergure de l'oiseau.
    public Oiseau(String nom, int age, double envergure) {

        // Appelle le constructeur de la classe mère Animal.
        // Il initialise le nom, l'âge et l'identifiant de l'oiseau.
        // super(...) doit être la première instruction du constructeur.
        super(nom, age);

        // Initialise l'attribut propre à la classe Oiseau.
        // this.envergure désigne l'attribut de l'objet actuel.
        this.envergure = envergure;
    }


    // ==================== 3. LA MÉTHODE voler ====================

    // Méthode spécifique à la classe Oiseau.
    // Elle affiche un message indiquant que l'oiseau s'envole.
    public void voler() {

        // nom est hérité de la classe Animal.
        // Il est accessible ici car il est déclaré protected.
        // envergure représente la taille des ailes en mètres.
        System.out.println(
            nom + " s'envole avec une envergure de "
            + envergure + " m."
        );
    }


    // ==================== 4. REDÉFINITION DE toString ====================

    // @Override indique que cette méthode redéfinit
    // la méthode toString() héritée de la classe Animal.
    @Override
    public String toString() {

        // super.toString() récupère les informations générales :
        // identifiant, nom et âge.
        // On ajoute ensuite l'envergure propre à l'oiseau.
        return super.toString() +
               " {Oiseau, envergure=" + envergure + "}";
    }
}
