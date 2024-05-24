package week12;

@FunctionalInterface
public interface Calculator {

    double calculate(double a, double b);
}

class CalculatorExample {

    public static void main(String[] args) {

        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b == 0) {
                System.out.println("Division by zero is not possible.");
                return Double.POSITIVE_INFINITY;

            }
            return a / b;

        };
        Calculator exponentiation = (a, b) -> Math.pow(a, b);

        // Let's test the working condition;

        double x = 5.6;
        double y = 3.5;

        System.out.println("Addition: " + addition.calculate(x, y));
        System.out.println("Subtraction: " + subtraction.calculate(x, y));
        System.out.println("Multiplication: " + multiplication.calculate(x, y));
        System.out.println("Division: " + division.calculate(x, y));
        System.out.println("Exponentiation: " + exponentiation.calculate(x, y));
    }
}
