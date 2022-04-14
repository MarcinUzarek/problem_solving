package codewars.kyu_7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ListFilteringTest {

    @Test
    void should_filter_out_objects_which_are_not_integers() {
        //given
        List<Object> list = Arrays.asList("String", 4, 'a', 24, 16L, new ArrayList<>(), true);
        //when
        var filteredList = ListFiltering.filterList(list);

        //then
        filteredList.forEach(record ->
                assertThat(record, instanceOf(Integer.class)));
        assertThat(filteredList.size(), is(2));
    }

    @Test
    void should_return_empty_list_when_given_is_empty_too() {
        //given
        List<Object> list = Collections.emptyList();
        //when
        var filteredList = ListFiltering.filterList(list);

        //then
        assertTrue(filteredList.isEmpty());
    }



}