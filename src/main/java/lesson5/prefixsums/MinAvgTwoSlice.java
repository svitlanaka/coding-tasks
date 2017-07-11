package main.java.lesson5.prefixsums;


/**
 * Created by svetlana on 7/10/17.
 */
public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int index = 0;
        int[] prefixSum = new int[A.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }

        float minAvg = Float.MAX_VALUE;
        for (int i = 0; i < A.length - 2; i++) {
            float s1 = getAvg(prefixSum, i, i+1, 2f);
            float s2 = getAvg(prefixSum, i, i+2, 3f);
            float currentAgv = minAvg;
            minAvg = Math.min(minAvg, Math.min(s1, s2));
            if (currentAgv != minAvg) {
                index = i;
            }
        }
        return index;
    }

    private float getAvg(int[] P,int x, int y, float v) {
        return (P[y + 1] - P[x]) / v;
    }
}
