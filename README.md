# Strategy Calculator

Console calculator built with the Strategy design pattern.

## How to build and run

```bash
javac -d out src/calculator/*.java
java -cp out calculator.Main
```

Or open the project in IntelliJ IDEA and run `Main`.

## How to add a new strategy

1. Create a class that implements `CalculatorStrategy`, for example `PowerStrategy`.
2. Implement the `execute` method.
3. Register it in the `STRATEGIES` map in `Main`: `"^", new PowerStrategy()`.

`Calculator` and the existing strategies are not changed.