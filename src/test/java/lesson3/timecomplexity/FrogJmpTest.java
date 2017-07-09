package test.java.lesson3.timecomplexity;

import main.java.lesson3.timecomplexity.FrogJmp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by svetlana on 7/9/17.
 */
public class FrogJmpTest {
    @Test
    public void solution() {
        FrogJmp jmp = new FrogJmp();
        assertEquals(3, jmp.solution(10, 85, 30));
        assertEquals(0, jmp.solution(10, 10, 30));
        assertEquals(4, jmp.solution(10, 50, 10));

    }
}
