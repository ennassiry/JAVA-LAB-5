package com.example.ex1;


package com.example.tp;

public class Compte {

    // Attribut statique partagé par tous les objets de la classe Compte.
    // Il compte le nombre de comptes créés et permet de générer
    // automatiquement un numéro unique pour chaque nouveau compte.
    private static int compteur = 0;

    // Numéro unique du compte.
    // final signifie que cette variable ne peut être affectée
    // qu'une seule fois, ici lors de la construction de l'objet.
    private final int numero;

    // Solde actuel du compte bancaire.
    // protected permet à la classe Compte et à ses sous-classes
    // d'accéder directement à cet attribut.
    protected double solde;


    // ==================== CONSTRUCTEUR ====================

    // Constructeur appelé lors de la création d'un compte.
    // soldeInitial représente le montant disponible au départ.
    public Compte(double soldeInitial) {

        // Incrémente le compteur, puis affecte sa nouvelle valeur
        // au numéro du compte.
        // Exemple : le premier compte reçoit le numéro 1,
        // le deuxième le numéro 2, etc.
        this.numero = ++compteur;

        // Initialise le solde avec le montant fourni.
        this.solde = soldeInitial;
    }


    // ==================== ACCESSEURS (GETTERS) ====================

    // Retourne le numéro du compte.
    public int getNumero() {
        return numero;
    }

    // Retourne le solde actuel du compte.
    public double getSolde() {
        return solde;
    }


    // ==================== DÉPÔT D'ARGENT ====================

    // Permet d'ajouter de l'argent au compte.
    // Le montant doit être strictement positif.
    public void deposer(double montant) {

        // Vérifie que le montant du dépôt est valide.
        if (montant > 0) {

            // Ajoute le montant au solde actuel.
            // Équivalent à : solde = solde + montant;
            solde += montant;

            // Affiche une confirmation du dépôt.
            System.out.println(
                "Compte #" + numero + " : dépôt de " + montant
            );
        }
    }


    // ==================== RETRAIT D'ARGENT ====================

    // Permet de retirer de l'argent du compte.
    // Le retrait est accepté uniquement si :
    // 1. Le montant est strictement positif.
    // 2. Le solde est suffisant.
    public void retirer(double montant) {

        // L'opérateur && signifie « ET » :
        // les deux conditions doivent être vraies.
        if (montant > 0 && solde >= montant) {

            // Soustrait le montant retiré du solde.
            solde -= montant;

            // Affiche une confirmation du retrait.
            System.out.println(
                "Compte #" + numero + " : retrait de " + montant
            );

        } else {

            // Ce message apparaît si le montant est invalide
            // ou si le solde est insuffisant.
            System.out.println(
                "Compte #" + numero
                + " : retrait impossible (solde insuffisant)"
            );
        }
    }


    // ==================== AFFICHAGE DES INFORMATIONS ====================

    // Affiche le numéro et le solde actuel du compte.
    public void afficherDetails() {
        System.out.println(
            "Compte #" + numero + " — solde = " + solde
        );
    }
}
