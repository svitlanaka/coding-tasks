package main.java.lesson3.timecomplexity;

/**
 * Created by svetlana on 7/9/17.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int result = distance / D;
        if (distance % D > 0) {
            result ++;
        }
        return result;
    }
}
