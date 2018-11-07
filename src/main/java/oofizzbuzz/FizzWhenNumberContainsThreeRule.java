package oofizzbuzz;

public class FizzWhenNumberContainsThreeRule implements Rule {
    private Rule nextRule;

    FizzWhenNumberContainsThreeRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public String applyTo(int number) {
        return String.valueOf(number).contains("3")
                ? "Fizz"
                : nextRule.applyTo(number);
    }
}
