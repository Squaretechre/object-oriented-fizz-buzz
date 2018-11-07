package oofizzbuzz;

@FunctionalInterface
interface Rule {
   String applyTo(int number);
}
