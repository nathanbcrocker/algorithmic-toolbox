import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void small() {
        assertEquals(1, GCD.getGcd(18, 35));
    }

    @Test
    public void large() {
        assertEquals(17657, GCD.getGcd(28851538, 1183019));
    }

}