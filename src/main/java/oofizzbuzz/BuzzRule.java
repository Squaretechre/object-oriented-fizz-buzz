package oofizzbuzz;

public class BuzzRule implements Rule {
    private Rule nextRule;

    BuzzRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public String apply(int number) {
        return number % 5 == 0
                ? "Buzz"
                : nextRule.apply(number);
    }
}
