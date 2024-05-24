import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harmonicNumber = sc.nextInt();
        double sum = 0.0;

        for(int i = 1; i <= harmonicNumber; i++){
                sum += (1.0/i);
        }

        System.out.println(sum);

        sc.close();

    }
    
}
