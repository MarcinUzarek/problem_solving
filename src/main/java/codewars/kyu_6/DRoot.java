package codewars.kyu_6;

//Digital root is the recursive sum of all the digits in a number.
//
//        Given n, take the sum of the digits of n. If that value has more than one digit,
//        continue reducing in this way until a single-digit number is produced.
//        The input will be a non-negative integer.
//
//        Examples
//        16  -->  1 + 6 = 7
//        942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
//        132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
//        493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

public class DRoot {

    public static void main(String[] args) {
        System.out.println(digital_root(942));
    }

    static int digital_root(int n) {

        while (true) {
            int sum = 0;
            var digits = String.valueOf(n).split("");

            for (String digit : digits) {
                sum += Integer.parseInt(digit);
            }

            if (sum > 9) {
                n = sum;
            } else {
                return sum;
            }
        }
    }
}
