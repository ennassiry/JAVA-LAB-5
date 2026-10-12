
package com.example.tp;

public class Main {

    public static void main(String[] args) {

        // Création d'un objet Flotte.
        // La flotte permettra de regrouper plusieurs véhicules
        // et de réaliser des opérations sur l'ensemble des véhicules.
        Flotte flotte = new Flotte();

        // ==================== CRÉATION DES VÉHICULES ====================

        // Création d'une voiture classique.
        // Paramètres :
        // "Clio"                         : marque ou nom du véhicule
        // new Moteur("Essence", 75)      : moteur à essence de 75 chevaux
        // 50                             : quantité initiale de carburant
        // 5                              : valeur supplémentaire définie
        //                                par le constructeur de Voiture
        Voiture v1 = new Voiture(
            "Clio",
            new Moteur("Essence", 75),
            50,
            5
        );

        // Création d'un camion équipé d'un moteur diesel de 400 chevaux.
        // Les valeurs 200 et 20 dépendent de la définition du constructeur
        // de la classe Camion.
        Camion c1 = new Camion(
            "Volvo",
            new Moteur("Diesel", 400),
            200,
            20
        );

        // Création d'une moto équipée d'un moteur à essence
        // de 90 chevaux.
        // Les valeurs 20 et 1200 sont transmises au constructeur de Moto.
        Moto m1 = new Moto(
            "Harley",
            new Moteur("Essence", 90),
            20,
            1200
        );

        // Création d'une voiture électrique Tesla.
        // Son moteur est de type "Élec" et développe 300 chevaux.
        // La valeur 85 représente probablement la capacité de la batterie,
        // selon la définition du constructeur de VoitureElectrique.
        VoitureElectrique e1 = new VoitureElectrique(
            "Tesla",
            new Moteur("Élec", 300),
            85
        );

        // ==================== AJOUT À LA FLOTTE ====================

        // Ajout de la voiture à la flotte.
        flotte.ajouter(v1);

        // Ajout du camion à la flotte.
        flotte.ajouter(c1);

        // Ajout de la moto à la flotte.
        flotte.ajouter(m1);

        // Ajout de la voiture électrique à la flotte.
        flotte.ajouter(e1);

        // Affichage de tous les véhicules enregistrés dans la flotte.
        // Si la méthode afficherTous() utilise une méthode redéfinie
        // comme toString(), chaque véhicule peut afficher ses informations
        // selon sa classe réelle : Voiture, Camion, Moto, etc.
        flotte.afficherTous();

        // Affichage d'une ligne vide pour séparer les résultats.
        System.out.println();

        // ==================== SCÉNARIO DE CONDUITE : VOITURE ====================

        // Démarrage de la voiture.
        v1.demarrer();

        // La voiture parcourt 100 km.
        // La méthode rouler() peut notamment vérifier le carburant
        // disponible et mettre à jour la distance parcourue.
        v1.rouler(100);

        // Ajout de 20 unités de carburant à la voiture.
        // Le comportement exact dépend de l'implémentation de refuel().
        v1.refuel(20);

        // Tentative de parcourir 300 km supplémentaires.
        // Le résultat dépend du carburant restant et de la consommation
        // définie dans la classe Voiture.
        v1.rouler(300);

        // Affichage d'une ligne vide avant le scénario suivant.
        System.out.println();

        // ==================== SCÉNARIO DE CONDUITE : TESLA ====================

        // Démarrage de la voiture électrique.
        e1.demarrer();

        // La Tesla parcourt 200 km.
        // Cette opération peut diminuer le niveau de batterie.
        e1.rouler(200);

        // Recharge de 50 unités.
        // Selon la conception du programme, refuel() peut être redéfinie
        // dans VoitureElectrique pour recharger la batterie.
        e1.refuel(50);

        // Tentative de parcourir 300 km supplémentaires.
        e1.rouler(300);

        // ==================== BILAN FINAL ====================

        // Calcul et affichage de la distance totale parcourue
        // par les véhicules de la flotte.
        System.out.println(
            "Distance totale parcourue : "
            + flotte.distanceTotale()
            + " km"
        );
    }
}
