package main.java.lesson3.timecomplexity;

/**
 * Created by svetlana on 7/9/17.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++ ) {
            result = result ^ A[i] ^ (i + 1);
        }
        return result ^ (A.length + 1);
    }
}
