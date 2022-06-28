package codewars.kyu_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumWithoutHighestAndLowestTest {

    @Test
    void should_sum_without_highest_and_lowest() {
        assertEquals(16, SumWithoutHighestAndLowest.sum(new int[]{6, 2, 1, 8, 10}));
        assertEquals(2, SumWithoutHighestAndLowest.sum(new int[]{1, 2, 3}));
        assertEquals(5, SumWithoutHighestAndLowest.sum(new int[]{1, 2, 3, 3}));
    }

    @Test
    void should_return_zero_for_empty_input() {
        assertEquals(0, SumWithoutHighestAndLowest.sum(new int[]{}));
    }

    @Test
    void should_return_zero_for_input_with_less_than_3_elements() {
        assertEquals(0, SumWithoutHighestAndLowest.sum(new int[]{1, 4}));
    }

    @Test
    void should_return_zero_for_null_input() {
        assertEquals(0, SumWithoutHighestAndLowest.sum(null));
    }


}