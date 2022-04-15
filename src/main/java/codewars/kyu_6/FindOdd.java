package codewars.kyu_6;

//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).

import java.util.Arrays;

public class FindOdd {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    }

    static int findIt(int[] array) {
        int result = 0;
        var sorted = Arrays.stream(array).sorted().toArray();

        for (int i = 0; i < sorted.length - 1; i++) {

            if (sorted[i] == sorted[i + 1]) {
                result++;
            } else {
                if (result % 2 == 0) {
                    return sorted[i];
                } else {
                    result = 0;
                }
            }
        }
        return sorted[sorted.length - 1];
    }
}
