import java.util.Scanner;
public class Primes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int isPrimeNumber = sc.nextInt();
        int count = 0;

        for(int i = 2; i <= Math.sqrt(isPrimeNumber); i++){
            if(isPrimeNumber % i == 0){
                count++;
               
            }          
        }

        if(count == 0){
            System.out.println(isPrimeNumber + " is a prime number");
        }
        else{
            System.out.println(isPrimeNumber + " is not a prime number");
        }
    
        sc.close();
    }
}
