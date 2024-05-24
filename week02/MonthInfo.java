import java.util.Scanner;
public class MonthInfo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfMonth = sc.nextInt();

        String tempNumber = "";

        switch (numberOfMonth) {
            case 1:
                tempNumber = "January 31";
                break;
            case 2:
                tempNumber = "February 28";
                break;
            case 3:
                tempNumber = "March 31";
                break;
            case 4:
                tempNumber = "April 30";
                break;
            case 5:
                tempNumber = "May 31";
                break;
            case 6:
                tempNumber = "June 30";
                break;
            case 7:
                tempNumber = "July 31";
                break;          
            case 8:
                tempNumber = "August 31";
                break;
            case 9:
                tempNumber = "September 30";
                break;
            case 10: 
                tempNumber = "October 31";
                break;
            case 11: 
                tempNumber = "November 30";
                break;
            case 12: 
                tempNumber = "December 31";
                break;        
            default:
               System.out.println(numberOfMonth + " is not recognized as a month number");
                break;
            
        }
        System.out.println(tempNumber);

        sc.close();
    }
}
