import org.junit.Test;

import static org.junit.Assert.*;


public class FibonacciTest {

    @Test
    public void three() {
        assertEquals(2, Fibonacci.getFibonacci(3));
    }

    @Test
    public void ten() {
        assertEquals(55, Fibonacci.getFibonacci(10));
    }
}