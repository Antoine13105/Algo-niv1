import java.util.Scanner;

public class exo15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Afficher les choix de devises
        System.out.println("Quel est votre monnaie ?");
        System.out.print("EUR (Euros), USD (Dollars), GBP (Livres Sterling) : ");
        String monnaieSource = scanner.nextLine().toUpperCase();

        // Demander le montant à convertir
        System.out.print("Quel est votre montant ?\n");
        double montant = scanner.nextDouble();

        // Demander la devise cible
        scanner.nextLine();  // Consommer la ligne vide restante
        System.out.print("Vous voulez la convertir en quelle devise ?\n");
        String monnaieCible = scanner.nextLine().toUpperCase();

        // Vérification si les deux devises sont différentes
        if (monnaieSource.equals(monnaieCible)) {
            System.out.println("Erreur : Vous ne pouvez pas convertir entre deux devises identiques.");
            scanner.close();
            return;
        }

        // Déclaration des taux de conversion
        double tauxEURtoUSD = 1.1382;  // Exemple de taux de conversion EUR -> USD
        double tauxEURtoGBP = 0.8766;  // Exemple de taux de conversion EUR -> GBP
        double tauxUSDtoEUR = 0.8781;  // Exemple de taux de conversion USD -> EUR
        double tauxUSDtoGBP = 0.7713;  // Exemple de taux de conversion USD -> GBP
        double tauxGBPtoEUR = 1.1410;  // Exemple de taux de conversion GBP -> EUR
        double tauxGBPtoUSD = 1.2970; // Exemple de taux de conversion GBP -> USD

        double montantConverti = 0.0;

        // Effectuer la conversion selon les choix
        if (monnaieSource.equals("EUR") && monnaieCible.equals("USD")) {
            montantConverti = montant * tauxEURtoUSD;
        } else if (monnaieSource.equals("EUR") && monnaieCible.equals("GBP")) {
            montantConverti = montant * tauxEURtoGBP;
        } else if (monnaieSource.equals("USD") && monnaieCible.equals("EUR")) {
            montantConverti = montant * tauxUSDtoEUR;
        } else if (monnaieSource.equals("USD") && monnaieCible.equals("GBP")) {
            montantConverti = montant * tauxUSDtoGBP;
        } else if (monnaieSource.equals("GBP") && monnaieCible.equals("EUR")) {
            montantConverti = montant * tauxGBPtoEUR;
        } else if (monnaieSource.equals("GBP") && monnaieCible.equals("USD")) {
            montantConverti = montant * tauxGBPtoUSD;
        } else {
            System.out.println("Erreur : Conversion non supportée.");
            scanner.close();
            return;
        }

        // Afficher le résultat avec 2 décimales
        System.out.printf("\nRésultat : %.2f %s\n", montantConverti, monnaieCible);

        scanner.close();
    }
}



/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/


