import java.util.Scanner;
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = 0;

        if(firstNumber > secondNumber){
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp; 
        }

        for(int i = firstNumber; i <= secondNumber; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);



        sc.close();
    }
}
