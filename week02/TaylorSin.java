import java.util.Scanner;

public class TaylorSin {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        float x = sc.nextFloat();

        double sinx = calculateTaylorSin(x, n);
        double mathSinx = Math.sin(x);

        System.out.println("The calculated sine with Taylor series: " + sinx);
        System.out.println("The calculated sine with Math.sin: " + mathSinx);

        sc.close();
       
    }

    public static double calculateTaylorSin(double x, int n){
        // method to calculate Taylor series using Math library
        double sum = 0.0;
        for(int i = 0; i <= n; i++){
        sum += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1); 
        }
        return sum;
    }

    

    public static long factorial(int number){

        // simple method to calculate factorial of a given number

        long result = 1;
        for(int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }

    
    
}
