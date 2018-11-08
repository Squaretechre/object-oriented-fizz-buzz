package oofizzbuzz;

public class WizzCompositeRule implements Rule {
    private Rule nextRule;

    WizzCompositeRule(Rule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public String applyTo(int number) {
        var combinedResult = fizzBuzzFor(number) + wizzFor(number);

        return combinedResult.isEmpty()
                ? nextRule.applyTo(number)
                : combinedResult;
    }

    private String fizzBuzzFor(int number) {
        return new FizzBuzzRule(
                    new FizzWhenDivisibleByThreeRule(
                            new BuzzRule(
                                    new NoMatchEmptyStringRule()))).applyTo(number);
    }

    private String wizzFor(int number) {
        return new WizzRule(
                    new NoMatchEmptyStringRule()).applyTo(number);
    }
}
