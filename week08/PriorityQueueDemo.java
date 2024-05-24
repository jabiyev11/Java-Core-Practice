import java.util.Comparator;
import java.util.PriorityQueue;


public class PriorityQueueDemo {
    public static void main(String[] args) {

        class Person{
            String name;
            int breadRequested;

            public Person(String name, int breadRequested){
                this.name = name;
                this.breadRequested = breadRequested;
            }
        }

        Comparator<Person> byBreadRequested = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                    return Integer.compare(p1.breadRequested, p2.breadRequested);
            }
        }; 

        PriorityQueue<Person> queue = new PriorityQueue<>(byBreadRequested);

        queue.add(new Person("Javid", 5));
        queue.add(new Person("Murad", 3));
        queue.add(new Person ("Polad", 1));
        queue.add(new Person ("Nicat", 1));
        queue.add(new Person ("Elgun", 1));

        int peopleServed = 0;
        int breadInStore = 7;

        while (!queue.isEmpty() && breadInStore > 0) {
            Person currentPerson = queue.poll();
            if (currentPerson.breadRequested <= breadInStore) {
                breadInStore -= currentPerson.breadRequested;
                peopleServed++;
            }
            else{
                break;
            }
        }

        System.out.println("The number of people served: " + peopleServed);

    }
}

