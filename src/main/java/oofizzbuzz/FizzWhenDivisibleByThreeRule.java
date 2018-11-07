package oofizzbuzz;

public class FizzWhenDivisibleByThreeRule implements Rule {
    private Rule nextRule;

    public FizzWhenDivisibleByThreeRule() {
        nextRule = new NoMatchRule();
    }

    public FizzWhenDivisibleByThreeRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public String applyTo(int number) {
        return number % 3 == 0
                ? "Fizz"
                : nextRule.applyTo(number);
    }
}
