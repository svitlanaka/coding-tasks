package main.java.lesson2.arrays;

/**
 * Created by svetlana on 7/8/17.
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++) {
            result = result ^ A[i];
        }
        return result;
    }
}
