package main.java.lesson4.countingelements;


/**
 * Created by svetlana on 7/9/17.
 */
public class MaxCounters {
    public int[] solution(int N, int[] A){
        int[] counters = new int[N];
        int max = 0;
        int maxToSet = 0;
        for (int a: A) {
            if (a <= N) {
                int index = a - 1;
                if (counters[index] < maxToSet) {
                    counters[index] = maxToSet;
                }
                counters[index]++;
                if (max < counters[index]) {
                    max = counters[index];
                }
            } else {
                maxToSet = max;
            }
        }
        for (int i = 0; i < N; i++) {
            if (counters[i] < maxToSet) {
                counters[i] = maxToSet;
            }
        }
        return counters;
    }
}
