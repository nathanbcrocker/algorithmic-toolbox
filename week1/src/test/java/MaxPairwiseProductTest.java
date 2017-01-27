import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPairwiseProductTest {

    @Test
    public void large() {
        assertEquals(9000000000L, MaxPairwiseProduct.getMaxPairwiseProduct(new long[] {100000, 90000}));
    }

}