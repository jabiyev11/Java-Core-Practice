package week05;

public class MathDemo{

    public static int Min(int a, int b){

        return (a < b) ? a : b;
    }

    public static int Max(int a, int b){

        return (a > b) ? a : b;
    }

    public static int Sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
            return sum;
    }

    public static float Mean(int[] array){
        int sum = 0, cnt = 0;
        

        for(int i = 0; i < array.length; i++){
            sum += array[i];
            cnt++;
        }

        float average = (float) sum / cnt;
        return average;

    }

    public static int Factorial(int n){
        int h = 1;

        for(int i = 1; i <= n; i++){
            h *= i;
        }
        
        return h;
    }

    //Defining this methods with static keyword will enable us to use them in other methods
    //without creating an object of the class, since static methods belong to the class rather
    //than instance of the class. So, making them static methods will save memory and improve 
    //performance of our program. 


}