import java.util.HashMap;
import java.util.Map;

public class CachingResults {

    private Map<String, Character[]> cache = new HashMap<>();

    public Character[] mostLeastFrequent(String inputString) {
        if (cache.containsKey(inputString)) {
            return cache.get(inputString);
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        Character mostFrequentChar = null;
        Character leastFrequentChar = null;
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentChar = entry.getKey();
                maxFrequency = entry.getValue();
            }

            if (entry.getValue() < minFrequency) {
                leastFrequentChar = entry.getKey();
                minFrequency = entry.getValue();
            }

        }

        Character[] result = { mostFrequentChar, leastFrequentChar };
        cache.put(inputString, result);

        return result;
    }

    public static void main(String[] args) {
        
        CachingResults cr = new CachingResults();
        String inputString = "Alabama";
        Character[] mostLeastFreq = cr.mostLeastFrequent(inputString);
        System.out.println("Most Frequent character: " + mostLeastFreq[0]);
        System.out.println("Least Frequent character: " + mostLeastFreq[1]);

        mostLeastFreq = cr.mostLeastFrequent(inputString);
        System.out.println("Most Frequent character (cached): " + mostLeastFreq[0]);
        System.out.println("Least Frequent character(cached): " + mostLeastFreq[1]);
    }
}
