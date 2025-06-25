import java.util.Scanner;

public class exo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande du prix HT
        System.out.print("Entrez le prix HT (Hors Taxe) : ");
        double prixHT = scanner.nextDouble();

        // Demande du taux de TVA
        System.out.print("Entrez le taux de TVA (en %) : ");
        double tauxTVA = scanner.nextDouble();

        // Calcul du prix TTC
        double montantTVA = prixHT * (tauxTVA / 100);
        double prixTTC = prixHT + montantTVA;

        // Affichage des résultats
        System.out.println("Montant de la TVA : " + montantTVA + " €");
        System.out.println("Prix TTC (Toutes Taxes Comprises) : " + prixTTC + " €");

        scanner.close();
    }
}