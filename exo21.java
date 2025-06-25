import java.util.Scanner;

public class exo21 {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur d'entrer son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt(); // Lire l'âge de l'utilisateur
        
        // Vérifier si la personne est mineure ou majeure
        if (age < 18) {
            System.out.println("Vous êtes mineur.");
        } else {
            System.out.println("Vous êtes majeur.");
        }
        
        // Fermer le scanner
        scanner.close();
    }
}