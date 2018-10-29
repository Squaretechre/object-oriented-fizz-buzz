package fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTests {

    @Test
    @Parameters({
            "15",
            "30",
            "45",
            "60",
            "75",
            "90",
    })
    public void fizzbuzz_when_number_evenly_divisible_by_both_3_and_5(int number) {
        var fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.forNumber(number));
    }
}
