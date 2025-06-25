/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondez à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : L'informatique a besoin des mathématiques ? (V/F)
 * 
 * V
 * 
 * Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)
 * 
 * F
 * 
 * Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)
 * 
 * F
 * 
 * Question 4 : Une table de vérité retourne l'expression algébrique (V/F)
 * 
 * V
 * 
 * Question 5 : Git permet de stocker à distance son travail (V/F)
 * 
 * 
 * V
 * 
 * 
 * Résultat du QUIZZ, vous avez 5 point(s) / 5
 * 
*/
import java.util.Scanner;

public class QuizVF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "Question 1 : L'informatique a besoin des mathématiques ? (V/F)",
            "Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)",
            "Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)",
            "Question 4 : Une table de vérité retourne l'expression algébrique (V/F)",
            "Question 5 : Git permet de stocker à distance son travail (V/F)"
        };

        char[] reponses = {'V', 'F', 'F', 'V', 'V'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1 && input.charAt(0) == reponses[i]) {
                score++;
            }
        }

        System.out.println("\nRésultat du QUIZZ, vous avez " + score + " point(s) / 5");

        scanner.close();
    }
}

