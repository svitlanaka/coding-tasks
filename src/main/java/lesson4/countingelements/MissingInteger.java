package main.java.lesson4.countingelements;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by svetlana on 7/9/17.
 */
public class MissingInteger {
    public int solution(int[] A){
        Set<Integer> storage = new HashSet<>();
        for (int a: A) {
            storage.add(Integer.valueOf(a));
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!storage.contains(Integer.valueOf(i))) {
                return i;
            }
        }
        return 0;
    }
}
