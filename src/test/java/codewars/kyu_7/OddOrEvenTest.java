package codewars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOrEvenTest {

    @Test
    void should_return_even_for_empty_arr() {
        var result = OddOrEven.oddOrEven(new int[]{});

        assertThat(result, is("Even"));
    }

    @Test
    void should_return_odd() {
            assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }

    @Test
    void should_return_even() {
        assertEquals("even", OddOrEven.oddOrEven(new int[] {2, 5, 35, 6}));
    }

}