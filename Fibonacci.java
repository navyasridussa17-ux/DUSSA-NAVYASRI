import java.util.Arrays;
public class Fibonacci {
    static long fib(int n, long[] memo) {
        if(n==0||n==1) return n;
        if(memo[n]!=-1) return memo[n];
        return memo[n]=fib(n-1,memo)+fib(n-2,memo);
    }
    public static void main(String[] args) {
        int n=100;
        long[] memo=new long[n+1];
        Arrays.fill(memo, -1);
        System.out.println(fib (n,memo));
    }
}
