import org.junit.Test;

import static org.junit.Assert.*;


public class FractionalKnapsackTest {

    @Test
    public void sample1() {
        int[] values = {60,100,120};
        int[] weights = {20,50,30};
        int capacity = 50;
        assertEquals(180.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .01);
    }

    @Test
    public void sample2() {
        int[] values = {500,};
        int[] weights = {30,};
        int capacity = 10;
        assertEquals(166.6667, FractionalKnapsack.getOptimalValue(capacity, values, weights), .1);
    }

    @Test
    public void negativeCapacity() {
        int[] values = {500,};
        int[] weights = {30,};
        int capacity = -10;
        assertEquals(0.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .1);
    }

    @Test
    public void zeroCapacity() {
        int[] values = {500,};
        int[] weights = {30,};
        int capacity = 0;
        assertEquals(0.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .1);
    }

    @Test
    public void greaterCapacity() {
        int[] values = {60,100,120};
        int[] weights = {20,50,30};
        int capacity = 50;
        assertEquals(180.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .01);
    }

    @Test
    public void emptyWeights() {
        int[] values = {60,100,120};
        int[] weights = {};
        int capacity = 50;
        assertEquals(0.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .01);

    }

    @Test
    public void emptyValues() {
        int[] values = {};
        int[] weights = {20,50,30};
        int capacity = 50;
        assertEquals(0.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .01);

    }
    
    @Test
    public void unbalancedValues() {
    	int[] values = {60,100};
    	int[] weights = {20,50,30};
        int capacity = 50;
        assertEquals(120.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .01);
    }
    
    @Test
    public void unbalancedWeights() {
    	int[] values = {60,100,120};
    	int[] weights = {20,50,};
        int capacity = 50;
        assertEquals(120.0000, FractionalKnapsack.getOptimalValue(capacity, values, weights), .01);
    }
}
