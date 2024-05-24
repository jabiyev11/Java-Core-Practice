
public class Fact {
    public static void main(String[] args){
       
        int firstNumber = Integer.parseInt(args[0]);

        if(firstNumber < 0){
            System.out.println("Error: Negative numbers do not have factorials");
        }
        
        int h = 1;
        for(int i = 1; i <= firstNumber; i++){

            h *= i;

        }

        System.out.println(h);
    }
}
