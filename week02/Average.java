import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        while(sc.hasNextInt()){
            int number = sc.nextInt();
            sum += number;
            count++;
        }
        sc.close();

        if(count == 0){
            System.out.println("Error: No input was given to calculate the average");
        }
        else{
            double average = (double) sum / count;
            System.out.println("Average of the numbers is "+ average);
        }
    }
}
