import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bonneReponse = "Paris";
        String reponse = "";

        System.out.println("Question : Quelle est la capitale de la France ?");

        while (true) {
            System.out.print("Votre réponse : ");
            reponse = scanner.nextLine().trim();

            if (reponse.equalsIgnoreCase(bonneReponse)) {
                System.out.println("Bonne réponse !");
                break;
            } else {
                System.out.println("Mauvaise réponse. Essayez encore.");
            }
        }

        scanner.close();
    }
}
