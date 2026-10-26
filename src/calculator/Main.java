package calculator;

import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final String EXIT_COMMAND = "exit";

    private static final Map<String, CalculatorStrategy> STRATEGIES = Map.of(
            "+", new AddStrategy(),
            "-", new SubtractStrategy(),
            "*", new MultiplyStrategy(),
            "/", new DivideStrategy()
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(new AddStrategy());
        boolean isRunning = true;

        while (isRunning) {
            System.out.print("Enter operation (+, -, *, /) or 'exit': ");
            String symbol = scanner.next();

            if (symbol.equals(EXIT_COMMAND)) {
                isRunning = false;
            } else {
                processOperation(scanner, calculator, symbol);
            }
        }
    }

    private static void processOperation(Scanner scanner, Calculator calculator, String symbol) {
        CalculatorStrategy strategy = STRATEGIES.get(symbol);

        if (strategy == null) {
            System.out.println("Unknown operation: " + symbol);
            return;
        }

        double firstNumber = readNumber(scanner, "First number: ");
        double secondNumber = readNumber(scanner, "Second number: ");

        calculator.setStrategy(strategy);
        printResult(calculator, firstNumber, secondNumber);
    }

    private static double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static void printResult(Calculator calculator, double firstNumber, double secondNumber) {
        try {
            System.out.println("Result: " + calculator.calculate(firstNumber, secondNumber));
        } catch (ArithmeticException exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}