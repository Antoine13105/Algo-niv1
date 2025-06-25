/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à poing (false) ? 
 * false
 * 
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * 
 * Merci pour votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */
import java.util.Scanner;

public class exoniv1     {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean viande;
        boolean cuisson = false;
        boolean accompagnement;
        boolean boisson;

        // Boucle pour répéter la commande si nécessaire (optionnel ici)
        boolean recommencer = true;
        while (recommencer) {

            System.out.println("Bonjour, votre commande est avec viande (true) ou vegetarien (false)");
            viande = scanner.nextBoolean();

            if (viande) {
                System.out.println("Votre steak vous le voulez saignant (true) ou à point (false) ?");
                cuisson = scanner.nextBoolean();
            }

            System.out.println("Frites (true) ou riz (false)");
            accompagnement = scanner.nextBoolean();

            System.out.println("Soda (true) ou eau gazeuse (false)");
            boisson = scanner.nextBoolean();

            System.out.println("\nMerci, votre commande sera prêt dans 20 min.");

            // Facultatif : demander s'ils veulent recommencer une commande
            System.out.println("Souhaitez-vous passer une autre commande ? (true pour oui / false pour non)");
            recommencer = scanner.nextBoolean();
        }

        scanner.close();
    }
}
