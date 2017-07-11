package test.java.lesson4.countingelements;

import main.java.lesson4.countingelements.FrogRiverOne;
import main.java.lesson4.countingelements.MaxCounters;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by svetlana on 7/9/17.
 */
public class FrogRiverOneTest {
    @Test
    public void solution() {
        FrogRiverOne frog = new FrogRiverOne();
        assertEquals(4, frog.solution(5, new int[] {3, 4, 2, 5, 1, 4, 4}));
        assertEquals(0, frog.solution(1, new int[] {1}));
        assertEquals(-1, frog.solution(5, new int[] {1}));
        assertEquals(-1, frog.solution(5, new int[] {3, 4, 4, 5, 1, 4, 4, 5}));
        assertEquals(6, frog.solution(5, new int[] {3, 4, 4, 5, 1, 4, 4, 5}));


    }
}
