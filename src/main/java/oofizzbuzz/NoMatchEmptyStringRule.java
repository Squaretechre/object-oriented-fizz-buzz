package oofizzbuzz;

public class NoMatchEmptyStringRule implements Rule {
    @Override
    public String applyTo(int number) {
        return "";
    }
}
