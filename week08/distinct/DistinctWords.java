package distinct;
import java.util.*;

public class DistinctWords {
    public static void main(String[] args) {
        String[] names = {"Javid", "Murad", "Elgun", "Ayal", "Mahammad", "Polad", "Javid", "Ayal"};
        Set<String> distinctNames = new LinkedHashSet<>(Arrays.asList(names));
        String[] distinctArray = distinctNames.toArray(new String[0]);

        System.out.println(Arrays.toString(distinctArray));
    }
}
