package oofizzbuzz;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTests {
    @Test
    public void range_containing_15_returns_list_containing_buzz() {
        var expected = asList(
                "1", "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7", "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "Fizz",
                "14",
                "FizzBuzz");
        assertThat(new NumericRange(1, 15).apply(new CompositeRule()), is(expected));
    }
}
