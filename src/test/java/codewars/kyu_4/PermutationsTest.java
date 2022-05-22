package codewars.kyu_4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsTest {

    @Test
    void should_return_empty_List_for_given_empty_string() {

        assertEquals(Collections.emptyList(), Permutations.singlePermutations(""));
    }

    @Test
    void should_return_correct_lists() {
        //given
        var expected = Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa");
        var expectedAbc = Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba");
        var expectedAbcd = Arrays.asList(
                "abcd", "abdc", "acbd", "acdb", "adbc", "adcb",
                "bacd", "badc", "bcad", "bcda", "bdac", "bdca",
                "cabd", "cadb", "cbad", "cbda", "cdab", "cdba",
                "dabc", "dacb", "dbac", "dbca", "dcab", "dcba");

        assertEquals(expected, Permutations.singlePermutations("aabb"));
        assertEquals(expectedAbc, Permutations.singlePermutations("abc"));
        assertEquals(expectedAbcd, Permutations.singlePermutations("abcd"));

    }

}