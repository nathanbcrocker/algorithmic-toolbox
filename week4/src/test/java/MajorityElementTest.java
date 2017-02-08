import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void sample1() {
        int[] sample = {2,3,9,2,2};
        assertEquals(2, MajorityElement.getMajorityElement(sample));
    }

    @Test
    public void sample2() {
        int[] sample = {1,2,3,4};
        assertEquals(-1, MajorityElement.getMajorityElement(sample));
    }

    @Test
    public void sample3() {
        int[] sample = {1,2,3,1};
        assertEquals(-1, MajorityElement.getMajorityElement(sample));
    }

    @Test
    public void sample4() {
        int[] sample = {2, 124554847, 2, 941795895, 2, 2, 2, 2, 792755190, 756617003};
        assertEquals(2, MajorityElement.getMajorityElement(sample));
    }
}