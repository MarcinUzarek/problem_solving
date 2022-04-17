package codewars.kyu_6;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DRootTest {

    @Test
    public void should_return_given_number_if_its_one_digit() {
        assertThat(DRoot.digital_root(7), is(7));
    }

   @Test
    public void should_be_able_to_calculate_digital_root_for_multi_digit_numbers() {
        assertThat(DRoot.digital_root(27518), is(5));
        assertThat(DRoot.digital_root(493193), is(2));
        assertThat(DRoot.digital_root(132189), is(6));

    }
}
