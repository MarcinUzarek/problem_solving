package codewars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


class TrollTest {

    @Test
    void should_remove_all_vowels() {
        //given
        String word = "\"Stewardesses\" is the longest word that is typed with only the left hand.";
        String expected = "\"Stwrdsss\" s th lngst wrd tht s typd wth nly th lft hnd.";

        //when
        var actual = Troll.disemvowel(word);

        //then
        assertThat(actual, equalTo(expected));
    }

}