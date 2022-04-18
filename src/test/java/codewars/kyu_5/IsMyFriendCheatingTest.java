package codewars.kyu_5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsMyFriendCheatingTest {


    @Test
    void should_find_correct_exclusions() {
        //given
        List<long[]> expected = Arrays.asList(new long[]{15, 21}, new long[]{21, 15});

        //when
        List<long[]> actual = IsMyFriendCheating.removNb(26);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_return_empty_list_if_no_exclusions_found() {
        //given
        List<long[]> expected = Collections.emptyList();

        //when
        List<long[]> actual = IsMyFriendCheating.removNb(2);

        //then
        assertEquals(expected, actual);
    }
}
