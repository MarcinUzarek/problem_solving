package codewars.kyu_4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class LargeFactorialsTest {

    @Test
    void should_return_null_for_given_negative_integer() {

        var result = LargeFactorials.factorial(-4);

        assertThat(result, is(null));
    }

    @Test
    void should_return_1_for_given_0(){

        var result = LargeFactorials.factorial(0);

        assertThat(result, is("1"));
    }

    @Test
    void should_return_correct_values_for_args_in_range() {
        assertEquals("1", LargeFactorials.factorial(1));
        assertEquals("120", LargeFactorials.factorial(5));
        assertEquals("362880", LargeFactorials.factorial(9));
        assertEquals("1307674368000", LargeFactorials.factorial(15));
    }

}