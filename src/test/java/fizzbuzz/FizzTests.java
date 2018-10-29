package fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzTests {

    @Test
    @Parameters({
            "3",
            "6",
            "9",
            "30",
            "33",
            "36",
            "39",
            "66",
            "99",
    })
    public void fizz_when_number_evenly_divisible_by_3(int number) {
        var fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.forNumber(number));
    }
}
