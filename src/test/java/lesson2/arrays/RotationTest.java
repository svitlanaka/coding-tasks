package test.java.lesson2.arrays;

import main.java.lesson2.arrays.Rotation;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by svetlana on 7/7/17.
 */
public class RotationTest {
    @Test
    public void solution() {
        Rotation rotation = new Rotation();
        assertArrayEquals(new int[] {9, 7, 6, 3, 8}, rotation.solution(new int[] {3, 8, 9, 7, 6},3));
        assertArrayEquals(new int[] {6, 3, 8, 9, 7}, rotation.solution(new int[] {3, 8, 9, 7, 6},1));
        assertArrayEquals(new int[] {6, 3, 8, 9, 7}, rotation.solution(new int[] {3, 8, 9, 7, 6},6));
        assertArrayEquals(new int[] {3, 8, 9, 7, 6}, rotation.solution(new int[] {3, 8, 9, 7, 6},5));
        assertArrayEquals(new int[] {}, rotation.solution(new int[] {},0));

    }

}
