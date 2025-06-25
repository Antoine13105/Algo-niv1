import java.util.Scanner;

public class exo19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur combien de secondes il veut convertir
        System.out.print("Combien de secondes ?\n");
        int totalSecondes = scanner.nextInt();

        // Conversion
        int heures = totalSecondes / 3600;
        int minutes = (totalSecondes % 3600) / 60;
        int secondes = totalSecondes % 60;

        // Affichage du résultat
        System.out.printf("%d secondes correspond à %d heures, %d minutes et %d seconde%s\n",
                totalSecondes, heures, minutes, secondes, secondes > 1 ? "s" : "");

        scanner.close();
    }
}

/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/


