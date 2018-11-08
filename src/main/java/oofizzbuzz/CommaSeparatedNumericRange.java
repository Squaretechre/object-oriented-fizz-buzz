package oofizzbuzz;

class CommaSeparatedNumericRange {
    private NumericRange numericRange;

    CommaSeparatedNumericRange(NumericRange numericRange) {
        this.numericRange = numericRange;
    }

    String apply(Rule compositeRule) {
        return String.join(", ", numericRange.apply(compositeRule));
    }
}
