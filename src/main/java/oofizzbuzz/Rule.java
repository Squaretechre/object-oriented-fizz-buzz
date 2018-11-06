package oofizzbuzz;

@FunctionalInterface
interface Rule {
   String apply(int number);
}
