import java.util.Scanner;
public class PrintingPatterns {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int patternNumber = sc.nextInt();
        for(int i = 0; i < patternNumber - 1; i++){
            for(int j = 0; j < patternNumber; j++){
                if((i + j) % 2 != 0){
                    System.out.print("# ");
                }
                    else {
                        System.out.print("* ");
                    }
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
