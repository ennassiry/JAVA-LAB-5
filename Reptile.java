
package com.example.tp1;

// extends Animal signifie que Reptile hérite de la classe Animal.
// Reptile est donc une classe fille et Animal est sa classe mère.
public class Reptile extends Animal {

    // ==================== 1. ATTRIBUT SPÉCIFIQUE ====================

    // Attribut propre aux reptiles.
    // private signifie qu'il est accessible directement
    // uniquement à l'intérieur de la classe Reptile.
    private String typeEcailles;


    // ==================== 2. LE CONSTRUCTEUR ====================

    // Constructeur de Reptile.
    // Il reçoit le nom, l'âge et le type d'écailles du reptile.
    public Reptile(String nom, int age, String typeEcailles) {

        // super(nom, age) appelle le constructeur de la classe mère Animal.
        // Il initialise les attributs nom, age et l'identifiant id.
        // super(...) doit être la première instruction du constructeur.
        super(nom, age);

        // Initialise l'attribut spécifique au reptile.
        // this.typeEcailles désigne l'attribut de l'objet courant.
        this.typeEcailles = typeEcailles;
    }


    // ==================== 3. MÉTHODE seChauffer ====================

    // Méthode spécifique aux reptiles.
    // Elle décrit le comportement de cet animal.
    public void seChauffer() {

        // nom est hérité de la classe Animal.
        // Il est accessible ici car il est déclaré protected.
        System.out.println(nom + " se chauffe au soleil.");
    }


    // ==================== 4. REDÉFINITION DE toString ====================

    // @Override indique que cette méthode redéfinit
    // la méthode toString() héritée de la classe Animal.
    @Override
    public String toString() {

        // super.toString() récupère les informations générales
        // de l'animal : identifiant, nom et âge.
        // On ajoute ensuite les informations propres au reptile.
        return super.toString() +
               " {Reptile, écailles=" + typeEcailles + "}";
    }
}
