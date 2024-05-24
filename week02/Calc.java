public class Calc{
    public static void main(String[] args){

        int first_number = Integer.parseInt(args[0]);
        int second_number = Integer.parseInt(args[1]);
        System.out.println(first_number + second_number);
        System.out.println(first_number - second_number);
        System.out.println(first_number * second_number);
        System.out.println(first_number / second_number);
        System.out.println(first_number % second_number);
    }
}
