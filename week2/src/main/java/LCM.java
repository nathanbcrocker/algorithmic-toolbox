import java.util.*;

public class LCM {
    private static long lcm_naive(long a, long b) {
        for (long l = 1; l <= a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return a * b;
    }

    private static long lcmEfficient(long a, long b) {
        long gcd = gcdEfficient(a, b);
        if (gcd == 0) {
            return 0;
        }

        return (a * b)/gcd;
    }

    public static long getLcm(long a, long b) {
        return lcmEfficient(a, b);
    }

    private static long gcdEfficient(long a, long b) {
        if (b == 0) {
            return a;
        }

        long aPrime = a % b;
        return gcdEfficient(b, aPrime);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(getLcm(a, b));
    }
}
