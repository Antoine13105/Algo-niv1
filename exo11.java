import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        double solde = 3000.0;  // Solde initial du compte bancaire
        Scanner scanner = new Scanner(System.in);

        // Afficher le message pour demander le montant à retirer
        System.out.print("Bonjour, combien voulez-vous retirer ?\n");
        double retrait = scanner.nextDouble();

        // Vérification du solde
        if (retrait > solde) {
            System.out.println("\nOpération refusée, fonds insuffisants !");
        } else {
            solde -= retrait;  // Déduire le montant du retrait du solde
            System.out.printf("\nRetrait effectué. Nouveau solde : %.2f€\n", solde);
        }

        scanner.close();
    }
}

/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/


