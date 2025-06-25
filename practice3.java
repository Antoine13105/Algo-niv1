import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class practice3 {


      // Méthode principale, point d'entrée du programme
      public static void main(String[] args) {
       
        // Création d'un objet Scanner pour lire les entrées au clavier
        // System.in représente l'entrée standard (le clavier)
        Scanner scanner = new Scanner(System.in);
       
        // Affichage d'une invite pour demander le premier nombre
        System.out.print("Entrez le premier entier : ");
        // Lecture du premier entier saisi par l'utilisateur
        int A = scanner.nextInt();
       
        // Affichage d'une invite pour demander le deuxième nombre
        System.out.print("Entrez le deuxième entier : ");
        // Lecture du deuxième entier saisi par l'utilisateur
        int B = scanner.nextInt();
       
        // Calcul de la somme des deux nombres
        // L'opérateur + fait ici une addition car les variables sont de type int
        int somme = A + B;
       
        // Structure conditionnelle if/else
        // On vérifie si la somme est strictement supérieure à 10
        if (somme > 10) {
            // Si la condition est vraie, affichage du message avec la somme
            System.out.println("La somme (" + somme + ") est supérieure à 10.");
        } else {
            // Si la condition est fausse, affichage du message avec la somme
            System.out.println("La somme (" + somme + ") n'est pas supérieure à 10.");
        }
       
        // Fermeture du scanner pour libérer les ressources système
        // Bonne pratique pour éviter les fuites de ressources
        scanner.close();
    }
}
 