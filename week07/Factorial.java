package week07;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();

            //d compiler does not impose us to handle it, because this is exception unchecked, which occures in run time.

            try{
                if(num < 0){
                    throw new IllegalArgumentException("Negative numbers are not allowed!");
                }
                System.out.printf("%d! is %d\n", num, factorial(num));
            }

            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            
        }

        scan.close();
    }

    static int factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        return f;
    }
}