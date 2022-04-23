package codewars.kyu_6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberZooPatrolTest {


    @Test
    void should_find_missing_number() {
        assertEquals(2, NumberZooPatrol.findMissingNumber(new int[]{1, 3}));
        assertEquals(12, NumberZooPatrol.findMissingNumber(new int[]{13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
    }

    @Test
    void should_return_correct_number_border_cases() {
        assertEquals(1, NumberZooPatrol.findMissingNumber(new int[]{3, 4, 5, 6, 7}));
        assertEquals(5, NumberZooPatrol.findMissingNumber(new int[]{1, 3, 2, 4}));
    }

    @Test
    @Timeout(5)
    void should_work_fast_for_big_data() {
        int[] bigArray = new int[99999];

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = i + 1;
        }
        bigArray[10] = 100000;

        assertEquals(11, NumberZooPatrol.findMissingNumber(bigArray));
    }

}
