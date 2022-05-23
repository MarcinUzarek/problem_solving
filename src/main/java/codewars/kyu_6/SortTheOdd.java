package codewars.kyu_6;


//Task
//        You will be given an array of numbers.
//        You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
//
//        Examples
//        [7, 1]  =>  [1, 7]
//        [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
//        [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

import java.util.Arrays;

public class SortTheOdd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(SortTheOdd.sortArray(new int[]{7, 32, -3, -6, 2, 3, -27}))));

    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] % 2 != 0) {

                for (int j = i + 1; j < array.length; j++) {

                    if (array[j] % 2 != 0 && array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
