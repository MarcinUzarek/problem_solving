package codewars.kyu_5;

//A friend of mine takes the sequence of all numbers from 1 to n (where n > 0).
//        Within that sequence, he chooses two numbers, a and b.
//        He says that the product of a and b should be equal to the sum of all numbers in the sequence,
//        excluding a and b.
//        Given a number n, could you tell me the numbers he excluded from the sequence?
//        The function takes the parameter: n (n is always strictly greater than 0)
//        and returns an array or a string (depending on the language) of the form:
//
//        [{a, b}, ...]
//        with all (a, b) which are the possible removed numbers in the sequence 1 to n.
//
//        [{a, b}, ...] will be sorted in increasing order of the "a".
//
//        It happens that there are several possible (a, b).
//        The function returns an empty array (or an empty string)
//        if no possible numbers are found which will prove that my friend has not told the truth!

//        removNb(26) should return [ {15, 21}, {21, 15} ]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this solution is terrible for big numbers, it needs huge amount of time to solve for just more than few digits n. vc
public class IsMyFriendCheating {

    public static void main(String[] args) {
        var l = System.currentTimeMillis();

        long startTime = System.nanoTime();
        System.out.println("Time: ");
        var longs = removNb(260039);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        longs.forEach(result -> System.out.println(Arrays.toString(result)));

    }

    static List<long[]> removNb(long n) {
        List<long[]> list = new ArrayList<>();
        var sumOfAll = findSumOfAllNumbers(n);

        for (long i = 1; i <= n; i++) {

            for (long j = 1; j <= n; j++) {
                if (i * j == (sumOfAll - i - j)) {
                    list.add(new long[]{i, j});
                }
            }
        }
        return list;
    }


    private static long findSumOfAllNumbers(long n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
