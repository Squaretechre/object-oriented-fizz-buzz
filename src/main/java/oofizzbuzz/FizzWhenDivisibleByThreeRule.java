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
    public String apply(int number) {
        return number % 3 == 0
                ? "Fizz"
                : nextRule.apply(number);
    }
}
