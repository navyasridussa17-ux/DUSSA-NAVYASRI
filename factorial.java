import java.util.Scanner;

public class factorial {

    // Recursive function to calculate factorial
    public static long factorial (int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        }
        return n * factorial(n - 1);  // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = factorial(num);

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
