import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class exo4 {
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Tapez votre valeur :");
        //int number = sc.nextInt(); // chiffres entiers
        double number = sc.nextDouble(); // chiffres avec virgule
        
        if (number % 2 == 0) {
            System.out.println(number + " est divisible par 2.");
        } else {
            System.out.println(number + " n'est pas divisible par 2 car cela donne : "+ number / 2);
        }
        sc.close();
    }
}   




/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/