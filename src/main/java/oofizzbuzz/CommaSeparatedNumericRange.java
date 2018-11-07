package oofizzbuzz;

class CommaSeparatedNumericRange {
    private NumericRange numericRange;

    CommaSeparatedNumericRange(NumericRange numericRange) {
        this.numericRange = numericRange;
    }

    String apply(CompositeRule compositeRule) {
        return String.join(", ", numericRange.apply(compositeRule));
    }
}
