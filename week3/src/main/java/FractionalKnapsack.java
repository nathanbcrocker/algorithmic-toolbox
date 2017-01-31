import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FractionalKnapsack {

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
        
        scanner.close();
        System.out.println(getOptimalValue(capacity, values, weights));
    }
	
    public static double getOptimalValue(int capacity, int[] values, int[] weights) {
    	if (values.length == 0 || weights.length == 0) {
    		return 0.0d;    	
    	}
    	
    	double[][] ratios = new double[weights.length][2];
    	
    	for (int i = 0; i < ratios.length; i++) {
    		double weight = (double)weights[i];
    		double ratio = 0.0d;
    		if (weight > 0.0 && values.length > i) {
    			ratio = ((double)values[i])/weight;
    		}
    		
    		ratios[i][0] = ratio;
    		ratios[i][1] = weight;    		
    	}
    	
    	Arrays.sort(ratios , new Comparator<double[]>() {
            
            public int compare(double[] o1, double[] o2) {
                return ((Double)o2[0]).compareTo((Double)o1[0]);
            }
        });
    	
        double value = 0.0;
        int j = 0;
        while(capacity > 0 && j < ratios.length) {
            double a = Math.ceil(Math.min(ratios[j][1], capacity));
            value += a * ratios[j][0];
            weights[j] -= (int)Math.ceil(a);
            capacity -= (int)Math.ceil(a);
            j++;
        }

        return value;
    }
} 
