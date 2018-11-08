package oofizzbuzz;

import java.util.stream.LongStream;

public class WizzRule implements Rule {
    private Rule nextRule;

    WizzRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public String applyTo(int number) {
        return isPrime(number)
                ? "Wizz"
                : nextRule.applyTo(number);
    }

    private boolean isPrime(long number) {
        return number > 1 && LongStream
                .rangeClosed(2, (long)Math.sqrt(number))
                .noneMatch(div-> number % div == 0);
    }
}
