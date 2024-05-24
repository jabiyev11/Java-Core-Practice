public class Exercise5 {
    
    public static void main(String[] args){

        int number = 145;
       

        System.out.println("Decimal: " + number);
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        


        float float_number = 34.5324f;

        System.out.printf("Decimal floating point: %f\n", float_number);
        System.out.printf("Scientific notation: %e", float_number);
        
    }
}
