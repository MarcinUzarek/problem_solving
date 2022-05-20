package codewars.kyu_4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopWordsTest {

    @Test
    void should_return_empty_array_when_no_words() {
        assertEquals(Arrays.asList(), TopWords.top3("  ,   .. "));
        assertEquals(Arrays.asList(), TopWords.top3("  ...  "));
    }

    @Test
    void should_ignore_apostrophe_when_no_letters_in_string() {
        assertEquals(Arrays.asList(), TopWords.top3("  '''  "));
    }

    @Test
    void should_return_array_with_correct_size_when_less_than_three_word() {
        assertEquals(Arrays.asList("won't", "wont"), TopWords.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"), TopWords.top3("  ... e /#@"));
    }

    @Test
    void should_return_correct_array() {
        assertEquals(Arrays.asList("e", "d", "a"), TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));

        assertEquals(Arrays.asList("a", "of", "on"), TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n"))));
    }

    @Test
    void big_random_string_should_return_correct_value() {
        assertEquals(Arrays.asList("cguzzpadad", "wifiunjqpl", "aywbtuz"),
                TopWords.top3(
                        "  aYWBtUZ CGUzZPAdAd WifiUNJQPL CGUzZPAdAd aYWBtUZ CGUzZPAdAd CGUzZPAdAd" +
                                " CGUzZPAdAd CGUzZPAdAd CGUzZPAdAd CGUzZPAdAd aYWBtUZ?WifiUNJQPL" +
                                " CGUzZPAdAd WifiUNJQPL aYWBtUZ aYWBtUZ,WifiUNJQPL,CGUzZPAdAd-WifiUNJQPL" +
                                " CGUzZPAdAd tgx/WifiUNJQPL WifiUNJQPL_CGUzZPAdAd_WifiUNJQPL CGUzZPAdAd.aYWBtUZ" +
                                " tgx aYWBtUZ CGUzZPAdAd!aYWBtUZ?aYWBtUZ aYWBtUZ aYWBtUZ aYWBtUZ WifiUNJQPL!CGUzZPAdAd" +
                                " WifiUNJQPL CGUzZPAdAd?aYWBtUZ/CGUzZPAdAd CGUzZPAdAd WifiUNJQPL aYWBtUZ CGUzZPAdAd AeZ" +
                                " CGUzZPAdAd!WifiUNJQPL;CGUzZPAdAd?WifiUNJQPL WifiUNJQPL CGUzZPAdAd CGUzZPAdAd_WifiUNJQPL" +
                                " tgx aYWBtUZ;WifiUNJQPL!AeZ CGUzZPAdAd:WifiUNJQPL,"));
    }
}