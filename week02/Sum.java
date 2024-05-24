import java.util.Scanner;
public class Sum{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
         
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();
        int sum = first_number + second_number;
        System.out.println(sum);

        sc.close();
    }
}