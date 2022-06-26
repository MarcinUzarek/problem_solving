package codewars.kyu_6;

//Given a string of words, you need to find the highest scoring word.
//
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//        You need to return the highest scoring word as a string.
//
//        If two words score the same, return the word that appears earliest in the original string.
//
//        All letters will be lowercase and all inputs will be valid.

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HighestScoringWord {

    public static String high(String s) {
        var wordsScore = new LinkedHashMap<String, Integer>();
        var words = s.split(" ");

        for (String word : words) {
            int score = 0;

            //subtracting 96 because 'a' numerical representation is 97, 'b' = 98, 'c' = 99 etc..
            //after subtracting 'a' is 1, 'b' is 2, 'c' is 3 etc...
            for (int i = 0; i < word.length(); i++) {
                score += word.charAt(i) - 96;
            }
            wordsScore.put(word, score);
        }
        return Collections.max(wordsScore.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
