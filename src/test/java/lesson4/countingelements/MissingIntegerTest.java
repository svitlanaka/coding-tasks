package test.java.lesson4.countingelements;

import main.java.lesson4.countingelements.MissingInteger;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by svetlana on 7/9/17.
 */
public class MissingIntegerTest {
    @Test
    public void solution() {
        MissingInteger missing = new MissingInteger();
        assertEquals(2, missing.solution(new int[] {1}));
        assertEquals(5, missing.solution(new int[] {1, 3, 6, 4, 1, 2}));
        assertEquals(1, missing.solution(new int[] {-1, -2}));

    }
}
