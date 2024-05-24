package week04;

import java.util.Scanner;

public class StringSort {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        String sorted = sortedString(input);

        System.out.println("Original String is: " + input);
        System.out.println("Sorted String is: " + sorted);

        sc.close();
    }

    public static String sortedString(String str){
        
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            boolean swapped = false;
            for(int j = 0; j < charArray.length - i - 1; j++){

                if(charArray[j] > charArray[j + 1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){  // means that string is already sorted in case of false
                break;
            }
        }
        String sorted = new String(charArray);
        return sorted;
    }
}
