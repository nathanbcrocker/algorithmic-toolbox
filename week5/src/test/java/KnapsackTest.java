import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackTest {

    @Test
    public void sample1() {
        int W = 10;
        int[] w  =  {1, 4, 8};
        int out = 9;

        assertEquals(out, Knapsack.optimalWeight(W, w));
    }

}