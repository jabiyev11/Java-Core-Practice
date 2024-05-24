
import java.util.Scanner;
public class RandomPointsInCircle {
    
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);

        int numberOfPoints = sc.nextInt();


        for(int i = 1; i <= numberOfPoints; i++){
            double xAxisPoint = Math.random() * 2 - 1; // Considering the range [-1, 1]
            double yAxisPoint = Math.random() * 2 - 1;
    
            System.out.printf("%f %f\n", xAxisPoint, yAxisPoint);
        }

        sc.close();
    }
}
