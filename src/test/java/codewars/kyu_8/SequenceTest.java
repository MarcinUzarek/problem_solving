package codewars.kyu_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SequenceTest {

    @Test
    void should_reverse_list() {
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, Sequence.reverse(9));
    }

    @Test
    void should_return_empty_list() {
        assertArrayEquals(new int[]{}, Sequence.reverse(0));
    }

}