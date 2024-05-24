package week04;
import java.util.Scanner;

public class StringReversed {

    public static void main(String[] args) {

        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String reversed = reverseString(input);

        System.out.println("Original is: " + input);
        System.out.println("Reversed is: " + reversed);

        sc.close();
    }

    public static String reverseString(String str){
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    
    }
    
    
}
