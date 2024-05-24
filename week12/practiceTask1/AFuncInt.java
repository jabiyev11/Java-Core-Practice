package week12.practiceTask1;

@FunctionalInterface
public interface AFuncInt {
    void apply(String input);

    static void print(String input){
        System.out.println(input);
    }

    default void print(String input1, String input2){
        System.out.println("The result is: " + input1 + " and " + input2);
    }
}
