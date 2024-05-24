import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    Map<String, Set<Character>> cache = new HashMap<>();

    public Set<Character> getUniqueChar(String inputString) {
        if (cache.containsKey(inputString)) {
            return cache.get(inputString);
        }

        else {
            Set<Character> uniqueChar = new HashSet<Character>();
            for (char c : inputString.toCharArray()) {
                uniqueChar.add(c);
            }

            cache.put(inputString, uniqueChar);
            return uniqueChar;

        }
    }


    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();
        String input = "Alabama";

        System.out.println(uniqueWords.getUniqueChar(input)); // First call
        System.out.println(uniqueWords.getUniqueChar(input));  // gets cached version

        String input2 = "Oklahoma";

        System.out.println(uniqueWords.getUniqueChar(input2));  //First call 
    }

}
