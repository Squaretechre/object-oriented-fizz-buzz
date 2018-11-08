package oofizzbuzz;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WizzTests {
    @Test
    public void range_containing_15_returns_list_containing_buzz() {
        var expected = asList(
                "1",
                "Wizz",
                "FizzWizz",
                "4",
                "BuzzWizz",
                "Fizz",
                "Wizz",
                "8",
                "Fizz",
                "Buzz",
                "Wizz",
                "Fizz",
                "Wizz",
                "14",
                "FizzBuzz"
        );

        var rule = new WizzCompositeRule(new NoMatchRule());
        assertThat(new NumericRange(1, 15).apply(rule), is(expected));
    }
}
