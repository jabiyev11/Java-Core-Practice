import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        int[] breadPerPerson = { 2, 3, 1, 3, 4 };
        int breadInStore = 7;

        Queue<String> queue = new LinkedList<>();

        queue.add("Javid");
        queue.add("Murad");
        queue.add("Polad");
        queue.add("Nicat");
        queue.add("Elgun");

        int peopleServed = 0;
        while (!queue.isEmpty() && breadInStore > 0) {
            int breadRequested = breadPerPerson[peopleServed];
            if (breadRequested <= breadInStore) {
                queue.poll();
                breadInStore -= breadRequested;
                peopleServed++;
            }
            else{
                break;
            }
        }

        System.out.println("The number of people served: " + peopleServed);

    }
}
