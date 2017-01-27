import org.junit.Test;

import static org.junit.Assert.*;

public class LCMTest {

    @Test
    public void small() {
        assertEquals(24, LCM.getLcm(6, 8));
    }

    @Test
    public void large() {
        assertEquals(1933053046, LCM.getLcm(28851538, 1183019));
    }

}