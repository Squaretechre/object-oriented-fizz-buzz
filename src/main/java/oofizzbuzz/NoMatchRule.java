package oofizzbuzz;

public class NoMatchRule implements Rule {
    @Override
    public String applyTo(int number) {
        return String.valueOf(number);
    }
}
