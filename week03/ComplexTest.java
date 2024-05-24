import math.ComplexNumber;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(3, 4);
        ComplexNumber number2 = new ComplexNumber(5, 2);

        System.out.println("First complex number: " + number1);
        System.out.println("Second complex number: " + number2);

        System.out.println("Sum of the numbers: " + number1.add(number2));
        System.out.println("Subtraction of the numbers: " + number1.sub(number2));
        System.out.println("Multiplication of the numbers: " + number1.mult(number2));
        System.out.println("Conjugent of the first number: " + number1.conjugate());
        System.out.println("Absolute value of the first number: " + number1.abs());


        
    }
}
