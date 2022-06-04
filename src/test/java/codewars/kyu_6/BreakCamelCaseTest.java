package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreakCamelCaseTest {

    @Test
    void should_not_change_anything_for_one_word() {
        assertEquals("camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }

    @Test
    void should_break_correctly_for_multi_words_string() {
        assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
    }

    @Test
    void should_return_empty_string() {
        assertEquals("", BreakCamelCase.camelCase(""));
    }

}