import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortedLinkedList {


    public static void InsertOrder(List<Integer> list, int value) {
            int pos = 0;
            for(int i : list){
                if(value < i) break;
                pos++;
            }
            list.add(pos, value);
    }

    public static void main(String[] args) {
        List<Integer> sortedList1 = new LinkedList<>();

        long startTime = System.nanoTime();

        InsertOrder(sortedList1, 3);
        InsertOrder(sortedList1, 4);
        InsertOrder(sortedList1, 1);
        InsertOrder(sortedList1, 31);
        InsertOrder(sortedList1, 21);
        InsertOrder(sortedList1, 45);
        InsertOrder(sortedList1, 12);

        long endTime = System.nanoTime();

        System.out.println("Time spent to sort 1st list: " + (endTime - startTime));
        System.out.println("Sorted version of 1st list: " + sortedList1);
       
        List<Integer> sortedList2 = new LinkedList<>();

        long startTime2 = System.nanoTime();

        sortedList2.add(5);
        sortedList2.add(1);
        sortedList2.add(12);
        sortedList2.add(192);
        sortedList2.add(32);
        sortedList2.add(65);
        sortedList2.add(23);

        Collections.sort(sortedList2);

        long endTime2 = System.nanoTime();

        System.out.println("Time to spend for sorting 2nd list: " + (endTime2 - startTime2));
        System.out.println("Sorted version of 2nd list: " + sortedList2);
       

    }
}
