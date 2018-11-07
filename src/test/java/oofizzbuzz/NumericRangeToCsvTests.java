package oofizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumericRangeToCsvTests {
    @Test
    public void converts_list_of_strings_to_single_comma_separated_string() {
        var expected =
                "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, Fizz, 14, FizzBuzz";

        var numericRange = new NumericRange(1, 15);
        var csvNumericRange = new CommaSeparatedNumericRange(numericRange);
        assertThat(csvNumericRange.apply(new CompositeRule()), is(expected));
    }
}
