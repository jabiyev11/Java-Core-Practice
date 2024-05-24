package week10;

import java.util.Arrays;

import geometry.Point;

class Task {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task: " + name;
    }

}
// I will use Point class from previous week

public class GenericMethods {

    // b Method to print elements of the array

    public static <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    // c Overloading the print method with starting and ending index

    public static <T> void printArray(T[] array, int start, int end) {
        if (start < 0 || end > array.length || start > end) {
            throw new IndexOutOfBoundsException("Incorrect interval of indexes");
        }
        for (int i = start; i < end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // d overloading so that it will print to tasks elements in the same line
    public static void printArray(Task[] tasks) {
        if (tasks.length % 2 != 0) {
            throw new IllegalArgumentException("Length of array must be even number to print them in pairs");
        }
        for (int i = 0; i < tasks.length; i += 2) {
            System.out.println(tasks[i] + " " + tasks[i + 1]);
        }
    }

    // e generic method to return the middle element of an array
    public static <T> T getMiddleElement(T[] array) {
        
        return array[array.length / 2];
    }

    // f generic method to return the maximum value in the array
    public static <T extends Comparable<T>> T getMaxElement(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // g generic bubble sorting method
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            T temp;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    // i generic method to swap two elements in the array
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        // a
        Integer[] integerArray = { 11, 12, 14, 15, 16 };
        Double[] doubleArray = { 12.2, 14.2, 17.8 };
        String[] stringArray = { "Murad", "Javid", "Orxan" };
        Point[] pointArray = { new Point(0, 1), new Point(1, 1), new Point(4, 1), new Point(0, 9) };
        Task[] taskArray = { new Task("Task1"), new Task("Task2"), new Task("Task3"), new Task("Task4") };

        System.out.println("Print Arrays: ");
        printArray(integerArray);
        printArray(doubleArray);
        printArray(stringArray);
        printArray(pointArray);
        printArray(taskArray);

        System.out.print("Printing elements in a range: ");
        printArray(stringArray, 0, 2);

        System.out.print("Print tasks in pair: ");
        printArray(taskArray);

        System.out.print("Print the middle element of an array: ");
        System.out.println(getMiddleElement(stringArray));

        System.out.print("Get the maximum element in the array: ");
        System.out.println(getMaxElement(doubleArray));

        System.out.print("Sorted version of an array: ");
        bubbleSort(integerArray);
        printArray(integerArray);

        System.out.print("Swap certain elements: ");
        swap(stringArray, 0, 2);
        printArray(stringArray);

    }
}
