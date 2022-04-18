package codewars.kyu_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrambliesTest {


    @Test
    void should_return_true_if_has_all_letters() {

        boolean actual = Scramblies.scramble("rkqodlw", "world");

        assertTrue(actual);
    }

    @Test
    void should_return_true_for_empty_strings() {

        boolean actual = Scramblies.scramble("", "");

        assertTrue(actual);
    }

    @Test
    void should_return_false_if_not_having_all_letters() {

        boolean actual = Scramblies.scramble("katas", "steak");

        assertFalse(actual);
    }

    @Test
    void should_return_false_if_have_all_letters_but_too_low_amount() {

        var actual = Scramblies.scramble("aa", "aaa");

        assertFalse(actual);
    }

}
