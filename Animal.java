
package com.example.ex2;

// Déclaration de la classe Animal.
// Cette classe peut servir de classe mère pour d'autres classes,
// par exemple Chien, Chat ou Oiseau.
public class Animal {

    // ==================== 1. LES ATTRIBUTS ====================

    // static : variable partagée par tous les objets Animal.
    // Elle compte le nombre d'animaux créés.
    private static int compteur = 0;

    // Identifiant unique de chaque animal.
    // final : l'identifiant ne peut être affecté qu'une seule fois.
    private final int id;

    // protected : accessible dans cette classe,
    // dans les classes filles et dans le même package.
    protected String nom;

    // Stocke l'âge de l'animal.
    // protected permet également aux classes filles d'y accéder.
    protected int age;


    // ==================== 2. LE CONSTRUCTEUR ====================

    // Le constructeur est appelé lors de la création d'un animal.
    // Il reçoit le nom et l'âge comme paramètres.
    public Animal(String nom, int age) {

        // Incrémente le compteur puis attribue sa valeur à id.
        // Exemple : le premier animal aura l'identifiant 1.
        this.id = ++compteur;

        // Initialise l'attribut nom avec la valeur reçue.
        // this.nom désigne l'attribut de l'objet actuel.
        this.nom = nom;

        // Initialise l'attribut age.
        this.age = age;
    }


    // ==================== 3. LES GETTERS ====================

    // Retourne l'identifiant de l'animal.
    public int getId() {
        return id;
    }

    // Retourne le nom de l'animal.
    public String getNom() {
        return nom;
    }

    // Retourne l'âge de l'animal.
    public int getAge() {
        return age;
    }


    // ==================== 4. LA MÉTHODE seDeplacer ====================

    // Décrit le déplacement de l'animal.
    // Cette méthode peut être redéfinie dans les classes filles.
    public void seDeplacer() {

        // Affiche le nom de l'animal suivi d'un message.
        // Exemple : "Rex se déplace."
        System.out.println(nom + " se déplace.");
    }


    // ==================== 5. LA MÉTHODE toString ====================

    // @Override indique que l'on redéfinit la méthode toString()
    // héritée de la classe Object.
    // Elle permet d'afficher les informations de l'animal.
    @Override
    public String toString() {

        // Construit une chaîne contenant l'identifiant,
        // le nom et l'âge de l'animal.
        return "Animal[id=" + id +
               ", nom=" + nom +
               ", age=" + age + "]";
    }
}
