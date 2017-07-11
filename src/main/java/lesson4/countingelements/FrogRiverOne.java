package main.java.lesson4.countingelements;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by svetlana on 7/10/17.
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int result = -1;
        Set<Integer> positions = new HashSet<>(X);
        for (int i = 0; i < A.length; i++) {
            positions.add(A[i]);
            if (positions.size() == X) {
                result = i;
                break;
            }
        }
        return result;
    }
}
