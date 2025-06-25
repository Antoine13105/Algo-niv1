//J’ai une brique de lait (centi-litre) une quantité x
// J’ai un paquet de céréal (gramme) une quantité x
// J’ai un Bol (centi-litre) quantité vide
 
 
// Si ma brique de lait est vide ou si mon paquet de céréal est vide
 
// Alors je ne peux pas prendre mon petit déjeuner (Message)
 
// Sinon
 
// Je peux prendre mon petit déjeuner (Message)
// J’ajoute le lait et les céréales dans le bol
 
// Mon petit déjeuner est prêt (Message)

import java.util.Scanner;

public class petit_dejeuner {
    
  public static void main(String[] args) {    
    Scanner sc = new Scanner (System.in);

    System.out.print("Entrez le premier entier : ");
    int lait = sc.nextInt();  
    System.out.print("Entrez le deuxieme entier : ");
    int cereales = sc.nextInt();
 
    
    if(lait > 0 && cereales > 0) {
        System.out.println("Je peux prendre mon petit déjeuner");
    } else {
        System.out.println("je ne peux pas prendre mon petit déjeuner");
    }
    sc.close();
}


}






















