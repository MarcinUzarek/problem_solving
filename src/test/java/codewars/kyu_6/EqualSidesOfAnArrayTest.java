package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualSidesOfAnArrayTest {

    @Test
    void should_return_correct_index_for_equal_sides() {
        assertEquals(3, EqualSidesOfAnArray.findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals(1, EqualSidesOfAnArray.findEvenIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6, EqualSidesOfAnArray.findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }

    @Test
    void should_return_minus_one_when_no_equal_sides() {
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(new int[]{-8505, -5130, 1926, -9026}));
    }

    @Test
    void should_return_zero_when_whole_array_sum_is_zero() {
        assertEquals(0, EqualSidesOfAnArray.findEvenIndex(new int[]{20,10,-80,10,10,15,35}));
    }

}

