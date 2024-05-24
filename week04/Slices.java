package week04;
import java.util.Scanner;

public class Slices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = sc.nextLine();

        sc.close();
        divideIntoSlices(string);
        
    }

    public static void divideIntoSlices(String string){
 
        System.out.println("Slices of the " + string);
        System.out.println(string);
        for(int i = 1; i < string.length(); i++){

            System.out.println(string.substring(0, i) + " " + string.substring(i));
            
        }
    }
    
    
    
}
