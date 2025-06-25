import java.util.Scanner;

public class exo16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Définir le prix initial du vol
        double prixInitial = 1200.0;

        // Demander l'âge du passager
        System.out.print("Quel est l'âge de votre passager ?\n");
        int age = scanner.nextInt();

        // Demander si le passager veut une classe business
        System.out.print("Le passager veut-il une classe business (oui/non) ?\n");
        scanner.nextLine(); // Consommer la ligne vide après nextInt
        String classeBusiness = scanner.nextLine().toLowerCase();

        // Demander le prix du vol
        System.out.print("Le prix du vol :\n");
        double prixVol = prixInitial;

        // Demander le nombre de places disponibles
        System.out.print("Nombre de places disponibles :\n");
        int placesDisponibles = scanner.nextInt();

        // Appliquer les réductions ou augmentations
        if (age < 18) {
            prixVol = prixVol * 0.80;  // Réduction de 20% si le passager est mineur
        } else if (age > 60) {
            prixVol = prixVol * 0.60;  // Réduction de 40% si le passager est senior de plus de 60 ans
        }

        if (placesDisponibles > 60) {
            prixVol = prixVol * 0.80;  // Réduction de 20% si plus de 60 places disponibles
        } else if (placesDisponibles < 20) {
            prixVol = prixVol * 1.20;  // Augmentation de 20% si moins de 20 places disponibles
        }

        if (classeBusiness.equals("oui")) {
            prixVol = prixVol * 1.20;  // Augmentation de 20% si le passager choisit la classe business
        }

        // Afficher le prix final du vol
        System.out.printf("Le prix du vol est de %.2f euros\n", prixVol);

        scanner.close();
    }
}

/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/


