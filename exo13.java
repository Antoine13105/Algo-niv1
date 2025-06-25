import java.util.Scanner;

public class exo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner une taille en centimètre ?\n\n");
        int centimètres = scanner.nextInt();

        double mètres = centimètres / 100.0;

        System.out.printf("\n%d cm vaut %.2f m\n", centimètres, mètres);

        scanner.close();
    }
}

/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
 * 
 * 
*/


