package codewars.kyu_8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertValuesTest {

    @Test
    public void testSomething() {

        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));

        input = new int[]{-1, 2, -3, 4, -5};
        expected = new int[]{1, -2, 3, -4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(InvertValues.invert(input)));
    }

    @Test
    void should_return_empty_arr_for_empty_input() {
        assertEquals(Arrays.toString(new int[]{}),
                Arrays.toString(InvertValues.invert(new int[]{})));
    }

    @Test
    void should_return_0_for_given_0_in_arr() {
        assertEquals(Arrays.toString(new int[]{0}),
                Arrays.toString(InvertValues.invert(new int[]{0})));
    }


}