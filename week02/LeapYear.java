import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int isLeapYear = sc.nextInt();

        if(isLeapYear % 4 == 0) {
            System.out.println(isLeapYear+ " is a leap year");
        
        }
        else {
            System.out.println(isLeapYear + " is not a leap year");
        }
        sc.close();
    }
}
