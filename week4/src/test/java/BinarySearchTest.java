import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void sample1() {
        int[] a = {1, 5, 8, 12, 13};
        int[] keys = {8, 1, 23, 1, 11};
        int[] answers = {2, 0,-1, 0, -1};
        for (int i = 0; i < answers.length; i++) {
            assertEquals(answers[i], BinarySearch.binarySearch(a, keys[i]));
        }
    }

}