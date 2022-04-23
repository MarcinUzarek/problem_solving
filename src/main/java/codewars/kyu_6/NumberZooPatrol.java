package codewars.kyu_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NumberZooPatrol {

    public static void main(String[] args) {

        System.out.println(findMissingNumber(new int[]{1, 2, 3, 4, 5, 7}));
    }

    //Solution is working but can be done probably with better efficiency.
    static int findMissingNumber(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numbers.length + 1; i++) {
            list.add(i);
        }

        list.removeAll(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        return list.stream().findFirst().get();
    }

}
