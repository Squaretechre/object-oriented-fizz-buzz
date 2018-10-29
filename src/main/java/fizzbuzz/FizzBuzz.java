package fizzbuzz;

class FizzBuzz {
    String forNumber(int number) {
        if(number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
