import java.util.Scanner; /* Importation de la bibliothèque Java Scanner */
/***--------Donner un nom à votre class -------------------****/

public class exo6 {
    public static void main(String[] args) {    
        
        Scanner sc = new Scanner (System.in);

        System.out.println("quelle est votre prénom ? :");
        String firstname = sc.nextLine();
        System.out.println("quelle age avez vous ? :");
        int age = sc.nextInt();        


        System.out.println("Je m'appelle "+ firstname +" , j'ai "+ age +" ans ");

        sc.close();
    }
}   





/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/