package week04;

import java.util.Scanner;

public class StringExploded {
    
    public static void main(String[] args) {
        System.out.print("Enter the string: ");

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String exploded = stringExploder(input);

        System.out.println("Original String: " + input);
        System.out.println("Exploded String: " + exploded);

        sc.close();
    }

    public static String stringExploder(String str){
        StringBuilder exploder = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j <= i; j++){
                exploder.append(str.charAt(j));
            }
        }

        return exploder.toString();
    }
}
