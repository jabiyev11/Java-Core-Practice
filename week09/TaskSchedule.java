import java.util.Comparator;
import java.util.PriorityQueue;

class Task {
    String name;
    int priority;
    int duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Task[ " + name + ", " + priority + ", " + duration + "]";
    }
}

class TaskComparator implements Comparator<Task> {
    public int compare(Task t1, Task t2) {
        if (t1.priority != t2.priority) {
            return Integer.compare(t2.priority, t1.priority);
        }
        // In case of two different tasks have the exact priority,
        // the one with less duration will come first
        else {
            return Integer.compare(t1.duration, t2.duration);
        }
    }
}

public class TaskSchedule {
    public static void main(String[] args) {
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>(new TaskComparator());
        PriorityQueue<Task> remainingTasks = new PriorityQueue<>(new TaskComparator());

        priorityQueue.add(new Task("Task1", 4, 12));
        priorityQueue.add(new Task("Task2", 1, 8));
        priorityQueue.add(new Task("Task3", 9, 20));
        priorityQueue.add(new Task("Task4", 2, 4));
        priorityQueue.add(new Task("Task5", 4, 7));
        priorityQueue.add(new Task("Task6", 2, 3));
        priorityQueue.add(new Task("Task7", 3, 7));

        int availableTime = 50;
        int timeSpent = 0;

        System.out.println("Tasks that will be done: ");
        while (!priorityQueue.isEmpty() && availableTime > 0) {
            Task currentTask = priorityQueue.poll();
            if (availableTime > currentTask.duration) {
                System.out.println(currentTask);
                availableTime -= currentTask.duration;
                timeSpent += currentTask.duration;
            } else {
                remainingTasks.add(currentTask);
            }

        }

        System.out.println("Remaining Tasks: " + remainingTasks);
        System.out.println("Time that is available at the end "+ availableTime);
        System.out.println("Overall spent time " + timeSpent);  

    }
}
