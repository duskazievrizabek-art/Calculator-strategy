package calculator;

public class SubtractStrategy implements CalculatorStrategy {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}