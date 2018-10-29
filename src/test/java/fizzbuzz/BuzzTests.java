package fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class BuzzTests {

    @Test
    @Parameters({
            "5",
            "10",
            "25",
            "50",
            "55",
            "95",
            "100",
    })
    public void buzz_when_number_evenly_divisible_by_5(int number) {
        var fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.forNumber(number));
    }
}
