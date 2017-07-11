package test.java.lesson4.countingelements;

import main.java.lesson4.countingelements.PermCheck;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by svetlana on 7/9/17.
 */
public class PermCheckTest {
    @Test
    public void solution() {
        PermCheck permCheck = new PermCheck();
        assertEquals(0, permCheck.solution(new int[] {3, 4, 2, 5, 1, 4, 4}));
        assertEquals(1, permCheck.solution(new int[] {1}));
        assertEquals(0, permCheck.solution(new int[] {2}));
        assertEquals(1, permCheck.solution(new int[] {3, 4, 2, 5, 1}));
        assertEquals(0, permCheck.solution(new int[] {3, 4, 4, 5, 1, 4, 4, 5}));


    }
}
