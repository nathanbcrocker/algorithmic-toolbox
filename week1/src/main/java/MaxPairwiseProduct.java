import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextLong();
        }

        System.out.println(getMaxPairwiseProduct(numbers));
    }

    public static long getMaxPairwiseProduct(long[] numbers) {
        return getMaxPairwiseProductFast(numbers);
    }

    private static long getMaxPairwiseProductFast(long[] numbers) {
        int index_max = -1, index_max_2 = 0;
        int n = numbers.length;
        if (n < 2) {
            return numbers[0];
        }

        for (int i = 0; i < n; i++) {
            if (index_max == -1 || numbers[i] > numbers[index_max]) {
                index_max = i;
                //System.out.println("selecting r1:" + i);
            }
        }

        for (int i = 0; i < n; i++) {
            if ((index_max_2 == 0 || (numbers[i] > numbers[index_max_2])) && (i != index_max)) {
                index_max_2 = i;
                //System.out.println("selecting r2:" + i);
            }
        }

        return numbers[index_max] * numbers[index_max_2];
    }


    private static long getMaxPairwiseProductNaive(long[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }

        return result;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
