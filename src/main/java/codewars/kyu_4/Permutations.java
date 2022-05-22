package codewars.kyu_4;

//In this kata you have to create all permutations of a non empty input string and remove duplicates, if present.
// This means, you have to shuffle all letters from the input in all possible orders.
//
//        Examples:
//
//        * With input 'a'
//        * Your function should return: ['a']
//        * With input 'ab'
//        * Your function should return ['ab', 'ba']
//        * With input 'aabb'
//        * Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']
//        The order of the permutations doesn't matter.

import java.util.*;
import java.util.stream.Collectors;

//TODO: fix this shitty solution to something normal
public class Permutations {

    public static void main(String[] args) {
        System.out.println(singlePermutations("abccef"));

    }

    public static List<String> singlePermutations(String s) {

        if (s.length() == 0) {
            return Collections.emptyList();
        }

        var charList = Arrays.stream(s.split(""))
                .collect(Collectors.toList());
        Set<String> placeHolder = new HashSet<>();

        for (int i = 0; i < 1000000; i++) {
            StringBuilder stringBuffer = new StringBuilder();
            Collections.shuffle(charList);

            for (String letter : charList) {
                stringBuffer.append(letter);
            }
            placeHolder.add(stringBuffer.toString());
        }
        return new ArrayList<>(placeHolder).stream().sorted().toList();

    }


}
