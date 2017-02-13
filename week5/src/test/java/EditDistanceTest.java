import org.junit.Test;

import static org.junit.Assert.*;

public class EditDistanceTest {

    @Test
    public void sample1() {
        String base = "ab";
        String cmp = "ab";
        int distance = 0;

        assertEquals(distance, EditDistance.calculateDistance(base, cmp));
    }

    @Test
    public void sample2() {
        String base = "shorts";
        String cmp = "ports";
        int distance = 2;

        assertEquals(distance, EditDistance.calculateDistance(base, cmp));
    }

    @Test
    public void sample3() {
        String base = "editing";
        String cmp = "distance";
        int distance = 5;

        assertEquals(distance, EditDistance.calculateDistance(base, cmp));
    }
}