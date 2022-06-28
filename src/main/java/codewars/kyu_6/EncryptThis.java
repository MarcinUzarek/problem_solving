package codewars.kyu_6;

//Description:
//        Encrypt this!
//
//        You want to create secret messages which can be deciphered by the Decipher this! kata. Here are the conditions:
//
//        Your message is a string containing space separated words.
//        You need to encrypt each word in the message using the following rules:
//        The first letter must be converted to its ASCII code.
//        The second letter must be switched with the last letter
//        Keepin' it simple: There are no special characters in the input.
//        Examples:
//        Kata.encryptThis("Hello") => "72olle"
//        Kata.encryptThis("good") => "103doo"
//        Kata.encryptThis("hello world") => "104olle 119drlo"

import java.util.Arrays;

public class EncryptThis {

    public static String encryptThis(String text) {

        if (text.trim().equals("")) {
            return text;
        }

        return Arrays.stream(text.split(" "))
                .map(EncryptThis::encryptWord)
                .reduce("", (a, b) -> a + " " + b)
                .trim();
    }

    private static String encryptWord(String word) {

        if (word.length() == 1) {
            return encryptFirstLetterToASCII(word);
        }

        if (word.length() == 2) {
            return encryptTwoLetterWord(word);
        }

        return encryptForWordAtLeast3Letters(word);
    }

    private static String encryptForWordAtLeast3Letters(String word) {
        var firstLetterEncrypted = encryptFirstLetterToASCII(word);
        var secondLetter = word.substring(1, 2);
        var lastLetter = word.substring(word.length() - 1);
        var wordWithoutFirstTwoAndLastLetters = word.substring(2, word.length() - 1);

        return firstLetterEncrypted + lastLetter + wordWithoutFirstTwoAndLastLetters + secondLetter;
    }

    private static String encryptTwoLetterWord(String twoLetterWord) {
        var firstLetterEncrypted = encryptFirstLetterToASCII(twoLetterWord);
        return firstLetterEncrypted + twoLetterWord.charAt(1);
    }

    private static String encryptFirstLetterToASCII(String oneLetterWord) {
        return (int) oneLetterWord.charAt(0) + "";
    }
}
