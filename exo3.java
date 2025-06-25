import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class exo3 {
  public static void main(String[] args) {    
Scanner sc = new Scanner (System.in);

    System.out.print("Entrez le premier entier : ");
    int a = sc.nextInt();  
    System.out.print("Entrez le deuxieme entier : ");
    int b = sc.nextInt();
    int somme = a + b; 
                                                                                
    if(somme % 2 ==0){
        System.out.println("le chiffre "+ somme +" est paire");
    } else {
        System.out.println("le chiffre "+ somme +" est impaire");
    }

sc.close();}

}



















/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/