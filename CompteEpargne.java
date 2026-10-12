
package com.example.ex1;

// CompteEpargne hérite de la classe Compte.
// Il possède les caractéristiques d'un compte classique
// et ajoute une fonctionnalité : le calcul des intérêts.
public class CompteEpargne extends Compte {

    // Taux d'intérêt annuel exprimé en pourcentage.
    // Exemple : 2.5 représente un taux de 2,5 %.
    private double tauxInteret;


    // ==================== CONSTRUCTEUR ====================

    // Constructeur du compte épargne.
    // soldeInitial : montant déposé à la création du compte.
    // tauxInteret : pourcentage utilisé pour calculer les intérêts.
    public CompteEpargne(double soldeInitial, double tauxInteret) {

        // Appelle le constructeur de la classe mère Compte.
        // Cela initialise le numéro du compte et son solde.
        super(soldeInitial);

        // Initialise le taux d'intérêt propre au compte épargne.
        this.tauxInteret = tauxInteret;
    }


    // ==================== APPLICATION DES INTÉRÊTS ====================

    // Calcule les intérêts et les ajoute au solde du compte.
    public void appliquerInterets() {

        // Calcule les intérêts à partir du solde actuel.
        // Formule :
        // intérêts = solde × taux d'intérêt / 100
        double interets = solde * tauxInteret / 100.0;

        // Ajoute les intérêts calculés au solde.
        // Équivalent à : solde = solde + interets;
        solde += interets;

        // Affiche le montant des intérêts ajoutés.
        System.out.println(
            "CompteEpargne #" + getNumero()
            + " : intérêts de " + interets
        );
    }


    // ==================== AFFICHAGE DES INFORMATIONS ====================

    // @Override indique que cette méthode redéfinit
    // la méthode afficherDetails() de la classe Compte.
    // Elle affiche également le taux d'intérêt du compte épargne.
    @Override
    public void afficherDetails() {

        System.out.println(
            "CompteEpargne #" + getNumero()
            + " — solde = " + solde
            + ", taux = " + tauxInteret + "%"
        );
    }
}
