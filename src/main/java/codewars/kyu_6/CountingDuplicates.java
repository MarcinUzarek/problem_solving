package codewars.kyu_6;

//Count the number of Duplicates
//        Write a function that will return the count of distinct case-insensitive alphabetic
//        characters and numeric digits that occur more than once in the input string.
//        The input string can be assumed to contain only alphabets
//        (both uppercase and lowercase) and numeric digits.
//
//        Example
//        "abcde" -> 0 # no characters repeats more than once
//        "aabbcde" -> 2 # 'a' and 'b'

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {

        System.out.println(duplicateCount("bbmm"));
    }

    static int duplicateCount(String text) {
        int result = 0;

        var list = Arrays.stream(text.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                result++;
                list.removeAll(List.of(list.get(i)));
                i--;
            }
        }
        return result;
    }
}
