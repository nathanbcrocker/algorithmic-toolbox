import java.util.Scanner;

public class Fibonacci {

    private static long[] fibonacciTable;

    /*private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }*/

/*    private static long calc_fib_efficient(int n) {
        if (n <= 1)
            return n;

        fibonacciTable = new long[n + 1];
        fibonacciTable[0] = 0;
        fibonacciTable[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibonacciTable[i] = fibonacciTable[i - 1] + fibonacciTable[i - 2];
        }

        return fibonacciTable[n];
    }*/

    private static int getFibonacciEfficient(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current;
    }

    public static int getFibonacci(int n) {
        return getFibonacciEfficient(n);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(getFibonacci(n));
    }
}
