import java.util.Scanner;

public class exo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander le montant du prêt demandé
        System.out.print("Quel est le montant de votre prêt ?\n");
        double montantPret = scanner.nextDouble();

        // Vérifier si l'utilisateur est en CDI
        System.out.print("Êtes-vous en CDI ?\n");
        boolean enCDI = scanner.nextBoolean();

        // Condition 1 : Avoir un CDI avec un salaire de plus de 3000€
        boolean condition1 = false;
        if (enCDI) {
            System.out.print("Quel est votre salaire ?\n");
            double salaire = scanner.nextDouble();
            if (salaire > 3000) {
                condition1 = true;  // Le salaire est suffisant, la condition 1 est remplie
            }
        }

        // Condition 2 : Avoir un apport de 25% du montant du prêt
        System.out.print("Combien avez-vous d'apport ?\n");
        double apport = scanner.nextDouble();
        double apportNecessaire = montantPret * 0.25;

        // Condition 3 : Si la condition 1 n'est pas remplie, vérifier la propriété
        boolean condition3 = false;
        if (!condition1) {
            System.out.print("Avez-vous une propriété d'une valeur minimum de 75% du prêt demandé ? (TRUE/FALSE)\n");
            condition3 = scanner.nextBoolean();
        }

        // Vérifier si l'utilisateur remplit les conditions
        if ((condition1 && apport >= apportNecessaire) || condition3) {
            System.out.println("Félicitations, votre prêt est accordé !");
        } else {
            System.out.println("Vous ne pouvez pas hélas obtenir de prêt !");
        }

        scanner.close();
    }
}

/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
    * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'abord ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/


