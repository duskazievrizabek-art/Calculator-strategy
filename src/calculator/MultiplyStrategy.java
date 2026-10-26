package calculator;

public class MultiplyStrategy implements CalculatorStrategy {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}