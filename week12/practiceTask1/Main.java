package week12.practiceTask1;

public class Main {
    public static void main(String[] args) {

        AFuncInt anonymousInstance = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous instance: " + input);
            }
        };

        anonymousInstance.apply("Hello from China");

        AFuncInt.print("Static Method");

        anonymousInstance.print("World", "Mars");

        AFuncInt lambdaInstance = (input) -> System.out.println("Lambda Format");

        lambdaInstance.apply("Hello from China(Lambda)");

        AFuncInt.print("Static Method(Lambda edition)");

        lambdaInstance.print("Lambda", "Generics");

    }
}
