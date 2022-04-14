package codewars.kyu_6;

//A pangram is a sentence that contains every single letter of the alphabet at least once.
// For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
// because it uses the letters A-Z at least once (case is irrelevant).

//        Given a string, detect whether it is a pangram.
//        Return True if it is, False if not. Ignore numbers and punctuation.

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public class PangramChecker {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog.!@#$%"));
    }

    static boolean check(String sentence) {

        var splitted = stream(sentence.replace(" ", "")
                .split(""))
                .map(string -> Character.getNumericValue(string.charAt(0)))
                .filter(intValue -> intValue > 9 && intValue < 36)
                .distinct()
                .collect(toList());
        return splitted.size() == 26;
    }
}