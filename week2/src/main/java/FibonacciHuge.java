import java.math.BigInteger;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous % current;
        }

        return current % m;
    }

    private static long getFibonacciPisanoPeriod(long n, long m) {
        if (n <= 1)
            return n;

        List<Long> pisanoPeriod = new ArrayList<>();
        pisanoPeriod.add(0L);
        pisanoPeriod.add(1L);
        int i = 2;

        while (true) {
            pisanoPeriod.add((pisanoPeriod.get(i - 1) + pisanoPeriod.get(i - 2) ) % m);

            ++i;
            if (pisanoPeriod.get(i - 2) == 0 && pisanoPeriod.get(i - 1) == 1) {
                break;
            }
        }

        int j = (int) n % (pisanoPeriod.size() - 2);
        return pisanoPeriod.get(j);
    }

    public static long getFibonacci(long n, long m) {
        return getFibonacciPisanoPeriod(n, m);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacci(n, m));
    }
}

