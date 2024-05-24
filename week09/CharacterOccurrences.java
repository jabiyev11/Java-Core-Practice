import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String input = args[0];

        Map<Character, List<Integer>> occurrences = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!occurrences.containsKey(c)) {
                occurrences.put(c, new ArrayList<>());
            }
            occurrences.get(c).add(i);
        }

        System.out.println("Non-descending order: ");
        for (Map.Entry<Character, List<Integer>> entry : occurrences.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Indexes: " + entry.getValue());
        }

        System.out.println("\nNon-ascending order: ");
        Comparator<Character> reverseComparator = new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return c2.compareTo(c1);
            }
        };

        Map<Character, List<Integer>> descendingOccurrences = new TreeMap<>(reverseComparator);
        descendingOccurrences.putAll(occurrences);

        for (Map.Entry<Character, List<Integer>> entry : descendingOccurrences.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Indexes: " + entry.getValue());
        }

    }
}
