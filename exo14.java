import java.util.Scanner;

public class exo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander les valeurs booléennes à l'utilisateur
        System.out.print("Donner une valeur A (TRUE ou FALSE) : ");
        boolean A = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Donner une valeur B (TRUE ou FALSE) : ");
        boolean B = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("Donner une valeur C (TRUE ou FALSE) : ");
        boolean C = Boolean.parseBoolean(scanner.nextLine());

        // Calculer l'expression A OU B ET NON C
        boolean resultat = A || (B && !C);

        // Affichage du résultat
        System.out.println("\nRésultat : " + resultat);

        scanner.close();
    }
}


/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
 * 
 * 
 * 
*/


