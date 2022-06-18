package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {
    private final double precision = 0.0000000000001;

    @Test
    void should_find_odd_number() {
        assertEquals(1, UniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2, UniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }


}