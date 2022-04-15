package codewars.kyu_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScrambliesTest {

    @Test
    void should_be_able_to_scramble_word_if_has_all_letters() {

        boolean actual = Scramblies.scramble("rkqodlw","world");

        assertTrue(actual);
    }

    @Test
    void should_not_be_able_to_scramble_word_if_not_having_all_letters() {

        boolean actual = Scramblies.scramble("katas","steak");

        assertFalse(actual);
    }

    @Test
    void should_return_true_for_empty_strings() {

        boolean actual = Scramblies.scramble("","");

        assertTrue(actual);
    }
}
