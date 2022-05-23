package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTheOddTest {

    @Test
    void given_empty_array_should_return_also_empty() {

        assertThat(SortTheOdd.sortArray(new int[]{}), is(new int[]{}));
    }

    @Test
    void should_correctly_sort_given_arrays() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4},
                SortTheOdd.sortArray(new int[]{5, 3, 2, 8, 1, 4}));

        assertArrayEquals(new int[]{1, 3, 5, 8, 0},
                SortTheOdd.sortArray(new int[]{5, 3, 1, 8, 0}));

        assertArrayEquals(new int[]{0, 1, 8, 3, 6, 5, 4, 7, 2, 9},
                SortTheOdd.sortArray(new int[]{0, 9, 8, 7, 6, 5, 4, 3, 2, 1}));
    }


    @Test
    void should_sort_correctly_with_negative_numbers() {
        assertArrayEquals(new int[]{-27, 32, -9, -6, 2, -3, 3},
                SortTheOdd.sortArray(new int[]{-9, 32, -3, -6, 2, 3, -27}));
    }
}

