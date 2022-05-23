package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ArrayDiffTest {

    @Test
    void should_return_empty_list() {
        assertThat(ArrayDiff.arrayDiff(new int[]{1, 2, 2, 2, 2}, new int[]{2, 1}),
                is(new int[]{}));

        assertThat(ArrayDiff.arrayDiff(new int[]{}, new int[]{2, 1}),
                is(new int[]{}));

    }

    @Test
    void should_remove_all_duplicates() {
        assertThat(ArrayDiff.arrayDiff(new int[]{1, 2, 2, 2, 2}, new int[]{2}),
                is(new int[]{1}));
    }

    @Test
    void should_remove_all_numbers_from_second_array() {
        assertThat(ArrayDiff.arrayDiff(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, new int[]{1, 2, 3, 4, 5}),
                is(new int[]{6, 7, 8, 9, 0}));
    }
}