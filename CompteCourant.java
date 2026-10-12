
package com.example.ex1;

// CompteCourant hérite de la classe Compte.
// Il récupère ses attributs et ses méthodes accessibles,
// notamment solde, getNumero(), deposer() et afficherDetails().
public class CompteCourant extends Compte {

    // Montant maximal du découvert autorisé.
    // Par exemple, si cette valeur est 500, le compte peut
    // avoir un solde négatif jusqu'à -500.
    private double decouvertAutorise;


    // ==================== CONSTRUCTEUR ====================

    // Constructeur du compte courant.
    // soldeInitial : solde disponible à la création du compte.
    // decouvertAutorise : limite maximale du découvert.
    public CompteCourant(double soldeInitial, double decouvertAutorise) {

        // Appelle le constructeur de la classe mère Compte.
        // Il initialise le numéro du compte et son solde.
        super(soldeInitial);

        // Initialise la limite de découvert autorisée.
        this.decouvertAutorise = decouvertAutorise;
    }


    // ==================== REDÉFINITION DE RETIRER ====================

    // @Override indique que cette méthode redéfinit
    // la méthode retirer() héritée de la classe Compte.
    // Contrairement à un compte classique, le compte courant
    // peut effectuer un retrait qui rend le solde négatif,
    // dans la limite du découvert autorisé.
    @Override
    public void retirer(double montant) {

        // Vérifie deux conditions :
        // 1. Le montant du retrait doit être strictement positif.
        // 2. Le solde et le découvert autorisé doivent couvrir le retrait.
        if (montant > 0 && solde + decouvertAutorise >= montant) {

            // Déduit le montant retiré du solde.
            // Le solde peut devenir négatif si le découvert est utilisé.
            solde -= montant;

            // Affiche une confirmation du retrait.
            System.out.println(
                "CompteCourant #" + getNumero()
                + " : retrait de " + montant
            );

        } else {

            // Affiche un message si le montant est invalide
            // ou si le retrait dépasse la limite du découvert.
            System.out.println(
                "CompteCourant #" + getNumero()
                + " : retrait impossible (découvert max dépassé)"
            );
        }
    }


    // ==================== REDÉFINITION DE AFFICHERDETAILS ====================

    // Redéfinit afficherDetails() afin d'afficher les informations
    // propres au compte courant, notamment le découvert autorisé.
    @Override
    public void afficherDetails() {

        // getNumero() récupère le numéro hérité de Compte.
        // solde est accessible directement grâce au mot-clé protected.
        System.out.println(
            "CompteCourant #" + getNumero()
            + " — solde = " + solde
            + ", découvert autorisé = " + decouvertAutorise
        );
    }
}
