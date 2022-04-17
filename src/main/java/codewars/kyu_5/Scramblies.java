package codewars.kyu_5;

//Complete the function scramble(str1, str2) that returns true if
// a portion of str1 characters can be rearranged to match str2, otherwise returns false.
//
//        Notes:
//
//        Only lower case letters will be used (a-z). No punctuation or digits will be included.
//        Performance needs to be considered.
//        Examples
//        scramble('rkqodlw', 'world') ==> True
//        scramble('cedewaraaossoqqyt', 'codewars') ==> True
//        scramble('katas', 'steak') ==> False


public class Scramblies {

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
    }


    static boolean scramble(String str1, String str2) {

        while (str2.length() > 0) {
            char letter = str2.charAt(0);
            int initialWordLength = str2.length();
            str2 = str2.replace(String.valueOf(letter), "");
            int letterRepetitions = initialWordLength - str2.length();

            int initialStringLength = str1.length();
            str1 = str1.replace(String.valueOf(letter), "");
            int repetitionsInBaseString = initialStringLength - str1.length();

            if (repetitionsInBaseString < letterRepetitions) {
                return false;
            }
        }
        return true;
    }
}
