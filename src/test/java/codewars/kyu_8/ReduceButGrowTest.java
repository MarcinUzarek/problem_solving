package codewars.kyu_8;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReduceButGrowTest {

    @Test
    void should_multiply_all_numbers_from_arr() {
        assertEquals(6, ReduceButGrow.grow(new int[]{1, 2, 3}));
        assertEquals(16, ReduceButGrow.grow(new int[]{4, 1, 1, 1, 4}));
        assertEquals(64, ReduceButGrow.grow(new int[]{2, 2, 2, 2, 2, 2}));
    }
}