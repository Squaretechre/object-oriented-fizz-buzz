package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzTests {
    @Test
    public void fizz_when_number_evenly_divisible_by_3() {
        var fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.forNumber(3));
    }
}
