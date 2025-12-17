public class recursion {

    // Recursive function to find Fibonacci number
    public static int fibonacci(int n) {
        if (n == 1)  // base case 1
            return 0;
        if (n == 2)  // base case 2
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive call
    }

    public static void main(String[] args) {
        int n = 78; // how many terms you want

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
