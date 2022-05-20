package codewars.kyu_3;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static codewars.kyu_3.TheMillionthFibonacci.fib;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class TheMillionthFibonacciTest {

    @Test
    void should_return_correct_values_for_negative_entry() {
        assertThat(fib(BigInteger.valueOf(-1)), is(1));
        assertThat(fib(BigInteger.valueOf(-2)), is(-1));
        assertThat(fib(BigInteger.valueOf(-5)), is(5));
        assertThat(fib(BigInteger.valueOf(-6)), is(-8));
    }

    @Test
    void should_work_for_large_positive_and_negative_numbers() {
        assertThat(fib(BigInteger.valueOf(2450)),
                is(new BigInteger("""
                        467986807230617714910953076537244448683512677900339401451602
                        591852976687921577218705506996988438899818486268024544561278
                        498228356102083414566421667927608996147715334941397636484130
                        774036503457241582019377217029503873611459399603342294950577
                        603116352525488543512984929284517355096725693013781711007419
                        888977423570711186329910370294824399509647994074085686420298
                        164862595366041280593489201707148883692381625349462617117121
                        129242727546663880189441591454259495376591403979266480531103
                        01643832591349746676162383432225""")));

        assertThat(fib(BigInteger.valueOf(-3200)),
                is(new BigInteger("""
                        -257610640709596932555361784958469927112418428321666809527044
                        785260580023313639886672848920497647618116895348882599631602
                        210656476372155116588300708647346963633914239720883918445934
                        027971195489231622046923306509340011667510001692291211799980
                        364264118686682647224686572973801721438389183097490538122721
                        575700216535276481308758262049381013990122942319373298240777
                        707958084559207443117931583204589907851700867867432714379009
                        625449225057325618974698286276711204136607645052719549434737
                        698114082856587457282174926929064127434279892426804815502210
                        453990583143901561627496857988295949031828165797721437675788
                        585848683595728231820882497098989325903183663578924929262474
                        643235525""")));
    }

    @Test
    void should_return_0_for_given_0() {
        assertThat(fib(BigInteger.valueOf(0)), is(0));
    }

    @Test
    void should_return_correct_values_for_positive_entry() {
        assertThat(fib(BigInteger.valueOf(4)), is(3));
        assertThat(fib(BigInteger.valueOf(9)), is(34));
    }

}