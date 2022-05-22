package codewars.kyu_6;

public class EqualSidesOfAnArray {

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{20, 10, -80, 10, 10, 15, 35}));
    }


    static int findEvenIndex(int[] ints) {

        for (int i = 0; i <= ints.length; i++) {
            int left = 0;
            int right = 0;

            for (int l = 0; l < i; l++) {
                left += ints[l];
            }

            for (int r = i + 1; r < ints.length; r++) {
                right += ints[r];
            }

            if (right == left) {
                return i;
            }
        }
        return -1;
    }
}
