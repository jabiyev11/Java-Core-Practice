package week04;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first String: ");
        String firstString = sc.nextLine();

        System.out.print("Enter the second String: ");
        String secondString = sc.nextLine();

        sc.close();

        System.out.println(firstString + " and " + secondString + " are " + 
         (isAnagram(firstString, secondString) ? "anagrams" : "not anagrams"));

    }

    public static boolean isAnagram(String str1, String str2){
            boolean anagram = false;
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            if(str1.length() != str2.length()){
                return anagram;
            }

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            for(int i = 0; i < charArray1.length; i++){
                for(int j = 0; j < charArray1.length - i - 1; j++){
                    if(charArray1[j] > charArray1[j + 1]){
                        char temp = charArray1[j];
                        charArray1[j] = charArray1[j + 1];
                        charArray1[j + 1] = temp;
                    }
                }
            }

            for(int i = 0; i < charArray2.length; i++){
                for(int j = 0; j < charArray2.length - i - 1; j++){
                    if(charArray2[j] > charArray2[j + 1]){
                        char temp = charArray2[j];
                        charArray2[j] = charArray2[j + 1];
                        charArray2[j + 1] = temp;
                    }
                }
            }

            anagram = Arrays.equals(charArray1, charArray2);
            return anagram;
    }
    
    
}
