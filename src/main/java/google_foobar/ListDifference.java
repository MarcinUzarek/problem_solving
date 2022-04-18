package google_foobar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//# Commander Lambda is all about efficiency, including using her bunny prisoners for manual labor.
// But no one's been properly monitoring the labor shifts for a while, and they've gotten quite mixed up.
// You've been given the task of fixing them, but after you wrote up new shifts,
// you realized that some prisoners had been transferred to a different block and
// aren't available for their assigned shifts.
// And manually sorting through each shift list to compare against prisoner block
// lists will take forever - remember, Commander Lambda loves efficiency!
//
//        # Given two almost identical lists of prisoner IDs x and y where one of the lists contains an additional ID,
//        write a function answer(x, y) that compares the lists and returns the additional ID.
//
//        # For example, given the lists x = [13, 5, 6, 2, 5] and y = [5, 2, 5, 13],
//        the function answer(x, y) would return 6 because the list x contains the integer 6 and the list y doesn't.
//        Given the lists x = [14, 27, 1, 4, 2, 50, 3, 1] and y = [2, 4, -4, 3, 1, 1, 14, 27, 50],
//        the function answer(x, y) would return -4 because the list y contains the integer -4 and the list x doesn't.
//
//        # In each test case, the lists x and y will always contain n non-unique integers
//        where n is at least 1 but never more than 99, and one of the lists will contain
//        an additional unique integer which should be returned by the function.
//        The same n non-unique integers will be present on both lists,
//        but they might appear in a different order, like in the examples above.
//        Commander Lambda likes to keep her numbers short, so every prisoner ID will be between -1000 and 1000.


public class ListDifference {

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{14, 27, 1, 4, 2, 50, 3, 1},
                new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50}));

    }

    public static int solution(int[] x, int[] y) {
        return x.length > y.length ? clearDuplicates(x, y) : clearDuplicates(y, x);
    }

    private static int clearDuplicates(int[] longer, int[] shorter) {
        Set<Integer> set = Arrays.stream(longer)
                .boxed()
                .collect(Collectors.toCollection(HashSet::new));

        List<Integer> list = Arrays.stream(shorter)
                .boxed()
                .collect(toList());

        list.forEach(set::remove);
        return set.stream().findFirst().get();
    }
}
