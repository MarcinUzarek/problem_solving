package codewars.kyu_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//You're working in a number zoo, and it seems that one of the numbers has gone missing!
//
//        Zoo workers have no idea what number is missing, and are too incompetent to figure it out,
//        so they're hiring you to do it for them.
//
//        In case the zoo loses another number,
//        they want your program to work regardless of how many numbers there are in total.
//
//        Task:
//        Write a function that takes a shuffled list of unique numbers from 1 to n
//        with one element missing (which can be any number including n). Return this missing number.
//
//        Note: huge lists will be tested.
//
//        Examples:
//        [1, 3, 4]  =>  2
//        [1, 2, 3]  =>  4
//        [4, 2, 3]  =>  1

public class NumberZooPatrol {

    public static void main(String[] args) {

        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4, 5, 7, 8}));
    }

    static int findMissingNumber(int[] numbers) {
        return IntStream.rangeClosed(1, numbers.length + 1).sum() - Arrays.stream(numbers).sum();
    }


    //This Solution is working but can be done with better efficiency.
    static int findMissingNumber_toUpgrade(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numbers.length + 1; i++) {
            list.add(i);
        }

        list.removeAll(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        return list.get(0);
    }

}
