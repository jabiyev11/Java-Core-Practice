import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        
        float maxNumber = -2000000.0f, minNumber = 2000000.0f;   // we also can use Float.MAX_VALUE and Float.MIN_VALUE
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextFloat()){
            float givenNumber = sc.nextFloat();
            if(givenNumber > maxNumber){
                maxNumber = givenNumber;
            }
            if(givenNumber < minNumber){
                minNumber = givenNumber;
            }
        }

        System.out.println("The maximum number is "+ maxNumber);
        System.out.println("The minimum number is "+ minNumber);

        sc.close();
    }
}
