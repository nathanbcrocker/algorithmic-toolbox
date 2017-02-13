import org.junit.Test;

import static org.junit.Assert.*;

public class PrimitiveCalculatorTest {

    @Test
    public void sample1() {
        int n = 1;
        String o = "1 ";
        assertEquals(o, PrimitiveCalculator.string(PrimitiveCalculator.calculate(n)));
    }

    @Test
    public void sample2() {
        int n = 5;
        String o = "1 2 4 5 ";
        assertEquals(o, PrimitiveCalculator.string(PrimitiveCalculator.calculate(n)));
    }

    @Test
    public void sample3() {
        int n = 96234;
        String o = "1 3 9 10 11 22 66 198 594 1782 5346 16038 16039 32078 96234 ";
        assertEquals(o, PrimitiveCalculator.string(PrimitiveCalculator.calculate(n)));
    }
}