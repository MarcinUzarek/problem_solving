package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CountingDuplicatesTest {

    @Test
    void should_return_0_when_no_duplicates() {
        //given
        String string = "abcdefg";

        //when
        var result = CountingDuplicates.duplicateCount(string);

        //then
        assertThat(result, is(0));
    }

    @Test
    void should_return_5_when_5_signs_duplicates() {
        //given
        String string = "Aaabb3333Kkfdfj";

        //when
        var result = CountingDuplicates.duplicateCount(string);

        //then
        assertThat(result, is(5));
    }

}