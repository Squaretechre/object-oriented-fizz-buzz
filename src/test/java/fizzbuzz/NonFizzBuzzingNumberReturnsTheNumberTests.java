package fizzbuzz;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NonFizzBuzzingNumberReturnsTheNumberTests {

    @Test
    public void returns_string_1_for_number_1 () {
        var fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.forNumber(1));
    }

    @Test
    public void returns_string_2_for_number_2 () {
        var fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.forNumber(2));
    }
}
