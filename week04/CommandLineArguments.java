package week04;

public class CommandLineArguments {
            public static void main(String[] args) {
                printArguments(args);

                int[] numbers = convertToIntArray(args);

                printArray(numbers);

                int sum = calculateSum(numbers);

                double average =  sum / (double) numbers.length;
                    
                System.out.println("Sum of array elements is: " + sum);
                System.out.println("Average of array elements is: " + average);
            }
            
            private static void printArguments(String[] args){

                System.out.println("Arguments passed in: ");

                for(String x: args){
                    System.out.println(x);
                }
            }

            private static int[] convertToIntArray(String[] args){
                    int[] numbers = new int[args.length];

                    for(int i = 0; i < args.length; i++){
                        numbers[i] = Integer.parseInt(args[i]);
                    }

                    return numbers;

            }

            private static void printArray(int[] array){
                System.out.println("Array of Integers: ");
                for(int number: array){
                    System.out.println(number);
                }
            }

            private static int calculateSum(int[] array){
                int sum = 0;
                for(int number: array){
                    sum += number;
                }
                return sum;
            }
}
    
