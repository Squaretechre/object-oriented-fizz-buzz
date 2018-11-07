package oofizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NumericRange {
    private List<Integer> range;

    NumericRange(List<Integer> range) {
        this.range = range;
    }

    NumericRange(int start, int end) {
        range = IntStream.range(start, end + 1)
                .boxed()
                .collect(Collectors.toList());
    }

    List<String> apply(Rule rule) {
        return range
                .stream()
                .map(rule::applyTo)
                .collect(Collectors.toList());
    }
}
