import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quelle est votre prix ?\n\n");
        double prix = scanner.nextDouble();

        System.out.print("\nVotre réduction (en pourcentage %) ?\n\n");
        double reduction = scanner.nextDouble();

        double prixReduit = prix - (prix * reduction / 100);

        System.out.printf("\n\nPrix après réduction de %.0f%% :\n\n%.2f\n", reduction, prixReduit);

        scanner.close();
    }
}




/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/


