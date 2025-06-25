import java.util.Scanner;

public class BouteilleDeau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Capacité de la bouteille en centilitres
        int capaciteBouteille = 100; // 1 litre = 100 cl
        int quantiteRestante = capaciteBouteille;

        // Démarrage du programme
        while (quantiteRestante > 0) {
            System.out.print("Entrez la quantité bue en cl (positive) : ");
            
            // Vérification de la saisie
            int quantiteBue = scanner.nextInt();

            // Si l'utilisateur entre une quantité négative ou nulle
            if (quantiteBue <= 0) {
                System.out.println("Erreur : Veuillez entrer une quantité positive.");
                continue;
            }

            // Vérifier si la quantité bue dépasse ce qui reste dans la bouteille
            if (quantiteBue > quantiteRestante) {
                System.out.println("La quantité bue dépasse ce qui reste dans la bouteille !");
                quantiteRestante = 0; // La bouteille est vide
                break; // On arrête le programme car la bouteille est vide
            }

            // Réduire la quantité restante dans la bouteille
            quantiteRestante -= quantiteBue;

            // Affichage de l'état de la bouteille
            if (quantiteRestante > 0) {
                System.out.println("Il reste encore " + quantiteRestante + " cl d'eau dans la bouteille.");
            } else {
                System.out.println("La bouteille d'eau est vide.");
            }
        }

        // Fermeture du scanner
        scanner.close();
    }
}