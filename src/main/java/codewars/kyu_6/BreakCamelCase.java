package codewars.kyu_6;

//Complete the solution so that the function will break up camel casing, using a space between words.
//
//        Example
//        "camelCasing"  =>  "camel Casing"
//        "identifier"   =>  "identifier"
//        ""             =>  ""

public class BreakCamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasingTest"));
    }

    public static String camelCase(String input) {
        String result = "";
        String upperCase = input.toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) != upperCase.charAt(i) ? result + input.charAt(i) : result + " " + input.charAt(i);
        }
        return result;
    }
}
