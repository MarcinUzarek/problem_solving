package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestScoringWordTest {

    @Test
    public void should_find_highest_scored_word() {
        assertEquals("taxi", HighestScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", HighestScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", HighestScoringWord.high("take me to semynak"));
    }

    @Test
    public void should_return_first_appeared_word_when_score_equal() {
        assertEquals("aa", HighestScoringWord.high("aa b"));
        assertEquals("b", HighestScoringWord.high("b aa"));
        assertEquals("d", HighestScoringWord.high("d bb"));
        assertEquals("aaa", HighestScoringWord.high("aaa b"));
    }

}