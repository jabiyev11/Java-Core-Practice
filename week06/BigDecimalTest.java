package week06;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        
        BigDecimal firstNumber = new BigDecimal("1.95");
        BigDecimal secondNumber = new BigDecimal("2.35");
        BigDecimal substractionResult = secondNumber.subtract(firstNumber);
        System.out.println("The difference between 2.35 and 1.95 is: " + substractionResult);

        BigDecimal firstNumber2 = new BigDecimal("1000000.0");
        BigDecimal secondNumber2 = new BigDecimal("1.2");
        BigDecimal additionResult = firstNumber2.add(secondNumber2);
        BigDecimal finalResult = additionResult.subtract(firstNumber2);
        System.out.println("The result of 1000000.0f + 1.2f - 1000000.0f is: " + finalResult);

    }
}
