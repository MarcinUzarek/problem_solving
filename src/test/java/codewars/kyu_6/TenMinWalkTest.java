package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TenMinWalkTest {

    @Test
    void should_return_false_if_function_leads_to_same_place_but_is_shorter_than_10() {

        var expected = TenMinWalk.isValid(new char[]{'n', 'e', 's', 'w'});
        assertFalse(expected);
    }

    @Test
    void should_return_false_when_walk_is_ten_minutes_but_not_leading_to_start_point() {

        var expected = TenMinWalk.isValid(new char[]{'n', 'e', 's', 'w', 'n', 'n', 'n', 'e', 'e', 'w'});
        assertFalse(expected);
    }

    @Test
    void should_return_true_for_ten_minute_walk_leading_back_to_starting_point() {
        var expected = TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'});
        assertTrue(expected);
    }


}