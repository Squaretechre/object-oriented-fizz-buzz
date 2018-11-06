package oofizzbuzz;

public class FizzBuzzRule implements Rule {
    private Rule nextRule;

    FizzBuzzRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
   public String apply(int number) {
        return number % 5 == 0 && number % 3 == 0
                ? "FizzBuzz"
                : nextRule.apply(number);
    }
}
