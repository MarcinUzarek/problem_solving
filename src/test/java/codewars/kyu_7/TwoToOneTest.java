package codewars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoToOneTest {

    @Test
    public void should_merge_sort_and_distinct_strings() {
        assertEquals("aehrsty", TwoToOne.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }

    @Test
    void should_return_sorted_string() {
        String word = "word";
        assertEquals("dorw", TwoToOne.longest(word, word));
    }

}