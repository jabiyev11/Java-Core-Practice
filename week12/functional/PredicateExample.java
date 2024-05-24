package week12.functional;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

     
        System.out.println("Is 6 even number? " + isEven.test(6));
        System.out.println("Is 9 even number? " + isEven.test(9));
    }

}
