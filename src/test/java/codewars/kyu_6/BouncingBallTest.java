package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BouncingBallTest {

    @Test
    void should_count_bounces() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }

    @Test
    void should_be_seen_only_once() {
        assertEquals(1, BouncingBall.bouncingBall(5.0, 0.5, 4.5));
    }

    @Test
    void should_return_minus_one_for_wrong_input() {
        assertEquals(-1, BouncingBall.bouncingBall(5.0, 1, 4.5));
        assertEquals(-1, BouncingBall.bouncingBall(5.0, -0.66, 4.5));
        assertEquals(-1, BouncingBall.bouncingBall(-5.0, 0.66, 4.5));
        assertEquals(-1, BouncingBall.bouncingBall(5.0, 0.66, -2));
        assertEquals(-1, BouncingBall.bouncingBall(5.0, 0.66, 7));
    }

}