import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciHugeTest {

    @Test
    public void small() {
        assertEquals(1, FibonacciHuge.getFibonacci(1, 239));
    }

    @Test
    public void small2() {
        assertEquals(1, FibonacciHuge.getFibonacci(10, 3));
    }

    @Test
    public void large() {
        assertEquals(161, FibonacciHuge.getFibonacci(239, 1000));
    }
}