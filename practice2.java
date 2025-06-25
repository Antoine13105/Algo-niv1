  import java.util.Scanner;
  /***--------Donner un nom à votre class -------------------****/
 
  public class practice2 {
 
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in) ;
    System.out.println("entré une valeur");
    
    String name=sc.nextLine();
    System.out.println("bonjour" + name);
    
   sc.close();
    }
  }
