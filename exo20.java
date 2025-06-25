import java.util.Scanner;

public class exo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int totalVotants = 150_000;

        // Saisie des votes
        System.out.print("Combien de gens ont voté pour Joseline Inutile ?\n");
        int votesInutile = scanner.nextInt();

        System.out.print("Combien de gens ont voté pour Vincent Escreau ?\n");
        int votesEscreau = scanner.nextInt();

        // Calcul des votes exprimés
        int totalVotesExprimes = votesInutile + votesEscreau;

        if (totalVotesExprimes > totalVotants) {
            System.out.println("Erreur : Le total des votes dépasse le nombre de votants !");
            scanner.close();
            return;
        }

        // Calcul des votes blancs ou nuls (abstentions)
        int votesBlancs = totalVotants - totalVotesExprimes;
        if (votesBlancs > 0) {
            System.out.println("\nVous avez " + votesBlancs + " d'abstentions, ils seront comptés nul");
        }

        // Calcul des pourcentages sur les votes exprimés
        double totalVotesUtiles = votesInutile + votesEscreau;
        double pourcentageInutile = (votesInutile * 100.0) / totalVotesUtiles;
        double pourcentageEscreau = (votesEscreau * 100.0) / totalVotesUtiles;

        // Affichage des résultats
        System.out.printf("\nJoseline Inutile : %.1f%%\n", pourcentageInutile);
        System.out.printf("Vincent Escreau : %.1f%%\n", pourcentageEscreau);

        // Détermination du résultat de l'élection
        if (pourcentageInutile > 60) {
            System.out.println("\nJoseline Inutile est la nouvelle maire de Mulhouse");
        } else if (pourcentageEscreau > 60) {
            System.out.println("\nVincent Escreau est le nouveau maire de Mulhouse");
        } else {
            System.out.println("\nAucun candidat n'a dépassé 60%. Il y aura un second tour.");
        }

        scanner.close();
    }
}


/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/


