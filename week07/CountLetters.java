package week07;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            counts = new int[26];
            System.out.print("Enter a word, preferrably only english letters (0 to exit): ");
            word = scan.nextLine();

            word = word.toLowerCase();

            if (word.trim().equals("0"))
                break;

            try {
                for (int i = 0; i < word.length(); i++) {
                    char ch = word.charAt(i);
                    if (Character.isLetter(ch)) {
                        counts[ch - 'a']++;
                    } else {
                        throw new IllegalArgumentException(
                                "Word is containing non-alphabetic symbols. Ignoring the word");
                    }
                }

                System.out.println("\tHere are the letters:");

                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] != 0)
                        System.out.println((char) (i + 'a') + ": " + counts[i]);

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        } while (true);

        scan.close();

    }
}

