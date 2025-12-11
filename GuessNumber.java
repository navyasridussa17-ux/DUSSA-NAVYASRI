import java.util.Random;
import javax.swing.*;

class GuessNumber {
    public static void main(String[] args) {

        Random r = new Random();
        int secret = r.nextInt(10) + 1;   // number between 1 and 10

        for (int i = 1; i <= 3; i++) {    // 3 attempts
            String input = JOptionPane.showInputDialog("Enter a number (1-10):");
            int guess = Integer.parseInt(input);

            if (guess == secret) {
                JOptionPane.showMessageDialog(null, "Correct! You guessed it!");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Wrong! Try again.");
            }
        }

        JOptionPane.showMessageDialog(null, "You failed! The number was: " + secret);
    }
}