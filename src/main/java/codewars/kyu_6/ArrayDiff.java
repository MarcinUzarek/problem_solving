package codewars.kyu_6;

//Your goal in this kata is to implement a difference function,
// which subtracts one list from another and returns the result.
//
//        It should remove all values from list a, which are present in list b keeping their order.
//
//        Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//        If a value is present in b, all of its occurrences must be removed from the other:
//
//        Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static void main(String[] args) {
        arrayDiff(new int[]{1, 2, 3}, new int[]{3});
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        var firstArr = Arrays.stream(a).boxed().collect(Collectors.toList());
        firstArr.removeAll(Arrays.stream(b).boxed().toList());

        return firstArr.stream().mapToInt(x -> x).toArray();
    }
}
