import java.util.Scanner;

public class exo22 {
    public static void main(String[] args) {
        // Déclaration des variables de solde pour deux comptes
        double soldeCompteA = 1000.0;  // Solde initial du compte A
        double soldeCompteB = 500.0;   // Solde initial du compte B

        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichage des soldes initiaux
        System.out.println("Solde initial du compte A : " + soldeCompteA + " €");
        System.out.println("Solde initial du compte B : " + soldeCompteB + " €");

        // Demander à l'utilisateur combien il souhaite transférer de A à B
        System.out.print("Entrez le montant à transférer du compte A vers le compte B : ");
        double montantTransfert = scanner.nextDouble();

        // Vérifier que le montant est valide (non négatif et pas supérieur au solde de A)
        if (montantTransfert > 0 && montantTransfert <= soldeCompteA) {
            // Effectuer le transfert
            soldeCompteA -= montantTransfert;  // Déduction du compte A
            soldeCompteB += montantTransfert;  // Ajout au compte B

            // Affichage des soldes après transfert
            System.out.println("Transfert réussi !");
            System.out.println("Nouveau solde du compte A : " + soldeCompteA + " €");
            System.out.println("Nouveau solde du compte B : " + soldeCompteB + " €");
        } else {
            // Affichage d'une erreur si le montant est invalide
            System.out.println("Erreur : Le montant est invalide ou supérieur au solde du compte A.");
        }

        // Fermer le scanner
        scanner.close();
    }
}
