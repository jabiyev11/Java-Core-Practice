import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int  product = 1, count = 0;
        double average = 0, sum = 0;
        int number = sc.nextInt();
        while(number != 0){
            sum += number % 10;
            product *= number % 10;
            count++;
            average = sum / count;
            number /= 10;
        }

        System.out.println("The sum of numbers is "+ sum);
        System.out.println("The product of numbers is "+ product);
        System.out.println("The average of numbers is "+ average);

        sc.close();

    }
}
