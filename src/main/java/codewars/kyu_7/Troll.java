package codewars.kyu_7;

import java.util.Arrays;
import java.util.List;

//Trolls are attacking your comment section!
//
//        A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//        Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//        For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//        Note: for this kata y isn't considered a vowel.

public class Troll {

    public static void main(String[] args) {

        System.out.println(
                disemvowel("\"Stewardesses\" is the longest word that is typed with only the left hand."));
    }

     static String disemvowel(String str) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");

        for (String vowel : vowels) {
            str = str.replace(vowel, "");
            str = str.replace(vowel.toUpperCase(), "");
        }
        return str;
    }

}
