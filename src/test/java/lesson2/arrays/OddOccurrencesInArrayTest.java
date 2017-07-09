package test.java.lesson2.arrays;

import main.java.lesson2.arrays.OddOccurrencesInArray;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by svetlana on 7/8/17.
 */
public class OddOccurrencesInArrayTest {
    @Test
    public void solution() {
        OddOccurrencesInArray occur = new OddOccurrencesInArray();
        assertEquals(5, occur.solution(new int[] {5}));
        assertEquals(3, occur.solution(new int[] {5, 4, 6, 4, 5, 3, 6}));
        assertEquals(3, occur.solution(new int[] {5, 4, 6, 3, 4, 5, 3, 6, 3}));
    }
}
