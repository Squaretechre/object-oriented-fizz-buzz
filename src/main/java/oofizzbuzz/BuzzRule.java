package oofizzbuzz;

public class BuzzRule implements Rule {
    private Rule nextRule;

    BuzzRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public String applyTo(int number) {
        return number % 5 == 0
                ? "Buzz"
                : nextRule.applyTo(number);
    }
}
