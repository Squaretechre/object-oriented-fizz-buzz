package oofizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EvilFizzBuzzTests {
    @Test
    public void produces_csv_string_of_evil_fizz_buzz_rules_applied_to_range_of_numbers() {
        var expected =
                "1, Wizz, FizzWizz, 4, BuzzWizz, Fizz, Wizz, 8, Fizz, Buzz, Wizz, Fizz, Wizz, 14, FizzBuzz";

        var rule = new WizzCompositeRule(new NoMatchRule());
        var actual = new CommaSeparatedNumericRange(new NumericRange(1, 15)).apply(rule);

        assertThat(actual, is(expected));
    }
}
