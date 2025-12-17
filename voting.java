import java.util.Random;
import java.util.Scanner;
public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int candidateA = 0;
        int candidateB = 0;
        int candidateC = 0;
        System.out.print("Enter number of voters: ");
        int voters = sc.nextInt();
        for (int i = 1; i <= voters; i++) {
            int vote = rand.nextInt(3) + 1; // generates 1, 2, or 3
            System.out.println("Voter " + i + " voted for: " + vote);
            if (vote == 1) {
                candidateA++;
            } else if (vote == 2) {
                candidateB++;
            } else {
                candidateC++;
            }
        }
        System.out.println("Candidate A: " + candidateA + " votes");
        System.out.println("Candidate B: " + candidateB + " votes");
        System.out.println("Candidate C: " + candidateC + " votes");
        if (candidateA > candidateB && candidateA > candidateC) {
            System.out.println("Candidate A wins!");
        } else if (candidateB > candidateA && candidateB > candidateC) {
            System.out.println("Candidate B wins!");
        } else if (candidateC > candidateA && candidateC > candidateB) {
            System.out.println("Candidate C wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
