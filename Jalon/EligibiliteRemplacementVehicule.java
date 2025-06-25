import java.util.Scanner;

public class EligibiliteRemplacementVehicule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie des informations
        System.out.print("Entrez votre vitesse au moment de l'accident (en km/h) : ");
        int vitesse = scanner.nextInt();

        System.out.print("Étiez-vous placé derrière le véhicule en collision ? (oui/non) : ");
        String position = scanner.next();

        System.out.print("Entrez le kilométrage actuel de votre véhicule : ");
        int kilometrage = scanner.nextInt();

        System.out.print("Date du dernier contrôle technique (en années) : ");
        int controleTechnique = scanner.nextInt();

        // Vérification des conditions
        boolean vitesseOk = vitesse < 130;
        boolean positionOk = !position.equalsIgnoreCase("oui");
        boolean controleOk;

        if (kilometrage > 150000) {
            controleOk = controleTechnique <= 2;
        } else {
            controleOk = controleTechnique <= 5;
        }

        if (vitesseOk && positionOk && controleOk) {
            System.out.println("✅ Vous êtes éligible au remplacement du véhicule.");
        } else {
            System.out.println("❌ Vous n'êtes pas éligible au remplacement du véhicule.");
        }

        scanner.close();
    }
}