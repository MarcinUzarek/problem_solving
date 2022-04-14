package codewars.kyu_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PangramCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "The quick brown fox jumps over the lazy dog",
            "!@#$%&*(The quick brown fox jumps over the lazy dog",
            "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ"
    })
    void should_return_true_when_string_contains_all_letters_and_other_ascii_chars(String input) {
        //given
        //when
        var result = PangramChecker.check(input);

        //then
        assertTrue(result);
    }

    @Test
    void should_return_false_when_string_not_contain_all_letters() {
        //given
        String sentence = "You Should fail ;(";

        //when
        var result = PangramChecker.check(sentence);

        //then
        assertFalse(result);
    }

}