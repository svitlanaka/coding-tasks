package test.java.lesson3.timecomplexity;

import main.java.lesson3.timecomplexity.PermMissingElem;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by svetlana on 7/9/17.
 */
public class PermMissingElemTest {
    @Test
    public void solution() {
        PermMissingElem missing = new PermMissingElem();
        assertEquals(4, missing.solution(new int[] {2, 3, 1, 5}));
        assertEquals(1, missing.solution(new int[] {2}));
        assertEquals(3, missing.solution(new int[] {1, 2}));
        assertEquals(3, missing.solution(new int[] {1, 2, 4}));
        assertEquals(1, missing.solution(new int[] {}));
    }
}
