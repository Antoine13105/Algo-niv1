import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class exo5 {
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Tapez 3 valeurs :");
        //int number = sc.nextInt(); // chiffres entiers
      
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int resultat = a*b/c;

        if (resultat > 10){
            System.out.println(resultat + " est superieur a 10 ");
        } else if (resultat ==10) {
            System.out.println(resultat + " est egal a 10 ");
        }else {
            System.out.println(resultat + " est inferieur a 10 ");
        }

        sc.close();
    }
}   





/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/