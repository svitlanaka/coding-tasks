package main.java.lesson2.arrays;

import java.util.Arrays;

/**
 * Created by svetlana on 7/7/17.
 */
public class Rotation {

    public int[] solution(int[] A, int K) {
        int N = A.length;
        if (N == 0 || K == 0) return A;
        int startIndex = N - (K % N);
        if (startIndex == N) return A;
        int[] result = new int[ N ];
        System.arraycopy(A, startIndex, result, 0, N - startIndex);
        System.arraycopy(A, 0, result, N - startIndex, startIndex);
        return result;
    }
}
