
package com.example.ex4;

public class Main_exercice4{

    public static void main(String[] args) {

        // ==================== CRÉATION DE LA BIBLIOTHÈQUE ====================

        // Création d'un objet Biblioteque avec une capacité initiale de 5 documents.
        // Le nombre 5 représente probablement la capacité initiale de stockage.
        Biblioteque bib = new Biblioteque(5);


        // ==================== CRÉATION D'UN DOCUMENT ====================

        // Création d'un document simple.
        // 01 : numéro d'enregistrement du document.
        // "48 lows of power" : titre du document.
        Document d = new Document(01, "48 lows of power");

        // Ajout du document à la bibliothèque.
        // La méthode ajouter() permet d'enregistrer le document dans la bibliothèque.
        bib.ajouter(d);

        // Cette instruction, si elle est décommentée, affiche les informations
        // du document en utilisant généralement la méthode toString().
        // System.out.println(d);


        // ==================== CRÉATION D'UN ROMAN ====================

        // Paramètres du constructeur de Roman :
        // int numEnr : numéro d'enregistrement.
        // String titre : titre du roman.
        // String auteur : nom de l'auteur.
        // int nbpage : nombre de pages.
        // double prix : prix du roman.

        Roman r = new Roman(
            02,
            "atomic_habits",
            "jamces_clere",
            361,
            200
        );

        // Ajout du roman à la bibliothèque.
        // Si Roman hérite de Document, il peut être ajouté à une collection
        // qui accepte les objets de type Document.
        bib.ajouter(r);


        // ==================== CRÉATION D'UNE REVUE ====================

        // Paramètres du constructeur de Revue :
        // int numEnr : numéro d'enregistrement.
        // String titre : titre de la revue.
        // String mois : mois de publication.
        // int annee : année de publication.

        Revue revue = new Revue(
            03,
            "Maroc",
            "Octebre",
            2008
        );

        // Ajout de la revue à la bibliothèque.
        bib.ajouter(revue);


        // ==================== AFFICHAGE DES DOCUMENTS ====================

        // Affichage de tous les documents enregistrés dans la bibliothèque.
        // Si afficherTous() parcourt une collection de Document,
        // le polymorphisme permet d'afficher les informations spécifiques
        // de chaque type : Document, Roman ou Revue.
        bib.afficherTous();
    }
}
