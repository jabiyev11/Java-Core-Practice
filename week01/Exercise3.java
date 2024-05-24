public class Exercise3 {
    public static void main(String[] args){

        int first_number = 4;
        long second_number = 3L; 
        float third_number = 8.8f;
        float sum_of_numbers = first_number + second_number + third_number;
        // new variable which will be the sum of the numbers must be of the float data type(or double)
        //cause of the floating point part(in case of int or long we will lose the part after the whole number)
        // in case of int and long, the answer will be 15 instead of 15.8, which is incorrect
        System.out.println(sum_of_numbers);
    }
}
