package oofizzbuzz;

public class CompositeRule implements Rule {
    @Override
    public String apply(int number) {
        var noMatchRule = new NoMatchRule();
        var fizzWhenDivisibleByThreeRule = new FizzWhenDivisibleByThreeRule(noMatchRule);
        var fizzWhenContainsThreeRule = new FizzWhenNumberContainsThreeRule(fizzWhenDivisibleByThreeRule);
        var buzzRule = new BuzzRule(fizzWhenContainsThreeRule);
        var fizzBuzzRule = new FizzBuzzRule(buzzRule);

        return fizzBuzzRule.apply(number);
    }
}
