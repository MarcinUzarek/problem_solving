package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {

    @Test
    void basic_tests() {
        assertEquals(3, Persist.persistence(39));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    void should_return_0_for_one_digit_number() {
        assertEquals(0, Persist.persistence(4));
    }

}