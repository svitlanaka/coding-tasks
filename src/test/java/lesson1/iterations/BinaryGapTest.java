package test.java.lesson1.iterations;

import static org.junit.Assert.*;

import main.java.lesson1.iterations.BinaryGap;
import org.junit.Test;

/**
 * Created by svetlana on 7/7/17.
 */
public class BinaryGapTest {

    @Test
    public void solution() {
        BinaryGap binaryGap = new BinaryGap();
        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(15));
        assertEquals(5, binaryGap.solution(1041));

    }

}
