package week10;

class Pair<K , V>{
    private final K key;
    private final V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;

    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }
}

public class GenericPairs {
    public static void main(String[] args) {
        Pair<Integer, String> genericPair = new Pair<>(19615, "Javid Jabiyev");
        Pair<Integer, Double> genericPair2 = new Pair<>(123, 123.0);

        System.out.println("Pair 1: " + genericPair.getKey() + ", " + genericPair.getValue());
        System.out.println("Pair 2: " + genericPair2.getKey() + ", " + genericPair2.getValue());

        //Another way to print with toString() method
        //System.out.println(genericPair.toString());

    }
}
