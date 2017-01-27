import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciLastDigitTest {

    @Test
    public void three() {
        assertEquals(2, FibonacciLastDigit.getFibonacci(3));
    }

    @Test
    public void big() {
        assertEquals(9, FibonacciLastDigit.getFibonacci(331));
    }

    @Test
    public void huge() {
        assertEquals(5, FibonacciLastDigit.getFibonacci(327305));
    }
}