import java.util.*;

public class SortedItems {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(53, 123, 42, 11, 95, 1, 32);
        Collections.sort(list);
        System.out.println(list);

        List<Integer> list2 = Arrays.asList(53, 123, 42, 21, 85, 1, 32);
        list2.sort(null);
        System.out.println(list2);

        //by creating instance of anonymous class
        List<Integer> list3 = Arrays.asList(41, 1233, 42, 21, 80, 1, 32);
        Collections.sort(list3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list3);


        //by creating concrete class and implementing Comparator
        List<Integer> list4 = Arrays.asList(41, 133, 42, 11, 1000, 1, 32);
        list4.sort(new IntegerComparator());
        System.out.println(list4);
    }
         public static class IntegerComparator implements Comparator<Integer>{
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }
    
}
