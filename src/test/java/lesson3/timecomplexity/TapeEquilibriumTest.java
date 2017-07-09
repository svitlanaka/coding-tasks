package test.java.lesson3.timecomplexity;

import main.java.lesson3.timecomplexity.PermMissingElem;
import main.java.lesson3.timecomplexity.TapeEquilibrium;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by svetlana on 7/9/17.
 */
public class TapeEquilibriumTest {
    @Test
    public void solution() {
        TapeEquilibrium equilibrium = new TapeEquilibrium();
        assertEquals(1, equilibrium.solution(new int[] {3, 1, 2, 4, 3}));
        assertEquals(3090, equilibrium.solution(new int[] {4093, 1003}));
        assertEquals(4, equilibrium.solution(new int[] {-3, 1}));
        assertEquals(2000, equilibrium.solution(new int[] {-1000, 1000}));

    }
}
