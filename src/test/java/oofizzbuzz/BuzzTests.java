package oofizzbuzz;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BuzzTests {
    @Test
    public void range_containing_5_returns_list_containing_buzz() {
        var expected = asList(
                "1", "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz");
        assertThat(new NumericRange(asList(1, 2, 3, 4, 5, 6)).apply(new CompositeRule()),
                is(expected));
    }
}
