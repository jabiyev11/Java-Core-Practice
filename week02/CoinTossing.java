import java.util.Scanner;

public class CoinTossing {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tossCount = sc.nextInt();
        int headsCount = 0;
        int tailsCount = 0;
        for(int i = 1; i <= tossCount; i++){
             double tempNumber = Math.random();
                if(tempNumber < 0.5){
                    headsCount++;
                }
                else{
                    tailsCount++;
                }
        }

        double headsProbability = (double) headsCount / tossCount;
        double tailsProbabilty = (double) tailsCount / tossCount;

        System.out.println("Probability of Heads is " + headsProbability);
        System.out.println("Probability of Tails is " + tailsProbabilty);

        sc.close();
    }
}
