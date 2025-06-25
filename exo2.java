import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class exo2 {
    
  public static void main(String[] args) {    
    Scanner sc = new Scanner (System.in);

    System.out.print("Entrez le premier entier : ");
    int a = sc.nextInt();  
    System.out.print("Entrez le deuxieme entier : ");
    int b = sc.nextInt();
    int difference = a - b; 
    
    if(difference < 0){
        System.out.println("le resutat est inférieur à 0");
    } else {
        System.out.println("le resutat est supérieur à 0");
    }

sc.close();}

}

























/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */