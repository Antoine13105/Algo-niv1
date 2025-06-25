import java.util.Scanner;

public class exo17 {
    public static void main(String[] args) {
        // Définir les prix des carburants (prix moyens en euros par litre)
        double prixGazole = 1.50;  // Exemple de prix pour le gazole
        double prixSP95 = 1.60;    // Exemple de prix pour le sans plomb 95
        double prixSP98 = 1.70;    // Exemple de prix pour le sans plomb 98

        // Consommation des carburants en litre/100km
        double consommationGazole = 5.5;  // Consommation pour le gazole
        double consommationSP95 = 6.5;   // Consommation pour le SP95
        double consommationSP98 = 6.5;   // Consommation pour le SP98

        Scanner scanner = new Scanner(System.in);

        // Demander le type de carburant
        System.out.println("Quel est le type de votre carburant ?");
        System.out.println("0 : Gazole (B7)");
        System.out.println("1 : Sans Plomb 95");
        System.out.println("2 : Sans Plomb 98 (E5)");
        int typeCarburant = scanner.nextInt();

        // Afficher le type de carburant choisi
        String carburantChoisi = "";
        double consommation = 0;
        double prixCarburant = 0;

        switch (typeCarburant) {
            case 0:
                carburantChoisi = "Gazole";
                consommation = consommationGazole;
                prixCarburant = prixGazole;
                break;
            case 1:
                carburantChoisi = "Sans Plomb 95";
                consommation = consommationSP95;
                prixCarburant = prixSP95;
                break;
            case 2:
                carburantChoisi = "Sans Plomb 98";
                consommation = consommationSP98;
                prixCarburant = prixSP98;
                break;
            default:
                System.out.println("Type de carburant invalide !");
                scanner.close();
                return;
        }

        System.out.println("Vous avez choisi : " + carburantChoisi);

        // Demander la distance à parcourir
        System.out.print("Quel est la distance à parcourir (en km) ?\n");
        double distance = scanner.nextDouble();

        // Calculer la consommation en litres pour la distance donnée
        double litresConsommes = (distance * consommation) / 100;

        // Calculer le coût des dépenses en carburant
        double depensesCarburant = litresConsommes * prixCarburant;

        // Afficher le résultat avec deux décimales
        System.out.printf("Pour %.0f km, vous allez dépenser en moyenne %.2f€\n", distance, depensesCarburant);

        scanner.close();
    }
}

/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/


