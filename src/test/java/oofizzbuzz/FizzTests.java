package oofizzbuzz;

import org.junit.Test;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzTests {
    @Test
    public void range_containing_3_returns_list_containing_fizz() {
        var expected = asList("1", "2", "Fizz");
        var actual = new NumericRange(asList(1, 2, 3)).apply(new FizzWhenDivisibleByThreeRule());
        assertThat(actual, is(expected));
    }

    @Test
    public void numbers_evenly_divisible_by_3_return_fizz() {
        var expected = asList("1", "2", "Fizz", "4", "5", "Fizz");
        var actual = new NumericRange(asList(1, 2, 3, 4, 5, 6)).apply(new FizzWhenDivisibleByThreeRule());
        assertThat(actual, is(expected));
    }

    @Test
    public void numbers_containing_a_3_return_fizz() {
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
                "Fizz");
        var actual = new NumericRange(1, 13).apply(new CompositeRule());
        assertThat(actual, is(expected));
    }
}
