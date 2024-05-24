package distinct;
import java.util.*;

public class DistinctWordsSorted {
    public static void main(String[] args) {
        String[] names = {"Javid", "Murad", "Elgun", "Ayal", "Mahammad", "Polad", "Javid", "Ayal"};
        Set<String> sortedNames = new TreeSet<>(Arrays.asList(names));
        String[] sortedArray = sortedNames.toArray(new String[0]);

        System.out.println(Arrays.toString(sortedArray));
    }
}
