package main.java.lesson4.countingelements;

/**
 * Created by svetlana on 7/10/17.
 */
public class PermCheck {
    public int solution(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result = result ^ (i + 1) ^ A[i];
        }
        return (result == 0) ? 1 : 0;
    }
}
