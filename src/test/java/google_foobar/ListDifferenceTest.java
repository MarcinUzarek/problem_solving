package google_foobar;

import org.junit.jupiter.api.Test;

import static google_foobar.ListDifference.solution;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ListDifferenceTest {

    @Test
    void should_return_different_value() {
        //given
        var arr = new int[]{14, 27, 1, 4, 2, 50, 3, 1};
        var secondArr = new int[]{2, 4, -4, 3, 1, 1, 14, 27, 50};

        //when
        var solution = solution(arr, secondArr);

        //then
        assertThat(solution, is(-4));
    }

    @Test
    void should_return_only_given_value_for_empty_array() {
        //given
        var arr = new int[]{};
        var secondArr = new int[]{1};

        //when
        var solution = solution(arr, secondArr);

        //then
        assertThat(solution, is(1));
    }
}