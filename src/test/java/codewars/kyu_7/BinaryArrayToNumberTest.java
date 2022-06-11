package codewars.kyu_7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryArrayToNumberTest {

    @Test
    void should_return_zero_for_empty_list() {
        var result = BinaryArrayToNumber.ConvertBinaryArrayToInt(Collections.emptyList());

        assertThat(result, is(0));
    }

    @Test
    void should_convert_binary_to_decimal() {
        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(Arrays.asList(0, 0, 0, 1)));
        assertEquals(15, BinaryArrayToNumber.ConvertBinaryArrayToInt(Arrays.asList(1, 1, 1, 1)));
        assertEquals(6, BinaryArrayToNumber.ConvertBinaryArrayToInt(Arrays.asList(0, 1, 1, 0)));
        assertEquals(9, BinaryArrayToNumber.ConvertBinaryArrayToInt(Arrays.asList(1, 0, 0, 1)));
    }

    @Test
    void should_convert_for_bigger_numbers() {

        var result = BinaryArrayToNumber
                .ConvertBinaryArrayToInt(Arrays.asList(1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1));

        assertThat(result, is(64835));
    }
}