import java.util.*;
import java.io.*;

public class MajorityElement {

    public static int getMajorityElement(int[] a) {
        return getMajorityElementLinear(a, 0, a.length);
    }

    private static int getMajorityElementLinear(int[] a, int left, int right) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int key = a[i];

            if (!map.containsKey(key)) {
                map.put(key, 1);
            }

            int value = map.get(key);
            map.put(key, ++value);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > Math.floor(a.length / 2) + 1) {
                return key;
            }
        }

        return -1;
    }

    private static int getMajorityElementRecursive(int[] a, int left, int right) {
        if (left == right) {
            return -1;
        }

        if (left + 1 == right || right - left == 0) {
            return a[left];
        }

        int k = (left + right) / 2;

        int leftInt = getMajorityElementRecursive(a, left, k);
        int rightInt = getMajorityElementRecursive(a, k + 1, right);

        if (leftInt == rightInt) {
            return leftInt;
        }

        int leftCount = getElementCount(a, leftInt);
        int rightCount = getElementCount(a, rightInt);

        if (leftCount > a.length / 2) {
            return leftInt;
        } else if (rightCount > a.length / 2) {
            return rightInt;
        } else {
            return -1;
        }
    }

    private static int getElementCount(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] == n)
                count++;

        return count;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int majorityElement = getMajorityElement(a);
        if (majorityElement != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}

