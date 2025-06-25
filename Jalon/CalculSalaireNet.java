import java.util.Scanner;

public class CalculSalaireNet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander le salaire brut à l'utilisateur
        System.out.print("Entrez votre salaire brut en euros : ");
        double salaireBrut = scanner.nextDouble();

        // Vérification si le salaire brut est positif
        if (salaireBrut < 0) {
            System.out.println("Le salaire brut ne peut pas être négatif.");
        } else {
            // Calcul du salaire net en appliquant une réduction de 23%
            double pourcentageCharges = 0.23;
            double salaireNet = salaireBrut * (1 - pourcentageCharges);

            // Affichage du salaire net
            System.out.printf("Votre salaire net est : %.2f euros.%n", salaireNet);
        }

        // Fermeture du scanner
        scanner.close();
    }
}