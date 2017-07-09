package main.java.lesson1.iterations;

/**
 * Created by svetlana on 7/7/17.
 */
public class BinaryGap {

    public int solution(int N) {
        String binaryStr = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;
        for (char symb : binaryStr.toCharArray()) {
            if (symb == '1') {
                if (currentGap > 0 && currentGap > maxGap) maxGap = currentGap;
                currentGap = 0;
                continue;
            } else {
                currentGap++;
            }
        }
        return maxGap;
    }
}
