import java.util.Scanner;

public class FractionalKnapsack {

    //TODO introduce ratio array and sort
    //then increment past elements (ratio, value, weight) once consumed
    //e.g. ratio[i + j]
    public static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0.0;
        while(capacity > 0) {
            int index = index(values, weights);
            if (index == -1) {
                return value;
            }

            double a = Math.ceil(Math.min(weights[index], capacity));
            value += a * ((double)values[index]/(double)weights[index]);
            weights[index] -= (int)a;
            capacity -= (int)a;
        }

        return value;
    }

    private static int index(int[] values, int[] weights) {
        double max = 0.0;
        int index = -1;
        for (int i = 0; i < values.length && i < weights.length; i++) {
            if (weights[i] == 0.0) {
                continue;
            }

            double tmp = values[i]/weights[i];
            if (tmp > max) {
                index = i;
                max = tmp;
            }
        }

        return index;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
