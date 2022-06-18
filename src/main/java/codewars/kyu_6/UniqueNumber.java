package codewars.kyu_6;

//There is an array with some numbers. Try to find the non-repetitive one!
//
//        Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//        Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

//        It’s guaranteed that array contains at least 3 numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumber {

    public static double findUniq(double[] arr) {

        var list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (Double number : list) {
            int start = list.size();
            list.removeAll(List.of(number));

            if (start - 1 == list.size()) {
                return number;
            }
        }

        return list.get(0);
    }
}
