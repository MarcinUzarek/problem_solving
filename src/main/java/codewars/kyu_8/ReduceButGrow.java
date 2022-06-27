package codewars.kyu_8;

import java.util.Arrays;

//Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
//        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

public class ReduceButGrow {

    public static int grow(int[] x) {

        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
