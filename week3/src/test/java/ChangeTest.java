import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeTest {

    @Test
    public void twoPennies() {
        assertEquals(2, Change.getChange(2));
    }

    @Test
    public void mixedChange() {
        assertEquals(6, Change.getChange(28));
    }
}