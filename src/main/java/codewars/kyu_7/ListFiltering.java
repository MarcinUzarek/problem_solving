package codewars.kyu_7;


//In this kata you will create a function that takes a list of non-negative integers and strings
// and returns a new list with the strings filtered out.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {

    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(new Object[]{1, 2, 74, "daf", 8, "a", "b",})));
    }

     static List<Object> filterList(final List<Object> list) {

        return list.stream().filter(o -> o instanceof Integer)
                .collect(Collectors.toList());

    }
}
