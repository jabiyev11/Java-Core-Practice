public class Exercise4 {
    public static void main(String[] args){

        float first_number = 1/5f;
        float second_number = 2/3f;
        float third_number = 3/10f;

        float result = first_number * second_number - third_number;
        System.out.println(result);
        System.out.print(result);
        System.out.printf("%f", result);

        //There are certain differences between them. println: after printing what is written goes to next line(as in \n)
      //print: After printing what is written stays in the same line. printf: it is similar to C style printing and requires format sign 
      //for specifying the data type of the variable(e.g. for floating point numbers %f is the format specifier) and instead of (+ variable_name) 
      //its structure would be ("%x" , variable_name)
    }
}
