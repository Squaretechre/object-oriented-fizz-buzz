package oofizzbuzz;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NonFizzBuzzNumberTests {
    @Test
    public void single_number_returns_list_containing_only_that_number() {
        var expected = singletonList("1");
        var actual = new NumericRange(singletonList(1)).apply(String::valueOf);
        assertThat(actual, is(expected));
    }

    @Test
    public void two_numbers_returns_list_containing_those_numbers() {
        var expected = asList("1", "2");
        var actual = new NumericRange(asList(1, 2)).apply(String::valueOf);
        assertThat(actual, is(expected));
    }
}

