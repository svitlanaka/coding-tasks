package test.java.lesson4.countingelements;

import main.java.lesson4.countingelements.MaxCounters;
import main.java.lesson4.countingelements.MissingInteger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by svetlana on 7/9/17.
 */
public class MaxCountersTest {
    @Test
    public void solution() {
        MaxCounters counters = new MaxCounters();
        assertArrayEquals(new int[]{3, 2, 2, 4, 2}, counters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
        assertArrayEquals(new int[]{0}, counters.solution(1, new int[] {3}));
        assertArrayEquals(new int[]{1}, counters.solution(1, new int[] {1}));
        assertArrayEquals(new int[]{4, 4, 4, 4, 4}, counters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4, 6}));


    }
}
