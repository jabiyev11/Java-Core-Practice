import java.util.Scanner;
public class PolarityOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        if(firstNumber > 0){
            System.out.println("Positive");
        }
        else if(firstNumber < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Neutral");
        }

        sc.close();
}
}
