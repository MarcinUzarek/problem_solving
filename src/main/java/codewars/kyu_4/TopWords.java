package codewars.kyu_4;

//Write a function that, given a string of text (possibly with punctuation and line-breaks),
// returns an array of the top-3 most occurring words, in descending order of the number of occurrences.
//
//        Assumptions:
//        A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
//        Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
//        Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
//        Matches should be case-insensitive, and the words in the result should be lowercased.
//        Ties may be broken arbitrarily.
//        If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned,
//        or an empty array if a text contains no words.

import java.util.*;

public class TopWords {

    public static void main(String[] args) {

        System.out.println(top3("aYWBtUZ CGUzZPAdAd WifiUNJQPL CGUzZPAdAd aYWBtUZ CGUzZPAdAd CGUzZPAdAd CGUzZPAdAd CGUzZPAdAd CGUzZPAdAd CGUzZPAdAd aYWBtUZ?WifiUNJQPL CGUzZPAdAd WifiUNJQPL aYWBtUZ aYWBtUZ,WifiUNJQPL,CGUzZPAdAd-WifiUNJQPL CGUzZPAdAd tgx/WifiUNJQPL WifiUNJQPL_CGUzZPAdAd_WifiUNJQPL CGUzZPAdAd.aYWBtUZ tgx aYWBtUZ CGUzZPAdAd!aYWBtUZ?aYWBtUZ aYWBtUZ aYWBtUZ aYWBtUZ WifiUNJQPL!CGUzZPAdAd WifiUNJQPL CGUzZPAdAd?aYWBtUZ/CGUzZPAdAd CGUzZPAdAd WifiUNJQPL aYWBtUZ CGUzZPAdAd AeZ CGUzZPAdAd!WifiUNJQPL;CGUzZPAdAd?WifiUNJQPL WifiUNJQPL CGUzZPAdAd CGUzZPAdAd_WifiUNJQPL tgx aYWBtUZ;WifiUNJQPL!AeZ CGUzZPAdAd:WifiUNJQPL,"));
    }

    public static List<String> top3(String s) {

        Map<String, Integer> counts = new HashMap<>();
        var results = new ArrayList<String>();

//        "[^a-zA-Z0-9-']"

        var arrayOfTheWords = s.replaceAll("[^a-zA-Z0-9-']", " ")
                .replace("-", " ")
                .trim().replaceAll(" +", " ")
                .toLowerCase()
                .split(" ");

        if (arrayOfTheWords[0].equals("")) {
            return results;
        }

        for (String word : arrayOfTheWords) {
            if (word.replace("'", "").length() != 0) {
                counts.putIfAbsent(word, 0);
                counts.compute(word, (key, val)
                        -> ++val);
            }
        }

        for (int i = 0; i < 3 && counts.size() > 0; i++) {
            String key = Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
            results.add(key);
            counts.remove(key);
        }
        return results;
    }
}
