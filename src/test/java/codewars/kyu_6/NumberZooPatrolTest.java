package codewars.kyu_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(5)
class NumberZooPatrolTest {



    @Test
    void should_find_missing_number() {
        assertEquals(2, NumberZooPatrol.findMissingNumber(1, 3));
        assertEquals(1, NumberZooPatrol.findMissingNumber(2, 3, 4));
        assertEquals(12, NumberZooPatrol.findMissingNumber(13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8));
    }

    @Test
    void should_work_fast_for_big_data() {


    }

}
