package week04;
import java.util.Scanner;

public class StringMixed {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        sc.close();

        System.out.println("Original string is "+ sentence);
        System.out.println("Mixed string is "+ mixedString(sentence));


    }

    public static String mixedString(String sentence){

        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = swapFirstAndLast(words[i]);
        }
        return String.join(" ", words);

    }

    public static String swapFirstAndLast(String word){
        if(word.length() <= 1){
            return word;
        }

        return word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) 
        + word.charAt(0);
    }
}
