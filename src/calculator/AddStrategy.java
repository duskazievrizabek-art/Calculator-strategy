package calculator;

public class AddStrategy implements CalculatorStrategy {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
}