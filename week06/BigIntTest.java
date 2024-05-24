package week06;

import java.math.BigInteger;

public class BigIntTest {
    public static void main(String[] args) {
        BigInteger factorialResult = factorial(new BigInteger("35"));
        System.out.println("Factorial of 35 is: " + factorialResult);

        BigInteger powerResult = new BigInteger("2").pow(100);
        System.out.println("2 to the power 100 is: " + powerResult);
    }

    public static BigInteger factorial(BigInteger number){
        if(number.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }
        else{
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }

    }
}
