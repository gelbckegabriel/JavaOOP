package relations.interface_;

public class Calculator implements ArithmeticOperators {


    @Override
    public void sum(double value1, double value2) {
        System.out.println("Sum: " + (value1 + value2));
    }

    @Override
    public void subtraction(double value1, double value2) {
        System.out.println("Subtraction: " + (value1 - value2));
    }

    @Override
    public void multiplication(double value1, double value2) {
        System.out.println("Multiplication: " + (value1 * value2));
    }

    /*@Override // IT NEEDS TO USE EVERY METHODS.
    public void division(double value1, double value2) {
        System.out.println("Division: " + (value1 / value2));
    }*/
}
