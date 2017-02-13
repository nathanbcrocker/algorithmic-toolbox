import java.util.*;

public class PrimitiveCalculator {
    public static List<Integer> calculate(int n) {
        return sequence(n);
    }

    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        while (n >= 1) {
            sequence.add(n);
            if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
        }
        Collections.reverse(sequence);
        return sequence;
    }

    private static List<Integer> sequence(int n) {
        List<Integer> sequence = new ArrayList<>();
        int[] a = new int[n + 1];
        a[1] = 0;

        for (int i = 2; i <= n; i++) {
            int x = (i % 2) == 0 ? a[i / 2] : Integer.MAX_VALUE;
            int y = (i % 3) == 0 ? a[i / 3] : Integer.MAX_VALUE;
            int z = a[i - 1];
            a[i] = Math.min(x, Math.min(y, z)) + 1;
        }

        sequence.add(n);

        while (n > 1) {
            if(n / 2 >= 1 && a[n] - 1 == a[n / 2]) {
                sequence.add(n / 2);
                n /= 2;
            }
            else if(n / 3 >= 1 && a[n] - 1 == a[n / 3]) {
                sequence.add(n / 3);
                n /= 3;
            }
            else if(n - 1 >= 1 && a[n] - 1 == a[n - 1]) {
                sequence.add(n - 1);
                n -= 1;
            }
        }

        Collections.reverse(sequence);
        return sequence;
    }

    public static String string(List<Integer> sequence) {
        StringBuffer sb = new StringBuffer();
        for (Integer x : sequence) {
            sb.append(x).append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = calculate(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

