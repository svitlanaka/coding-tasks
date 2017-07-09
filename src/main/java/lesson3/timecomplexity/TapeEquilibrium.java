package main.java.lesson3.timecomplexity;

/**
 * Created by svetlana on 7/9/17.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        int totalSum = 0;
        for (int a: A) {
            totalSum += a;
        }
        int min = Integer.MAX_VALUE;
        int leftSum = A[0];
        for (int i = 1; i < A.length; i++ ) {
            int dif = Math.abs(leftSum - (totalSum - leftSum));
            if (dif < min) {
                min = dif;
            }
            leftSum += A[i];
        }
        return min;
    }
}
