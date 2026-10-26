package calculator;

public class DivideStrategy implements CalculatorStrategy {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return firstNumber / secondNumber;
    }
}