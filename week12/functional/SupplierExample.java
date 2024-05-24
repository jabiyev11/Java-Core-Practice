package week12.functional;

import java.util.function.Supplier;

public class SupplierExample {
    
    public static void main(String[] args) {

        Supplier<Integer> randomNumber = () -> (int) (100 * Math.random());

       System.out.println("Random number: " + randomNumber.get());
    }
}
