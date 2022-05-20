package google_foobar.level_2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class ChessKnightTest {

    @Test
    void should_return_zero_if_knight_is_on_destination_square() {
        //given
        //when
        var answer = ChessKnight.answer(13, 13);

        //then
        assertThat(answer, is(0));
    }

//    @Test
//    void should_return_correct_numbers_of_moves_in_shortest_path() {
//        assertThat(ChessKnight.answer(1, 18), is(1));
//        assertThat(ChessKnight.answer(19, 26), is(1));
//        assertThat(ChessKnight.answer(7, 12), is(2));
//        assertThat(ChessKnight.answer(0, 1), is(3));
//        assertThat(ChessKnight.answer(1, 34), is(3));
//        assertThat(ChessKnight.answer(0, 63), is(7));
//    }

}