package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingLetterTest {

    @Test
    void should_find_missing_number() {
        assertEquals('e', MissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('j', MissingLetter.findMissingLetter(new char[] { 'g','h','i','k' }));
    }

}