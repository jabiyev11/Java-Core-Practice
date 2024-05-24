package week12.functional;

import java.util.function.Function;

public class FunctionExample {
    
    public static void main(String[] args) {

        Function<Integer, Integer> functionExample = x -> (5 * x * x);

        Integer result = functionExample.apply(6);
        System.out.println(result);
    }
}
