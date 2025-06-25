import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class exo1 {
    
  public static void main(String[] args) {    
Scanner sc = new Scanner (System.in);
System.out.print("Entrez le premier entier : ");
int a = sc.nextInt();  
System.out.print("Entrez le deuxieme entier : ");
int b = sc.nextInt();
int somme = a + b;  
System.out.println("La somme equivaut à : (" + somme + ") .");

sc.close();}

}









/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/