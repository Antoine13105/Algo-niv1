/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
    * Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

class Produit {
    String nom;
    double prix;

    Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
}

public class exoniv2 {

    static ArrayList<Produit> liste = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choix;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit");
            System.out.println("3. Afficher la liste et le total");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // consomme le retour à la ligne

            switch (choix) {
                case 1 -> ajouterProduit();
                case 2 -> supprimerProduit();
                case 3 -> afficherListe();
                case 4 -> System.out.println("Au revoir !");
                default -> System.out.println("Option invalide.");
            }
        } while (choix != 4);
    }

    static void ajouterProduit() {
        System.out.print("Nom du produit : ");
        String nom = scanner.nextLine();
        System.out.print("Prix du produit : ");
        double prix = scanner.nextDouble();
        scanner.nextLine(); // consomme le retour à la ligne
        liste.add(new Produit(nom, prix));
        System.out.println("Produit ajouté !");
    }

    static void supprimerProduit() {
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
            return;
        }

        afficherListe();
        System.out.print("Entrez le numéro du produit à supprimer : ");
        int index = scanner.nextInt();
        scanner.nextLine(); // consomme le retour à la ligne

        if (index >= 1 && index <= liste.size()) {
            Produit removed = liste.remove(index - 1);
            System.out.println("Produit '" + removed.nom + "' supprimé.");
        } else {
            System.out.println("Index invalide.");
        }
    }

    static void afficherListe() {
        if (liste.isEmpty()) {
            System.out.println("La liste est vide.");
            return;
        }

        double total = 0;
        System.out.println("\n--- Liste de Courses ---");
        for (int i = 0; i < liste.size(); i++) {
            Produit p = liste.get(i);
            System.out.printf("%d. %s - %.2f €\n", i + 1, p.nom, p.prix);
            total += p.prix;
        }
        System.out.printf("Total : %.2f €\n", total);
    }
}