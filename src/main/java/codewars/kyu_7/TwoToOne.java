package codewars.kyu_7;

//Take 2 strings s1 and s2 including only letters from ato z.
// Return a new sorted string, the longest possible,
// containing distinct letters - each taken only once - coming from s1 or s2.
//
//        Examples:
//        a = "xyaabbbccccdefww"
//        b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"
//
//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

import java.util.stream.Stream;

public class TwoToOne {

    public static String longest(String s1, String s2) {

        return Stream.of(s1, s2)
                .map(x -> x.split(""))
                .flatMap(Stream::of)
                .distinct()
                .sorted()
                .reduce("", (a, b) -> a + b);
    }
}
