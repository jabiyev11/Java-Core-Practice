package week04;
import java.util.Scanner;

public class SubString{
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = sc.nextLine();

        System.out.print("Enter the String: ");
        String subString = sc.nextLine();

        sc.close();

        System.out.println("Index: " + isSubstring(string, subString));


    }

    public static int isSubstring(String string, String sub){
            int differenceIndex = string.length() - sub.length();
            int index = -1;
            for(int i = 0; i <= differenceIndex; i++){

                String substring = string.substring(i, i + sub.length());

                if(substring.equals(sub)){
                    return i;
                }
            }
            return index;
    }
}
