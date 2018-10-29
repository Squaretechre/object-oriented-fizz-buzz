package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuzzTests {
    @Test
    public void buzz_when_number_evenly_divisible_by_5() {
        var fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.forNumber(5));
    }
}
