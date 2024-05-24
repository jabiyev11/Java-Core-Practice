package week04;

import java.util.Scanner;

public class GreatAndSmall {

    public static void main(String[] args){

        //Using command line input as asked in I point
        int[] array = new int[args.length];

            for(int i = 0; i < args.length; i++){
                array[i] = Integer.parseInt(args[i]);
            }

        int min = findMinimum(array);
        int max = findMaximum(array);

        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);
        
            
        // Using Scanner as asked in II point
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int elementCount = sc.nextInt();
        int[] array2 = new int[elementCount];

            System.out.print("Enter the elements of the array: ");
            for(int i = 0; i < elementCount; i++){
                array2[i] = sc.nextInt();
            }

            sc.close();

        int min2 = findMinimum(array);
        int max2 = findMaximum(array);

        System.out.println("Maximum value is: " + max2);
        System.out.println("Minimum value is: " + min2);

    }
    
    private static int findMaximum(int[] array){
        int maximum = -20000;
        for(int i = 0; i < array.length; i++){
            if(maximum < array[i]) {
                maximum = array[i];
            }
        }

        return maximum;
    }

    private static int findMinimum(int[] array){
        int minimum = 200000;
        for(int j = 0; j < array.length; j++){
            if(minimum > array[j]){
                minimum = array[j];
            }
        }
        return minimum;
    }

    private static int[] findMinAndMax(int[] array){
        int[] minMax = new int[array.length];

        minMax[0] = 2000000;   // minimum number
        minMax[1] = -2000000; // maximum number
        for(int z = 0; z < array.length; z++){
            if(minMax[0] > array[z]) minMax[0] = array[z];
            if(minMax[1] < array[z]) minMax[1] = array[z];
        }

        return minMax;  
    }
}
