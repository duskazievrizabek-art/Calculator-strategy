package calculator;

public class Calculator {

    private CalculatorStrategy strategy;

    public Calculator(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double firstNumber, double secondNumber) {
        return strategy.execute(firstNumber, secondNumber);
    }
}