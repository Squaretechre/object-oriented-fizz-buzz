package oofizzbuzz;

public class NoMatchRule implements Rule {
    @Override
    public String apply(int number) {
        return String.valueOf(number);
    }
}
